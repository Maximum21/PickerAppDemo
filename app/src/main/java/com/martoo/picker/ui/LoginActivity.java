package com.martoo.picker.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.martoo.picker.Constant;
import com.martoo.picker.R;
import com.martoo.picker.SharedPrefHelper;
import com.martoo.picker.Utility;
import com.martoo.picker.models.User;
import com.martoo.picker.service.NetworkUtils;
import com.woocom.Woocommerce;
import com.woocom.models.Customer;
import com.woocom.models.Metadata;
import com.woocom.models.filters.CustomerFilter;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    private Context context;
    private EditText editTextPassword;
    private EditText editTextUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        context = this;
        editTextUsername = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);

        editTextUsername.requestFocus();

        ImageView imgBack = findViewById(R.id.img_back);
        imgBack.setOnClickListener(view -> onBackPressed());

        AppCompatButton btnSignIn = findViewById(R.id.user_sign_in_button);
        btnSignIn.setOnClickListener(view -> loginAuth());

    }

    private void loginAuth() {
        Utility.INSTANCE.hideKeyboard(this);

        try {
            String username = editTextUsername.getText().toString();
            String password = editTextPassword.getText().toString();

            if (editTextUsername.getText().toString().isEmpty()) {
                editTextUsername.setError("Please input username");
            } else if (editTextPassword.getText().toString().isEmpty()) {
                editTextPassword.setError("Please input password");
            } else {
                NetworkUtils.getInstance().requestLogin(context, username, password, response -> {
                    if (!response.contains("InternalError")) {
                        User user = new Gson().fromJson(response, new TypeToken<User>() {
                        }.getType());
                        Toast.makeText(context, "Successfully login !", Toast.LENGTH_SHORT).show();
                        addToSharePreferences(context, user);
                        SharedPrefHelper.writeString(context, Constant.email, username);
                        getCustomer(context);
                        startActivity(new Intent(context, ListingActivity.class));
                        finish();
                    } else {
                        Toast.makeText(context, "Not Valid", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loginAdmin() {
        Utility.INSTANCE.hideKeyboard(this);

        try {
            String username = editTextUsername.getText().toString();
            String password = editTextPassword.getText().toString();

            NetworkUtils.getInstance().requestLogin(context, username, password, response -> {
                if (!response.contains("InternalError")) {
                    User user = new Gson().fromJson(response, new TypeToken<User>() {
                    }.getType());
                    Toast.makeText(context, "Successfully login !", Toast.LENGTH_SHORT).show();
                    addToSharePreferences(context, user);
                    SharedPrefHelper.writeString(context, Constant.email, username);
                    startActivity(new Intent(context, ListingActivity.class));
                    finish();
                } else {
                    Toast.makeText(context, "Not Valid", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private boolean addToSharePreferences(Context context, User user) {
        SharedPrefHelper.writeString(context, Constant.user_name, user.getUser_nicename());
        SharedPrefHelper.writeString(context, Constant.user_email, user.getUser_email());
        SharedPrefHelper.writeString(context, Constant.token, user.getToken());
        return true;
    }

    public void getCustomer(Context context) {

        CustomerFilter filter = new CustomerFilter();
        String email = SharedPrefHelper.readString(context, Constant.email);
        if (email != null && !email.isEmpty()) {
            filter.setEmail(email);
        }
        Woocommerce woocommerce = Utility.INSTANCE.getWooCommerce(SharedPrefHelper.readString(
                context,
                Constant.token
        ));
        Call<List<Customer>> test = woocommerce.CustomerRepository().customers(filter);
        test.enqueue(new Callback<List<Customer>>() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(@NotNull Call<List<Customer>> call, @NotNull Response<List<Customer>> response) {

                if (response.code() == 200) {
                    if (response.body()!=null && response.body().size() > 0) {
                        Customer customer = response.body().get(0);

                        SharedPrefHelper.writeString(context, Constant.user_display_name, customer.firstName + " " + customer.lastName);
                        SharedPrefHelper.writeInteger(context, Constant.user_id, customer.getId());
                        SharedPrefHelper.writeString(context, Constant.f_name, customer.getFirstName());
                        SharedPrefHelper.writeString(context, Constant.l_name, customer.getLastName());
                        SharedPrefHelper.writeString(context, Constant.mobile, customer.getBillingAddress().getPhone());

                        if (customer.getMeta_data().size() > 0) {
                            for (Metadata m : customer.getMeta_data()) {
                                if (m.getKey().equals("notification_status")) {
                                    SharedPrefHelper.writeString(context, Constant.notification, String.valueOf(m.getValue()));
                                }
                            }
                        }

                    } else {
                        Toast.makeText(context, R.string.login_permission_message, Toast.LENGTH_LONG).show();
                        ((AppCompatActivity) context).finish();
                    }
                }else{
                    Log.e("testingcustomer","error code"+response.code());
                }
            }

            @Override
            public void onFailure(@NotNull Call<List<Customer>> call, @NotNull Throwable t) {
                Toast.makeText(context, "Failed ... Please check your network !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}