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

    private Button boton;
    private EditText editText1, editText2;
    private RadioGroup radioGroup;
    private RadioButton radio1, radio2, radio3, radio4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.num1);
        editText2 = (EditText) findViewById(R.id.num2);
        boton = (Button) findViewById(R.id.boton);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radio1 = (RadioButton) findViewById(R.id.radio1);
        radio2 = (RadioButton) findViewById(R.id.radio2);
        radio3 = (RadioButton) findViewById(R.id.radio3);
        radio4 = (RadioButton) findViewById(R.id.radio4);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (editText1.getText().toString().isEmpty() || editText2.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "uno o mas campos están vacios", Toast.LENGTH_SHORT).show();

        } else if (radio1.isChecked() || radio2.isChecked() || radio3.isChecked() || radio4.isChecked()) {

            Intent explicit_intent;
            explicit_intent = new Intent(this, Main2Activity.class);
            int n1 = Integer.parseInt(editText1.getText().toString());
            int n2 = Integer.parseInt(editText2.getText().toString());
            int suma = 0, resta = 0, divo = 0, mult = 0;

            switch (radioGroup.getCheckedRadioButtonId()) {
                case R.id.radio1:
                    suma = n1 + n2;

                case R.id.radio2:
                    resta = n1 - n2;

                case R.id.radio3:
                    mult = n1 * n2;

                case R.id.radio4:
                    divo = n1 / n2;

            }

                        String sum = Integer.toString(suma);
                        String rest = Integer.toString(resta);
                        String multi = Integer.toString(mult);
                        String divs = Integer.toString(divo);

                        explicit_intent.putExtra("suma", sum);
                        explicit_intent.putExtra("resta", rest);
                        explicit_intent.putExtra("multip", multi);
                        explicit_intent.putExtra("divis", divs);
                        startActivity(explicit_intent);

                    } else {
                        Toast.makeText(MainActivity.this, "debe seleconar todas las opciones", Toast.LENGTH_SHORT).show();
                    }
            }
        }






















