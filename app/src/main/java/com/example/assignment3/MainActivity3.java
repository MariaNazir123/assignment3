package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    String countries[]= {"Afghanistan","Albania", "Argentina","Bangladesh","Belgium","Cambodia","Canada","China","Denmark",
            "Dominica","Egypt","Eritrea","Gambia","Georgia","Germany","Haiti","Honduras","Hungary","Iceland",
            "India","Indonesia","Japan","Jordan","Kenya","Kuwait","Lebanon","Liberia","Malaysia","Mali",
            "Netherlands","New Zealand","Oman","Pakistan","Philippines","Qatar","Romania","Russia","Rwanda",
            "Saint Kitts and Nevis","Saudi Arabia","Singapore","Tonga","Turkey","United Kingdom",
            "United States of America","Vanuatu","Venezuela","Yemen","Zambia","Zimbabwe"};
    String alpha[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textview=(TextView) findViewById(R.id.textview);
        String item= getIntent().getStringExtra("key");

        for(int j=0;j<50;j++) {

            String s1 = countries[j];
            for(int i=0;i<26;i++) {

                String s2=alpha[i];
                if (item.equals(s2)) {

                    if (s1.startsWith(s2)){
                    textview.append(s1 + "\n");
                    }
                }
            }
        }
    }
}