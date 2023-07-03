package com.shuo.archeotechar.helloar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shuo.archeotechar.R;

public class HomeActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        button1 = findViewById(R.id.button_collection);
        button2 = findViewById(R.id.button_explore);
        button3 = findViewById(R.id.button_individual);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iCollection = new Intent(HomeActivity.this, CollectionsActivity.class);
                startActivity(iCollection);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iCollection = new Intent(HomeActivity.this, HelloArActivity.class);
                startActivity(iCollection);
            }
        });
    }
}