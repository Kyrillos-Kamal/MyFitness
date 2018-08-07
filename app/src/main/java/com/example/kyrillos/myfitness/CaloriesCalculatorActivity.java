package com.example.kyrillos.myfitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CaloriesCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories_calculator);

        findViewById(R.id.btnMale).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CaloriesCalculatorActivity.this,CaloriesCalculatorMaleActivity.class));
            }
        });

        findViewById(R.id.btnFemale).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CaloriesCalculatorActivity.this,CaloriesCalculatorFemaleActivity.class));
            }
        });
    }
}
