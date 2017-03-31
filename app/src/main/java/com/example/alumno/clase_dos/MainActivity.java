package com.example.alumno.clase_dos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Modelo M = new Modelo("Otro texto");

        Vista V = new Vista(this, M);

        Controlador C = new Controlador(new MyListener(V));

        View.OnClickListener listener = new MyListener((ICambiarTexto)this);




    }
}
