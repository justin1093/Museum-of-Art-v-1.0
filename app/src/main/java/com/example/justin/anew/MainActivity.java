package com.example.justin.anew;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_main);

        ImageView museum;
        museum  = (ImageView) findViewById(R.id.image3);
        museum.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                setContentView(R.layout.activity_museum);



                ImageView palace;
                palace = (ImageView) findViewById(R.id.image);
                palace.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        setContentView(R.layout.activity_museum_details);

                        FloatingActionButton a;
                        a = (FloatingActionButton) findViewById(R.id.GuideButton);
                        a.setOnClickListener(new View.OnClickListener() {

                            public void onClick(View v) {
                                setContentView(R.layout.activity_guide);



                                ImageView gui;
                                gui = (ImageView) findViewById(R.id.image1);
                                gui.setOnClickListener(new View.OnClickListener() {

                                    public void onClick(View v) {
                                        setContentView(R.layout.activity_explain);


                                    }});




                            }});







                    }

                });




            }
        });

    }

}