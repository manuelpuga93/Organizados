package com.si51.manu.proyecto2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Calendar extends Fragment{

    public View onCreateView(LayoutInflater inafleter, ViewGroup conteirner, Bundle savedInstanceState){
        View viewRoot = inafleter.inflate(R.layout.activity_calendar, conteirner, false);
        return viewRoot;
    }


}
