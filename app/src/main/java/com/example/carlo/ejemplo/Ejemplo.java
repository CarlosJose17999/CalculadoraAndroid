package com.example.carlo.ejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Ejemplo extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo);

        num1= (EditText)findViewById(R.id.txt_num1);
        num2=(EditText)findViewById(R.id.txt_num2);
        res=(TextView)findViewById(R.id.txt_resultado);
    }

    //Este metodo realiza la suma
    public void sumar(View view){
        String valor1=num1.getText().toString();
        String valor2=num2.getText().toString();

        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        int suma=n1+n2;

        String resul=suma +"";
        res.setText(resul);
    }
    public void resta(View view){
        String valor1=num1.getText().toString();
        String valor2=num2.getText().toString();

        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        int resta=n1-n2;

        String resul=resta +"";
        res.setText(resul);
    }
    public void mult(View view){
        String valor1=num1.getText().toString();
        String valor2=num2.getText().toString();

        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        int mult=n1*n2;

        String resul=mult +"";
        res.setText(resul);
    }
    public void div(View view){
        String valor1=num1.getText().toString();
        String valor2=num2.getText().toString();

        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        int div=n1/n2;

        String resul=div +"";
        res.setText(resul);
    }

}
