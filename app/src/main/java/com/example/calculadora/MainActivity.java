package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clicknumero(View view) {
        TextView resultado =(TextView) findViewById(R.id.txt_resultado);
        int numero;
        switch (view.getId()){
            case R.id.btn0:
                numero= 0;
                resultado.setText(resultado.getText().toString()+numero);
                break;
            case R.id.btn1:
                numero= 1;
                resultado.setText(+numero);
                resultado.setText(resultado.getText().toString()+numero);
                break;
            case R.id.btn2:
                numero= 2;
                resultado.setText(+numero);
                resultado.setText(resultado.getText().toString()+numero);
                break;
            case R.id.btn3:
                numero= 3;
                resultado.setText(+numero);
                resultado.setText(resultado.getText().toString()+numero);
                break;
            case R.id.btn4:
                numero= 4;
                resultado.setText(+numero);
                resultado.setText(resultado.getText().toString()+numero);
                break;
            case R.id.btn5:
                numero= 5;
                resultado.setText(+numero);
                resultado.setText(resultado.getText().toString()+numero);
                break;
            case R.id.btn6:
                numero= 6;
                resultado.setText(+numero);
                resultado.setText(resultado.getText().toString()+numero);
                break;
            case R.id.btn7:
                numero= 7;
                resultado.setText(+numero);
                resultado.setText(resultado.getText().toString()+numero);
                break;
            case R.id.btn8:
                numero= 8;
                resultado.setText(+numero);
                resultado.setText(resultado.getText().toString()+numero);
                break;
            case R.id.btn9:
                numero= 9;
                resultado.setText(+numero);
                resultado.setText(resultado.getText().toString()+numero);
                break;
        }
    }
}