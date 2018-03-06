package com.example.s528772.program7;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by s528772 on 10/25/2017.
 */

public class BlackTeaFragment extends android.support.v4.app.Fragment {
    private static final String TAG ="BlackTeaFragment";



    public BlackTeaFragment() {
    }

    public interface BlackT{
        void calculate();
//        void clear();
        void time();
    }


    private BlackT activity;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (BlackT) context;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {






        final View view = inflater.inflate(R.layout.fragment_black_tea,container,false);


        Button btn = (Button) view.findViewById(R.id.Calculate);
        btn.setOnClickListener(new Button.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       activity.calculate();
                                       ;
                                   }
                               });

//        Button btn1 = (Button) view.findViewById(R.id.clear);
//        btn1.setOnClickListener(new Button.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                activity.clear();
//            }
//            });



        Button btn2 = (Button) view.findViewById(R.id.button2);
        btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                activity.time();

            }


        });
        return view;
    }
}
