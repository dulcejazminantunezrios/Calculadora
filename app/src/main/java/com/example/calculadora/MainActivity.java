package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    String cadena="";
    double resultado=0;
    double numero=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clicNumero(View view){
        TextView pantalla= findViewById(R.id.txt_resultado);
        switch (view.getId()) {
            case R.id.btn0:
                cadena = cadena + "0";
                pantalla.setText(cadena);
                break;
            case R.id.btn1:
                cadena = cadena + "1";
                pantalla.setText(cadena);
                break;
            case R.id.btn2:
                cadena=cadena+"2";
                pantalla.setText(cadena);
                break;
            case R.id.btn3:
                cadena=cadena+"3";
                pantalla.setText(cadena);
                break;
            case R.id.btn4:
                cadena=cadena+"4";
                pantalla.setText(cadena);
                break;
            case R.id.btn5:
                cadena=cadena+"5";
                pantalla.setText(cadena);
                break;
            case R.id.btn6:
                cadena=cadena+"6";
                pantalla.setText(cadena);
                break;
            case R.id.btn7:
                cadena=cadena+"7";
                pantalla.setText(cadena);
                break;
            case R.id.btn8:
                cadena=cadena+"8";
                pantalla.setText(cadena);
                break;
            case R.id.btn9:
                cadena=cadena+"9";
                pantalla.setText(cadena);
                break;
            case R.id.btn_decimal:
                cadena=cadena+".";
                pantalla.setText(cadena);
                break;
        }
        numero=Double.parseDouble(cadena);
    }
    public void clicoperacion(View view){
        TextView pantalla= findViewById(R.id.txt_resultado);
        switch(view.getId()){
            case R.id.btn_suma:
                if(cadena!="") {
                    if(resultado==0){
                        this.resultado= numero;
                    }else {
                        this.resultado = resultado + numero;
                    }
                }
                cadena="";
                pantalla.setText("0");
                break;
            case R.id.btn_resta:
                if(cadena!="") {
                    if(resultado==0){
                        this.resultado= numero;
                    }else {
                        this.resultado = resultado - numero;
                    }
                }
                cadena="";
                pantalla.setText("0");
                break;
            case R.id.btn_multi:
                if(cadena!="") {
                    if(resultado==0){
                        this.resultado= numero;
                    }else {
                        this.resultado = resultado * numero;
                    }
                }
                cadena="";
                pantalla.setText("0");
                break;
            case R.id.btn_div:
                if(cadena!="") {
                    if(resultado==0){
                        this.resultado= numero;
                    }else {
                        this.resultado = resultado / numero;
                    }
                }
                cadena="";
                pantalla.setText("0");
                break;
            case R.id.btn_porcent:
                if(cadena!="") {
                    if(resultado==0){
                        this.resultado= numero;
                      }
                    else {
                        this.resultado = resultado * (numero *0.01);
                    }
                }
                cadena="";
                numero=0;
                pantalla.setText("0");
                break;
            case R.id.btn_igual:
                pantalla.setText(String.valueOf(this.resultado));
                break;
            case R.id.btn_borrar:
                pantalla.setText("0");
                cadena="";
                resultado=0;
                numero=0;
                break;
        }
    }
}