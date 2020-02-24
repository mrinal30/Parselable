package com.example.parcelableproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    //
    //find variable
    TextView textView1,textView2,textView3,textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


//  data from a parcelable object passed from MainActivity object pass

        Student student= (getIntent().getParcelableExtra("roy"));
        // sir i find this variable
        textView1= findViewById(R.id.tv_sname);
        textView2= findViewById(R.id.tv_sage);
        textView3= findViewById(R.id.tv_saddress);
        textView4= findViewById(R.id.tv_scourse);

        if (student!=null){

            textView1.setText(student.mSName);
            textView2.setText(student.mSAge);
            textView3.setText(student.mSAddress);
            textView4.setText(student.mSCourse);

        }


    }
}
