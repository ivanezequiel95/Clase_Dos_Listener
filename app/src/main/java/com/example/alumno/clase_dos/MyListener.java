package com.example.alumno.clase_dos;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by alumno on 23/03/2017.
 */

public class MyListener implements View.OnClickListener {

    private ICambiarTexto iCambiarTexto;
    public MyListener(ICambiarTexto iCambiarTexto)
    {
        this.iCambiarTexto = iCambiarTexto;
    }

    @Override
    public void onClick(View v) {
        /*if (v.getId() == R.id.bt1)
            Log.d("Mensaje","Boton1");
        else
            Log.d("Mensaje","Otro Boton");*/
        iCambiarTexto.cambiarTexto();
    }

}
