package com.example.kyrillos.myfitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BodyFatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_fat);
        findViewById(R.id.btnMale).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BodyFatActivity.this,BodyFatMaleActivity.class));
            }
        });

        findViewById(R.id.btnFemale).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BodyFatActivity.this,BodyFatFemaleActivity.class));
            }
        });

    }
}
