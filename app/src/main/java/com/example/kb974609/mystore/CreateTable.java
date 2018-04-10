package com.example.kb974609.mystore;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * Created by Kyra on 4/9/18.
 */

public class CreateTable extends AppCompatActivity {

    EditText userQuantity;
    TextView tableProduct, tableQuantity, itemSelected;

    String itemNameString;
    Double itemPrice;
    int arrayCount;
    //public static String[] tableArrayProduct;
    //public static Integer[] tableArrayQuanitity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_table);

        userQuantity = findViewById(R.id.user_quantity);
        tableProduct = findViewById(R.id.table_product);
        tableQuantity = findViewById(R.id.table_quantity);
        //itemSelected = findViewById(R.id.item_selected);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            itemNameString = extras.getString("name");
            itemPrice = extras.getDouble("itemPrice");
            //itemSelected.setText("" + itemNameString);
            arrayCount = extras.getInt("arrayCount");
        }

        String[] products = StoreActivity.products;
        Double[] value = StoreActivity.value;


    }
}
