package com.martoo.picker.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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

        editTextUsername.setText("asadkhan");
        editTextPassword.setText("$0kR3vVdsJoY@CmC%@TP06E4");

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

    private void addToSharePreferences(Context context, User user) {
        SharedPrefHelper.writeString(context, Constant.user_name, user.getUser_nicename());
        SharedPrefHelper.writeString(context, Constant.user_email, user.getUser_email());
        SharedPrefHelper.writeString(context, Constant.token, user.getToken());
    }
}