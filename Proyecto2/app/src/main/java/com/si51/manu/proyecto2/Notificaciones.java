package com.si51.manu.proyecto2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Notificaciones extends Fragment {

   public View onCreateView(LayoutInflater inflater, ViewGroup conteiner, Bundle savedInstanceState){
       View viewRoot = inflater.inflate(R.layout.activity_notificaciones, conteiner,false);
       return viewRoot;
   }
}
