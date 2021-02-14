package com.example.ecuacingrado2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText Val1;
    private EditText Val2;
    private EditText Val3;
    private TextView Respuesta1;
    private TextView Respuesta2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Val1 =(EditText) findViewById(R.id.etA);
        Val2 =(EditText) findViewById(R.id.etB);
        Val3 =(EditText) findViewById(R.id.etC);
        Respuesta1 =(TextView) findViewById(R.id.tvRespuesta1);
        Respuesta2 =(TextView) findViewById(R.id.tvRespuesta2);
    }

    public void Calcuar(View view)
    {
        Float A = Float.parseFloat(Val1.getText().toString());
        Float B = Float.parseFloat(Val2.getText().toString());
        Float C = Float.parseFloat(Val3.getText().toString());
        double Opt1 = ( -B + Math.sqrt((B*B)-4*A*C))/(2*A);
        double Opt2 = ( -B - Math.sqrt((B*B)-4*A*C))/(2*A);
        Respuesta1.setText("Opción 1: " +Opt1);
        Respuesta2.setText("Opción 2: " +Opt2);
    }
}