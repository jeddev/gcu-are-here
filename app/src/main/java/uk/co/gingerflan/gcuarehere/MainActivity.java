package uk.co.gingerflan.gcuarehere;


import android.support.v4.app.ActivityCompat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set permissions for fused location provider api (JED)




        Button loginBtn = (Button) findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
        Button indoorMapBtn = (Button) findViewById(R.id.indoorMapBtn);
        indoorMapBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, IndoorTest.class));
            }
        });

        Button liveMapBtn = (Button) findViewById(R.id.liveMapBtn);
        liveMapBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MapsActivity.class));
            }
        });

    //   example of navigation to new Activity (screen) via a button interface (JED)

        Button getLastLocBtn = (Button) findViewById(R.id.getLastLocBtn);
        getLastLocBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MoreMapsActivity.class));
            }
        });

        Button styleMapBtn = (Button) findViewById(R.id.styleMapBtn);
        styleMapBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, StyledMap.class));
            }
        });
    }


    }


