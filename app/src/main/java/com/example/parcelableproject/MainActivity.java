package com.example.parcelableproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

   EditText  SName,SAge,SAddress,SCourse;

    Button SButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //i find a variable

        SName=findViewById(R.id.et_sname);
        SAge=findViewById(R.id.et_sage);
        SAddress= findViewById(R.id.et_saddress);
        SCourse=findViewById(R.id.et_scource);

        //find button
        SButton=findViewById(R.id.btn_ok);

        //add listener to button

        SButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Student class

                Student student= new Student(SName.getText().toString(),SAge.getText().toString(),
                        SAddress.getText().toString(),SCourse.getText().toString());

                //creating an intent to passing acticity

                Intent intent= new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("roy",student);
                startActivity(intent);


            }
        });


    }
}
