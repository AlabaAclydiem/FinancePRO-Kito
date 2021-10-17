package com.example.kito;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("Nastya's Page");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}