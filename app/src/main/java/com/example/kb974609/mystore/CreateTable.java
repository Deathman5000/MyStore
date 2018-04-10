package com.example.kb974609.mystore;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * Created by Kyra on 4/9/18.
 */

public class CreateTable extends AppCompatActivity {
    String name,stQuantity;
    String [] nameArray = new String[7];
    int [] quantityArray = new int[7];
    double [] totalArray = new double[7];
    int itemCount, index, quantity;
    double price, total;
    TextView itemName;
    EditText itemQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_table);
        itemName = findViewById(R.id.item);
        itemQuantity = findViewById(R.id.itemQuantity);
        TableLayout table = findViewById(R.id.tableLayout);

        Bundle b = this.getIntent().getExtras();
        name = b.getString("name");
        price = b.getDouble("itemPrice");
        itemCount = b.getInt("itemCount");
        index = b.getInt("arrayCount");
        itemName.setText(name);
        if (itemCount > 0){
            //do something here to print out the table
            //with just the name and quantity
            nameArray = b.getStringArray("nameArray").clone();
            quantityArray = b.getIntArray("quantityArray").clone();
            for (int i = 0; i <= itemCount;i++){
                TableRow rows = new TableRow(this);
                TextView c1 = new TextView(this);
                TextView c2 = new TextView(this);

                c1.setText(nameArray[i]);
                c2.setText(quantityArray[i]);

                c1.setPadding(10,0,20,0);
                c2.setPadding(20,0,20,0);

                c1.setTypeface(Typeface.DEFAULT_BOLD);
                c2.setTypeface(Typeface.DEFAULT_BOLD);

                rows.addView(c1);
                rows.addView(c2);

                table.addView(rows);
            }



        }

    }

    @Override
    public void onBackPressed() {

        stQuantity = itemQuantity.getText().toString();
        quantity = Integer.parseInt(stQuantity);
        total = quantity * price;
        nameArray[index] = name;
        quantityArray[index] = quantity;
        totalArray[index] = total;
        Intent S = new Intent(CreateTable.this,StoreActivity.class);
        S.putExtra("nameArray",nameArray);
        S.putExtra("quantityArray",quantityArray);
        S.putExtra("totalArray",totalArray);

        setResult(RESULT_OK,S);
        super.onBackPressed();
    }
}
