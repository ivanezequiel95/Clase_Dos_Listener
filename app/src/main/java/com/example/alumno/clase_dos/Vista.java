package com.example.alumno.clase_dos;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by alumno on 30/03/2017.
 */

public class Vista implements ICambiarTexto{

    private Activity activityOrigen;

    private TextView tv;
    private Button bt1;
    private Button bt2;
    public Vista(Activity activityOrigen, Modelo modelo)
    {
        this.activityOrigen = activityOrigen;

        tv = (TextView) activityOrigen.findViewById(R.id.txtsaludo);

        bt1 = (Button) activityOrigen.findViewById(R.id.bt1);
        bt1.setText(modelo.unTexto);

        bt2 = (Button) activityOrigen.findViewById(R.id.bt2);
        cambiarTexto("Click 2", bt2);


        bt1.setOnClickListener(new MyListener(this));
        bt2.setOnClickListener(new MyListener(this));
    }




    public void cambiarTexto()
    {
        TextView tv = (TextView) activityOrigen.findViewById(R.id.txtsaludo);
        tv.setText("Se hizo Click en el boton "+ R.id.txtsaludo);
    }

    public void cambiarTextoBtn(String s, Button btn)
    {
        btn.setText(s);
    }
}
