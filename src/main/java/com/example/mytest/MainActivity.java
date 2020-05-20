package com.example.mytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    ImageView statistik;
    ImageView daten;
    ImageView topics;
    ImageView anleitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        statistik = (ImageView)findViewById(R.id.statistik);
        daten = (ImageView)findViewById(R.id.daten);
        topics = (ImageView)findViewById(R.id.topics);
        anleitung = (ImageView)findViewById(R.id.anleitung);

        statistik.setImageResource(R.drawable.statistik);

        statistik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }

    @Override
    public void onClick(View arg0) {


    }

}
