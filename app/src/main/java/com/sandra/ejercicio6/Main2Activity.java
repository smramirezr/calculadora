package com.sandra.ejercicio6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{


    private Button boton;
    private TextView resSuma, resResta, resMult, resDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        resSuma = (TextView) findViewById(R.id.resSuma);
        resResta = (TextView) findViewById(R.id.resResta);
        resMult = (TextView) findViewById(R.id.resMult);
        resDiv = (TextView) findViewById(R.id.resDiv);

        Intent intent=getIntent();
        Bundle extras = intent.getExtras();

        if (extras != null) {

            String sum=(String)extras.get("suma");
            String res = (String) extras.get("resta");
            String m = (String) extras.get("multip");
            String d = (String) extras.get("divis");

            resSuma.setText(sum);
            resResta.setText(res);
            resMult.setText(m);
            resDiv.setText(d);
            }
        }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}