package com.example.assignment5;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText("This is Second Activity (Explicit Intent)");
        tv.setTextSize(20);
        tv.setPadding(50, 50, 50, 50);

        setContentView(tv);
    }
}