package com.example.alumno.clase_dos;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 23/03/2017.
 */

public class MyListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bt1)
            Log.d("Mensaje","Boton1");
        else
            Log.d("Mensaje","Otro Boton");
    }
}
