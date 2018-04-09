package com.example.kb974609.mystore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class StoreActivity extends AppCompatActivity {

    ImageButton dasani, oatmeal, hotcakes, sausageBiscuit, baconEggBiscuit,
            eggSausageBiscuit, sausageBurrito;
    Button process;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        dasani = findViewById(R.id.DasaniButton);
        oatmeal = findViewById(R.id.FruitButton);
        hotcakes = findViewById(R.id.HotcakeButton);
        sausageBiscuit = findViewById(R.id.SausageBiscuitButton);
        baconEggBiscuit = findViewById(R.id.BaconBiscuitButton);
        eggSausageBiscuit = findViewById(R.id.EggSausageButton);
        sausageBurrito = findViewById(R.id.SausageBurritoButton);
        process = findViewById(R.id.ProcessButton);

        dasani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        oatmeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        hotcakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        sausageBiscuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        baconEggBiscuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        eggSausageBiscuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        sausageBurrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        process.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
