package com.example.basic_coviddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class breatheActivity extends AppCompatActivity {

    CheckBox breathe;
    Button next;
    Sympotoms sympotoms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breathe);

        breathe=findViewById(R.id.breathe);
        next=findViewById(R.id.next);
        sympotoms=new Sympotoms();

        breathe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked=((CheckBox)view).isChecked();
                sympotoms.setBreathe(checked);
                if(!checked)sympotoms.setBreathe(false);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(breatheActivity.this,ConclusionActivity.class));
            }
        });

    }
}
