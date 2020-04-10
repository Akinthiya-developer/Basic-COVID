package com.example.basic_coviddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HelpLineActivity extends AppCompatActivity {

    Button open;
    TextView t,t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_line);

        open=findViewById(R.id.open);
        t1=findViewById(R.id.t1);
        t=findViewById(R.id.t);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);

        String a="1. https://nhm.gov.in/index4.php?lang=1&level=0&linkid=464&lid=718";
        String b="2. https://www.who.int/emergencies/diseases/novel-coronavirus-2019";
        String c="3. https://www.mygov.in/covid-19/?cbps=1";
        String d="4. https://www.mohfw.gov.in/";
        t1.setText(a);
        t.setText(b);
        t2.setText(c);
        t3.setText(d);

        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.parse("https://www.mohfw.gov.in/pdf/coronvavirushelplinenumber.pdf"),"application/pdf");
                startActivity(Intent.createChooser(intent,"choose an application to view"));
            }
        });

    }
}
