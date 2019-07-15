package com.example.mya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mOnClick(View view){

       Intent intent=null;
       switch (view.getId()){
           case R.id.bottom1:
               intent = new Intent(this, About.class);
               break;
           case R.id.button2:
               intent = new Intent(this, Highlights.class);
               break;

           case R.id.button3:
               intent = new Intent(this, Education.class);
               break;

           case R.id.button4:
               intent = new Intent(this, Relatedwork.class);
               break;
           case R.id.button5:
               intent = new Intent(this, otherwork.class);
               break;

           case R.id.button6:
               intent = new Intent(this, Projects.class);
               break;

           case R.id.button7:
                   intent=new Intent(this,Bmi.class);

       }


   startActivity(intent);


    }

}
