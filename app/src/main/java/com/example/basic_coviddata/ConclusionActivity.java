package com.example.basic_coviddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConclusionActivity extends AppCompatActivity {

    Button button,button2;
    int severity=0;
    Sympotoms sympotoms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conclusion);

        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);

        sympotoms=new Sympotoms();

//        if(sympotoms.getBreathe())severity+=1;
//        if(sympotoms.getCough())severity+=1;
//        if(sympotoms.getFever())severity+=1;
//        if(sympotoms.getTiredness())severity+=1;



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConclusionActivity.this,MainActivity.class));
                finish();
            }
        });

    }
}
