package com.hypermedia.group2arapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
private Button button2;
private Button button;
private Button button3;
private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        CameraPermissionHelper.requestCameraPermission(this);

        button2 = findViewById(R.id.button2);
        ((View) button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        button = findViewById(R.id.button);
        ((View) button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        button3 = findViewById(R.id.button3);
        ((View) button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
        button4 = findViewById(R.id.button4);
        ((View) button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openActivity3() {
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }
    public void openActivity4() {
        Intent intent = new Intent(this, LightActivity.class);
        startActivity(intent);
    }
    public void openActivity5() {
        Intent intent = new Intent(this, MuseumActivity.class);
        startActivity(intent);
    }
}
