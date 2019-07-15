package com.example.mya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bmi extends AppCompatActivity {

    EditText editName, editAge, editHeight, editWeight;
    Button button;
    TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        editName=(EditText)findViewById(R.id.editName);
        editAge=(EditText)findViewById(R.id.editAge);
        editHeight=(EditText)findViewById(R.id.editHeight);
        editWeight=(EditText)findViewById(R.id.editWeight);
        button=(Button)findViewById(R.id.button);
        txtResult=(TextView)findViewById(R.id.txtResult);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double kg=Double.parseDouble(editWeight.getText().toString());
                double height= Double.parseDouble(editHeight.getText().toString())/100;
                double bmi=kg/(height*height);
                String result="";
                if(bmi<18.5){
                    result="UNDERWEIGHT";
                }
                else if(bmi>=18.5 && bmi<24.9){
                    result="NORMAL";
                }else if(bmi>=25 && bmi<29.9){
                    result="OVERWEIGHT";

                }else if(bmi>=30 && bmi<34.9){
                    result="OBESE";
                }else if(bmi>35){
                    result="EXTREMELY OBESE";
                }
                result=editName.getText().toString() + "weight is" + result + "bmi:" + bmi;
               // txtResult.setText(result);

               Intent intent = new Intent(Bmi.this, BmiResultActivity.class);
               BmiDTO dto = new BmiDTO();
               dto.setName(editName.getText().toString());
               dto.setAge(Integer.parseInt(editAge.getText().toString()));
               dto.setHeight(Double.parseDouble(editHeight.getText().toString()));
               dto.setWeight(Double.parseDouble(editWeight.getText().toString()));
               dto.setResult(result);
               intent.putExtra("dto",dto);

                //intent.putExtra("name", editName.getText().toString());
                //intent.putExtra("age", Integer.parseInt(editAge.getText().toString()));
                //intent.putExtra("height",Double.parseDouble(editWeight.getText().toString()));
                //intent.putExtra("weight",Double.parseDouble(editWeight.getText().toString()));
                //intent.putExtra("result", result);
                startActivity(intent);
            }
        });


    }
}
