package com.example.kb974609.mystore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class StoreActivity extends AppCompatActivity {

    ImageButton dasani, oatmeal, hotcakes, sausageBiscuit, baconEggBiscuit,
            eggSausageBiscuit, sausageBurrito;
    Button process;
    int arrayCount;
    //int dcount, ocount, hcount, scount, bcount, ecount, sbcount;
    public static String[] products;
    public static Double[] value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        //dcount = ocount = hcount = scount = bcount = ecount = sbcount = 0;
        arrayCount = 0;
        products = new String[]{"Dasani Water ", "Fruit Maple Oatmeal ", "Hotcakes ",
                "Sausage Biscuit ", "Bacon Egg Biscuit ", "Egg Sausage Biscuit ",
                "Sausage Burrito "};
        value = new Double[]{2.00, 2.00, 2.00, 1.99, 2.00, 2.00, 1.75};

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
                arrayCount = 0;
                Intent intent=new Intent(getApplicationContext(), CreateTable.class);
                intent.putExtra("name", products[arrayCount]);
                intent.putExtra("itemPrice", value[arrayCount]);
                intent.putExtra("arrayCount", arrayCount);
                startActivity(intent);
            }
        });

        oatmeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayCount = 1;
                Intent intent=new Intent(getApplicationContext(), CreateTable.class);
                intent.putExtra("name", products[arrayCount]);
                intent.putExtra("itemPrice", value[arrayCount]);
                intent.putExtra("arrayCount", arrayCount);
                startActivity(intent);
            }
        });

        hotcakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayCount = 2;
                Intent intent=new Intent(getApplicationContext(), CreateTable.class);
                intent.putExtra("name", products[arrayCount]);
                intent.putExtra("itemPrice", value[arrayCount]);
                intent.putExtra("arrayCount", arrayCount);
                startActivity(intent);
            }
        });

        sausageBiscuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayCount = 3;
                Intent intent=new Intent(getApplicationContext(), CreateTable.class);
                intent.putExtra("name", products[arrayCount]);
                intent.putExtra("itemPrice", value[arrayCount]);
                intent.putExtra("arrayCount", arrayCount);
                startActivity(intent);
            }
        });

        baconEggBiscuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayCount = 4;
                Intent intent=new Intent(getApplicationContext(), CreateTable.class);
                intent.putExtra("name", products[arrayCount]);
                intent.putExtra("itemPrice", value[arrayCount]);
                intent.putExtra("arrayCount", arrayCount);
                startActivity(intent);
            }
        });

        eggSausageBiscuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayCount = 5;
                Intent intent=new Intent(getApplicationContext(), CreateTable.class);
                intent.putExtra("name", products[arrayCount]);
                intent.putExtra("itemPrice", value[arrayCount]);
                intent.putExtra("arrayCount", arrayCount);
                startActivity(intent);
            }
        });

        sausageBurrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayCount = 6;
                Intent intent=new Intent(getApplicationContext(), CreateTable.class);
                intent.putExtra("name", products[arrayCount]);
                intent.putExtra("itemPrice", value[arrayCount]);
                intent.putExtra("arrayCount", arrayCount);
                startActivity(intent);
            }
        });

        process.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
