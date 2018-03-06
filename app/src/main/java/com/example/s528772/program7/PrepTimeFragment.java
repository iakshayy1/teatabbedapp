package com.example.s528772.program7;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by s528772 on 10/26/2017.
 */

public class PrepTimeFragment extends android.support.v4.app.Fragment {

    public PrepTimeFragment() {
    }





    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_prep_time,container,false);

        return view;
    }
}
