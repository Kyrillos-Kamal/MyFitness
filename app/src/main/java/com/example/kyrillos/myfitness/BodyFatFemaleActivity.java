package com.example.kyrillos.myfitness;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BodyFatFemaleActivity extends AppCompatActivity {

    EditText bodyFatWeight,bodyFatHeight,bodyFatNeck,bodyFatButtocks,bodyFatMiddle;
    Button btnBodyFatResult;
    AlertDialog.Builder builder ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_fat_female);
        builder = new AlertDialog.Builder(this);

        bodyFatMiddle = findViewById(R.id.bodyFatMiddle);
        bodyFatWeight = findViewById(R.id.bodyFatWeight);
        bodyFatHeight = findViewById(R.id.bodyFatHeight);
        bodyFatNeck = findViewById(R.id.bodyFatNeck);
        bodyFatButtocks = findViewById(R.id.bodyFatButtocks);
        btnBodyFatResult = findViewById(R.id.btnBodyFatResult);


        btnBodyFatResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FatCalculate();
            }
        });
    }


    public void FatCalculate(){
        int Weight = Integer.parseInt(bodyFatWeight.getText().toString());
        int Height = Integer.parseInt(bodyFatHeight.getText().toString());
        int Neck = Integer.parseInt(bodyFatNeck.getText().toString());
        int Middle = Integer.parseInt(bodyFatMiddle.getText().toString());
        int Buttocks = Integer.parseInt(bodyFatButtocks.getText().toString());



        double FirstStep = (Weight * 732)+986.6;
        double SecondStep = Middle *157.1570;
        double ThirdStep = Buttocks * 249;


        double ResultMuscleMass = FirstStep + SecondStep + ThirdStep;

        double ResultBodyFatMass = ResultMuscleMass - Weight;
        builder.setTitle("Body Fat Result");
        builder.setMessage("Body Fat: "+ ResultBodyFatMass + "%");
        builder.setPositiveButton("Ok",null);
        builder.create().show();
    }
}
