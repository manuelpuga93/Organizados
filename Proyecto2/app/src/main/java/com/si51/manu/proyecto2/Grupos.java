package com.si51.manu.proyecto2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Grupos extends Fragment {

    public View onCreateView(LayoutInflater inflster, ViewGroup conteiner, Bundle savesInstanceState){
        View viewRoot = inflster.inflate(R.layout.activity_grupos, conteiner, false);
        return viewRoot;
    }


}
