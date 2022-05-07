package com.example.evaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] cities = {"Aravinda", "Rakshan" , "Arham", "Akshath", "Nivedita", "Praveen", "Karthik", "Harshith", "Shashank","john", "doe", "latin", "manav", "Akshath", "Nivedita", "Praveen", "Karthik"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this , android.R.layout.simple_spinner_dropdown_item, cities );
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, "Clicked " + cities[position] , Toast.LENGTH_SHORT).show();
            }
        });





    }
}