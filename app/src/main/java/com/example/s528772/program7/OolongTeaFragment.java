package com.example.s528772.program7;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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

public class OolongTeaFragment extends Fragment {
    private static final String TAG ="OolongTeaFragment";

    public OolongTeaFragment() {
    }

    public interface OolongT{
        void clr();
        void cal();
        void Otime();
    }

    private OolongT act;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        act = (OolongT) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_oolong_tea,container,false);

        Button btn = (Button) view.findViewById(R.id.cal);
        btn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
               act.cal();

            }
        });

        Button btn1 = (Button) view.findViewById(R.id.clr);
        btn1.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                act.clr();
            }
        });

        Button btn2 = (Button) view.findViewById(R.id.button);
        btn2.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                act.Otime();
            }
        });




        return view;

    }

}
