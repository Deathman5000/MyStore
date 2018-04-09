package com.example.kb974609.mystore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class StoreActivity extends AppCompatActivity {

    ImageButton dasani, oatmeal, hotcakes, sausageBiscuit, baconEggBiscuit,
            eggSausageBiscuit, sausageBurrito;

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
        sausageBiscuit = findViewById(R.id.SausageBurritoButton);


    }
}
