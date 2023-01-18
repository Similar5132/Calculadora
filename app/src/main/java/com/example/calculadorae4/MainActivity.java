package com.example.calculadorae4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edt1, edt2;
    private TextView tv1;
    private CheckBox check1, check2, check3, check4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Creado por Similar", Toast.LENGTH_LONG).show();

        edt1 = (EditText) findViewById(R.id.txt_num1);
        edt2 = (EditText) findViewById(R.id.txt_num2);

        tv1 = (TextView) findViewById(R.id.tv_resultado);

        check1 = (CheckBox) findViewById(R.id.checkSumar);
        check2 = (CheckBox) findViewById(R.id.checkRestar);
        check3 = (CheckBox) findViewById(R.id.checkMultiplicar);
        check4 = (CheckBox) findViewById(R.id.checkDividir);


    }

    //Creacion del metodo CALCULAR

    public void Calcular(View view) {
        String num1_string = edt1.getText().toString();
        String num2_string = edt2.getText().toString();

        int num1_int = Integer.parseInt(num1_string);
        int num2_int = Integer.parseInt(num2_string);

        String resultado = "";

        if (num1_int == 0 && num2_int == 0) {
            Toast.makeText(this, "El numero debe ser distinto de Cero", Toast.LENGTH_LONG).show();

        }

        if (check1.isChecked() == true) {
            int suma = num1_int + num2_int;
            resultado = "Suma: " + suma + " |";
        }


        if (check2.isChecked() == true) {
            int resta = num1_int - num2_int;
            resultado = resultado + " Resta: " + resta + "   ";


        }
        if (check3.isChecked() == true) {
            int multi = num1_int * num2_int;
            resultado = resultado + "Multiplicación: " + multi + " |";

        }

        if (check4.isChecked() == true) {
            int div = num1_int / num2_int;
            resultado = resultado + " División: " + div;


        }

        tv1.setText(resultado);
    }
}