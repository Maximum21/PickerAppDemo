package com.martoo.picker;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;

public class ProgressView {

    private Dialog dialog;
    private static ProgressView instance = null;

    public static ProgressView getInstance() {
        if (instance == null)
            instance = new ProgressView();

        return instance;
    }

    public void showProgressDialog(Context context) {
        dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_progress_view);

        dialog.getWindow().getDecorView().setBackgroundResource(android.R.color.transparent);
        dialog.getWindow().setDimAmount(0.0f);

        if (!dialog.isShowing()) {
            dialog.show();
        }
    }

    public void dismissDialog() {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
            dialog = null;
        }
    }
}

