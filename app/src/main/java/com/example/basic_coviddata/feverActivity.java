package com.example.basic_coviddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class feverActivity extends AppCompatActivity {

    CheckBox fever;
    Button next;
    Sympotoms sympotoms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fever);

        next=findViewById(R.id.next);
        fever=findViewById(R.id.fever);
        sympotoms=new Sympotoms();

        fever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked=((CheckBox)view).isChecked();
                sympotoms.setFever(checked);
                if(!checked)sympotoms.setFever(false);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(feverActivity.this,tiredActivity.class));
            }
        });

    }
}
