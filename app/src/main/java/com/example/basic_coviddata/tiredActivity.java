package com.example.basic_coviddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class tiredActivity extends AppCompatActivity {

    CheckBox tired;
    Button next;
    Sympotoms sympotoms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tired);

        tired=findViewById(R.id.tired);
        next=findViewById(R.id.next);
        sympotoms=new Sympotoms();

        tired.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean check=((CheckBox)view).isChecked();
                sympotoms.setTiredness(1);
                if(!check)sympotoms.setTiredness(0);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tiredActivity.this,breatheActivity.class));
                finish();
            }
        });


    }
}
