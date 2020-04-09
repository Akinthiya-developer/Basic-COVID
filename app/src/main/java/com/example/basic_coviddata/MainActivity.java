package com.example.basic_coviddata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button factie,homie,livie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factie=findViewById(R.id.factie);
        homie=findViewById(R.id.homie);
        livie=findViewById(R.id.livie);

        livie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.bing.com/covid";
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(ContextCompat.getColor(MainActivity.this, R.color.newie));
                builder.addDefaultShareMenuItem();

                CustomTabsIntent anotherCustomTab = new CustomTabsIntent.Builder().build();

                Intent intent = anotherCustomTab.intent;
                intent.setData(Uri.parse("https://www.bing.com/covid"));
                
                builder.setShowTitle(true);


                CustomTabsIntent customTabsIntent = builder.build();
                customTabsIntent.launchUrl(MainActivity.this, Uri.parse(url));
            }
        });

    }
}
