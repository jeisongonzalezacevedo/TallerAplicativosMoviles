package com.example.sueldomes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText Nombre;
    private EditText Apellido;
    private EditText Nacimiento;
    private EditText Ingreso;
    private EditText Sueldo;
    private EditText Extras;
    private TextView Respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre = (EditText) findViewById(R.id.etNombre);
        Apellido = (EditText) findViewById(R.id.etApellido);
        Nacimiento = (EditText) findViewById(R.id.etNacimiento);
        Ingreso = (EditText) findViewById(R.id.etIngreso);
        Sueldo = (EditText) findViewById(R.id.etSueldo);
        Extras = (EditText) findViewById(R.id.etExtras);
        Respuesta = (TextView) findViewById(R.id.tvRespuesta);
    }

    public void Calcular(View view)
    {
        int misExtras = Integer.parseInt(Extras.getText().toString());

        if (misExtras > 0)
        {
            double porcentaje = 0.02;
            double suel = new Double (Sueldo.getText().toString());
            double he = new Double (Extras.getText().toString());
            Respuesta.setText("El total a pagar es: " + ((suel)+((suel * porcentaje) * he)));
            Toast.makeText(this, "El total a pagar es: " +this.Respuesta.getText().toString(), Toast.LENGTH_SHORT).show();
        }
        else
            {
                Sueldo = (EditText)findViewById(R.id.etSueldo);
                Respuesta.setText("" +Sueldo);
                Toast.makeText(this, "No realizó horas extra el total a pagar: " +this.Respuesta.getText().toString(), Toast.LENGTH_SHORT).show();
            }
    }
}