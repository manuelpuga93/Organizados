package com.si51.manu.proyecto2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class IniciaSssion extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicia_sssion);

    }

    public void enlace(View view) throws Exception{
        try {
            Intent enla = new Intent(this, Home.class);
            startActivity(enla);
        }catch (Exception e){
            e.printStackTrace();
            Toast.makeText(this,"No se que falla",Toast.LENGTH_SHORT).show();
        }
    }

   public void registro(View view){
       Intent regis = new Intent(Intent.ACTION_VIEW);
       regis.setData(Uri.parse("http://www.facebook.com"));
       startActivity(regis);
    }


}
