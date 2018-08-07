package com.example.kyrillos.myfitness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CaloriesCalculatorFemaleActivity extends AppCompatActivity {
    EditText btnCaloriesCalculatorAge,btnCaloriesCalculatorWeiht,btnCaloriesCalculatorHeight;
    Button btnCaloriesCalculatorResult;
    RadioGroup radioGroup;
    RadioButton EquationofMifflinSaint,EquationofHarrisBenedict;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories_calculator_female);
        textView = findViewById(R.id.CaloriesCalculatorResult);
        btnCaloriesCalculatorAge = findViewById(R.id.btnCaloriesCalculatorAge);
        btnCaloriesCalculatorWeiht = findViewById(R.id.CaloriesCalculatorWeiht);
        btnCaloriesCalculatorHeight = findViewById(R.id.CaloriesCalculatorHeight);
        btnCaloriesCalculatorResult = findViewById(R.id.btnCaloriesCalculatorResult);
        radioGroup =findViewById(R.id.radioGroup);
        EquationofMifflinSaint = findViewById(R.id.EquationofMifflinSaint);
        EquationofHarrisBenedict = findViewById(R.id.EquationofHarrisBenedict);


        btnCaloriesCalculatorResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaloriesResult();
            }
        });
    }


    public void CaloriesResult(){
        int Age,Weight,Height;
        double Result = 0;
        Age = Integer.parseInt(btnCaloriesCalculatorAge.getText().toString());
        Weight = Integer.parseInt(btnCaloriesCalculatorWeiht.getText().toString());
        Height = Integer.parseInt(btnCaloriesCalculatorHeight.getText().toString());

        if (EquationofHarrisBenedict.isChecked()){
            Result = Age * 7.4 * 1.9 * Height + (9.6 * Weight + 66.5) ;
        }
        if (EquationofMifflinSaint.isChecked()){
            Result = (10 * Weight) + (6.25 * Height) - (5 * Age) - 161 ;
        }
        textView.setText(String.valueOf(Result));
    }
}
