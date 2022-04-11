package com.example.currencyconverter20;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;


public class Calculator extends AppCompatActivity {

    boolean usd_to_lbp = true;
    float rate = 24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get exhange rate

        ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton);
        ToggleButton toggle2 = (ToggleButton) findViewById(R.id.toggleButton2);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toggle2.setChecked(false);
                    //Toast.makeText(getApplicationContext(), "toggle enabled", Toast.LENGTH_LONG).show();
                } else {
                    toggle2.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "toggle disabled", Toast.LENGTH_LONG).show();
                }
            }
        });

        toggle2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toggle.setChecked(false);
                    //Toast.makeText(getApplicationContext(), "toggle enabled", Toast.LENGTH_LONG).show();
                } else {
                    toggle.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "toggle disabled", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void convert (View v) {
        if (usd_to_lbp) {

        } else {

        }
    }

}
