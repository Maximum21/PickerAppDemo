package com.martoo.picker.service;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.JsonObject;
import com.koushikdutta.ion.Ion;
import com.koushikdutta.ion.builder.Builders;
import com.martoo.picker.Config;
import com.martoo.picker.Constant;
import com.martoo.picker.R;
import com.martoo.picker.SharedPrefHelper;
import com.martoo.picker.interfaces.ResponseListener;
import com.martoo.picker.ui.LoginActivity;
import com.martoo.picker.ui.MainActivity;

public class NetworkUtils {

    private static NetworkUtils networkUtils;

    private NetworkUtils() {

    }

    public static synchronized NetworkUtils getInstance() {
        if (networkUtils == null)
            synchronized (NetworkUtils.class) {
                if (networkUtils == null)
                    networkUtils = new NetworkUtils();
            }

        return networkUtils;
    }

    public void basicRequestGet(final Context context, String url, final ResponseListener listener) {
        Builders.Any.B bodyParams = Ion.with(context).load("GET", url);
        bodyParams.addHeader("Authorization", "Bearer " + SharedPrefHelper.readString(context, Constant.token));
        bodyParams.setTimeout(30 * 30 * 1000);

        bodyParams.asString().setCallback((e, result) -> {
            try {
                if (e != null) {
                    showError(context);
                } else {
                    if (listener != null) {
                        Log.d("url", url);
                        Log.d("response", result);
                        if (!result.contains("Expired or invalid JWT token") && !result.contains("InternalError"))
                            listener.onResponseReceived(result);
                        else
                            setLogin(context);
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }

    private void showError(Context context) {
        Toast.makeText(context, context.getString(R.string.network_issue), Toast.LENGTH_SHORT).show();
    }

    public void requestLogin(Context context, String email, String password, ResponseListener listener) {

        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Authenticating ...");
        progressDialog.show();

        Builders.Any.B bodyParams = Ion.with(context).load("POST", Config.INSTANCE.getLogin());
        bodyParams.addHeader("Content-Type", "application/json");
        bodyParams.setTimeout(30 * 30 * 1000);

        JsonObject obj = new JsonObject();
        obj.addProperty("username", email);
        obj.addProperty("password", password);

        bodyParams.setJsonObjectBody(obj);

        bodyParams.asString().setCallback((e, result) -> {
            progressDialog.dismiss();
            try {
                if (e != null) {
                    SharedPrefHelper.clearAll(context);
                    showError(context);
                } else {
                    if (listener != null) {
                        Log.d("login", result);
                        listener.onResponseReceived(result);
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }

    private void setLogin(Context context) {
        SharedPrefHelper.clearAll(context);
        context.startActivity(new Intent(context, LoginActivity.class));
        ((AppCompatActivity) context).finish();
    }

}
