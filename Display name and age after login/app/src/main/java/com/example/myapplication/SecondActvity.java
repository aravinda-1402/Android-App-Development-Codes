package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActvity extends AppCompatActivity {

    public static final String NAME = "NAME";
    public static final String AGE = "AGE";

    private TextView nameText, ageText;
    private String name;
    private int age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_actvity);
        nameText= findViewById(R.id.mName);
        ageText = findViewById(R.id.mAge);

        Intent i = getIntent();
        name = i.getStringExtra(NAME);
        age = i.getIntExtra(AGE, 0);

        nameText.setText("Hi!" + name);
        ageText.setText("Your Age is"+ age);


    }
}