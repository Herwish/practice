package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double distance;
    double calculated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText weight = (EditText) findViewById(R.id.weight);
        final RadioButton metersmiles = (RadioButton)findViewById(R.id.rad1);
        final TextView result = (TextView)findViewById(R.id.result);
        Button bttn = (Button)findViewById(R.id.button);
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                distance = Double.parseDouble(weight.getText().toString());
                DecimalFormat tenth = new DecimalFormat("#.#");
            if(metersmiles.isChecked()){
                calculated = distance/1000;
                result.setText(tenth.format(calculated) + " so little gay");
            }
            else{
                calculated = distance*1000;
                result.setText(tenth.format(calculated) + " so many gay");
            }
            }
        });
    }
}