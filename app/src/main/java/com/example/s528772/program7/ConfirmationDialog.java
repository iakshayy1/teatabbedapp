package com.example.s528772.program7;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;

/**
 * Created by s528772 on 10/26/2017.
 */

public class ConfirmationDialog extends android.support.v4.app.DialogFragment {
    public interface ClearConfirmCallback {
        void setCount();
    }

    private ClearConfirmCallback acty1;

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        acty1 = (ClearConfirmCallback) context;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        super.onCreateDialog(savedInstanceState);

        AlertDialog.Builder bdr = new AlertDialog.Builder(getActivity());

        bdr.setTitle("CLEAR");
        bdr.setMessage("Do you want to clear?");
        bdr.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                acty1.setCount();

            }
        });
        bdr.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return bdr.create();
    }
}

