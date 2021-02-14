package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText Digito1;
    EditText Digito2;

    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Digito1 = (EditText)findViewById(R.id.etNum1);
        Digito2 = (EditText)findViewById(R.id.etNum2);

        Button Suma = (Button) findViewById(R.id.btnSuma);
        Button Resta = (Button) findViewById(R.id.btnResta);
        Button Multiplicar = (Button) findViewById(R.id.btnMultiplicar);
        Button Dividir = (Button) findViewById(R.id.btnDividir);

        final TextView Resultado= (TextView) findViewById(R.id.tvResultado);

        Suma.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                float Val1 = new Float (Digito1.getText().toString());
                float Val2 = new Float (Digito2.getText().toString());
                Resultado.setText("El resultado es: "+(Val1 + Val2));
            }
        });

        Resta.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                float Val1 = new Float (Digito1.getText().toString());
                float Val2 = new Float (Digito2.getText().toString());
                Resultado.setText("El resultado es: "+(Val1 - Val2));
            }
        });

        Multiplicar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                float Val1 = new Float (Digito1.getText().toString());
                float Val2 = new Float (Digito2.getText().toString());
                Resultado.setText("El resultado es: "+(Val1 * Val2));
            }
        });

        Dividir.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                float Val1 = new Float (Digito1.getText().toString());
                float Val2 = new Float (Digito2.getText().toString());
                Resultado.setText("El resultado es: "+(Val1 / Val2));
            }
        });
    }
}