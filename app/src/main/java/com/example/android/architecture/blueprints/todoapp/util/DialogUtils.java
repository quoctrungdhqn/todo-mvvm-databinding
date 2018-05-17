package com.example.android.architecture.blueprints.todoapp.util;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.example.android.architecture.blueprints.todoapp.R;

public class DialogUtils {
    public static void showBasicDialog(Context context, DialogInterface.OnClickListener listener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.Theme_AppCompat_Light_Dialog_Alert);
        builder.setCancelable(false);
        builder.setTitle("Confirm");
        builder.setMessage("Are you want to delete?");
        builder.setPositiveButton("Yes", listener);
        builder.setNegativeButton("No", (dialog, which) -> dialog.dismiss());

        builder.create().show();
    }
}
