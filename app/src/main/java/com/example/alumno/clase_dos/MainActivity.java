package com.example.alumno.clase_dos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) super.findViewById(R.id.txtsaludo);

        Button bt1 = (Button) super.findViewById(R.id.bt1);
        bt1.setText("Click1");



        /*View.OnClickListener listener = new MyListener();
        bt1.setOnClickListener(listener);*/
    }
}
