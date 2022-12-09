package com.example.lab2_ph17442_tranngocphu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.lab2_ph17442_tranngocphu.Lab21.L21MainActivity;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bai1(View view) {
       intent = new Intent(MainActivity.this,L21MainActivity.class);
       startActivity(intent);
    }
}