package com.example.basic_coviddata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class FactActivity extends AppCompatActivity {

    Button b1,b2;
    RecyclerView le;
    RecyclerView.Adapter adapter;

    List<String> evento,regiso;

    String[] up=new String[]{"SPREAD","AIR-TRANSMISSION","FORM"};
    String[] donw=new String[]{"Personel contact","NO","droplets"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact);

        b1=findViewById(R.id.buttonnn);
        b2=findViewById(R.id.butto3);
        le=findViewById(R.id.rl);

        evento=new ArrayList<>();
        regiso=new ArrayList<>();

        le.setHasFixedSize(true);
        le.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,true));
        le.setItemAnimator(new DefaultItemAnimator());

        for(int i=0;i<up.length;i++){
            evento.add(up[i]);
            regiso.add(donw[i]);
        }
        adapter=new cycleAdapter(getApplicationContext(),evento,regiso);
        le.setAdapter(adapter);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FactActivity.this,PreventionActivity.class));
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FactActivity.this,HelpLineActivity.class));
            }
        });

    }
}
