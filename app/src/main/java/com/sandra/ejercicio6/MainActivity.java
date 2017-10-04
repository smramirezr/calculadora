package com.sandra.ejercicio6;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button boton, boton2;
    private EditText editText1, editText2;
    private RadioGroup radioGroup;
    private RadioButton radio1, radio2, radio3, radio4;
    private TextView sumar, restar, multiplicar, dividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.num1);
        editText2 = (EditText) findViewById(R.id.num2);
        boton = (Button) findViewById(R.id.boton);
        boton2 = (Button) findViewById(R.id.boton2);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radio1 = (RadioButton) findViewById(R.id.radio1);
        radio2 = (RadioButton) findViewById(R.id.radio2);
        radio3 = (RadioButton) findViewById(R.id.radio3);
        radio4 = (RadioButton) findViewById(R.id.radio4);
        sumar = (TextView) findViewById(R.id.suma);
        restar = (TextView) findViewById(R.id.resta);
        multiplicar = (TextView) findViewById(R.id.multiplicacion);
        dividir = (TextView) findViewById(R.id.division);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

                switch (view.getId()) {
                case R.id.boton2:
                    if (editText1.getText().toString().isEmpty()==false && editText2.getText().toString().isEmpty()==false) {

                        int n1 = Integer.parseInt(editText1.getText().toString());
                        int n2 = Integer.parseInt(editText2.getText().toString());
                        int suma = 0, resta = 0, divo = 0, mult = 0, total = 0;

                        if (radio1.isChecked()) {
                            suma = n1 + n2;
                            sumar.setText("" + suma);
                        }
                        if (radio2.isChecked()) {
                            resta = n1 - n2;
                            restar.setText("" + resta);
                        }
                        if (radio3.isChecked()) {
                            mult = n1 * n2;
                            multiplicar.setText("" + mult);
                        }
                        if (radio4.isChecked()) {
                            divo = n1 / n2;
                            dividir.setText("" + divo);
                        }
                        break;
                    }else{
                        Toast.makeText(MainActivity.this, "debe ingresar los valores", Toast.LENGTH_SHORT).show();
                    }
            case R.id.boton:
                if (sumar.getText().toString().isEmpty() || restar.getText().toString().isEmpty() || multiplicar.getText().toString().isEmpty() || dividir.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "debe elegir todas las opciones", Toast.LENGTH_SHORT).show();
                }else {
                    Intent explicit_intent;
                    explicit_intent = new Intent(this, Main2Activity.class);

                    String sum= String.valueOf(sumar.getText());
                    String rest= String.valueOf(restar.getText());
                    String multi= String.valueOf(multiplicar.getText());
                    String divs= String.valueOf(dividir.getText());

                    explicit_intent.putExtra("suma", sum);
                    explicit_intent.putExtra("resta", rest);
                    explicit_intent.putExtra("multip", multi);
                    explicit_intent.putExtra("divis", divs);
                    startActivity(explicit_intent);
                    break;
                }
        }
        }
    }


























