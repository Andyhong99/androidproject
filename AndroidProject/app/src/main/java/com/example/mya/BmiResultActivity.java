package com.example.mya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BmiResultActivity extends AppCompatActivity {
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_result);

        txtResult=(TextView)findViewById(R.id.txtResult);

        Intent intent = getIntent();
        BmiDTO dto=(BmiDTO)intent.getSerializableExtra("dto");
        String result = dto.getResult();
        String name = dto.getName();
        int age = dto.getAge();
        double height = dto.getHeight();
        double weight = dto.getWeight();


        //String result=intent.getStringExtra("result");
        //String name=intent.getStringExtra("name");
        //int age=intent.getIntExtra("age",0);
        //double height=intent.getDoubleExtra("height",0);
        //double weight=intent.getDoubleExtra("weight",0);

        txtResult.setText("Name : " + name +"\n"
                           + "Age : " + age + "\n"
                           +"Weight : " + weight + "\n"
                           +"Result : " + result
        );

    }
}
