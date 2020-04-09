package com.example.basic_coviddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class TestActivity extends AppCompatActivity {

    CheckBox cough;
    Button next;
    Sympotoms sympotoms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        cough=findViewById(R.id.cough);
        next=findViewById(R.id.next);
        sympotoms=new Sympotoms();

        if(cough.isChecked()){
            sympotoms.setCough(true);
        }

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TestActivity.this,feverActivity.class));
            }
        });

    }
}
