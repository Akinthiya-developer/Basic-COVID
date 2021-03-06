package com.example.basic_coviddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import static android.view.View.GONE;

public class ConclusionActivity extends AppCompatActivity {

    Button button,button2;
    int severity=0;
    ImageView alr,safe;
    Sympotoms sympotoms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conclusion);

        alr =findViewById(R.id.alr);
        safe=findViewById(R.id.safe);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConclusionActivity.this,HelpLineActivity.class));
            }
        });

        sympotoms=new Sympotoms();

        severity=sympotoms.getBreathe()+sympotoms.getCough()+sympotoms.getTiredness()+sympotoms.getFever();
        if(severity>=3 || sympotoms.getBreathe()>=1){
            safe.setVisibility(GONE);
        }/*alr.setVisibility(GONE);*/

        Toast.makeText(this, Integer.toString(severity), Toast.LENGTH_SHORT).show();

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConclusionActivity.this,PreventionActivity.class));
                finish();
            }
        });

    }
}
