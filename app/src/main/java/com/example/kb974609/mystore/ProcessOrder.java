package com.example.kb974609.mystore;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * Created by Kyra on 4/10/18.
 */

public class ProcessOrder extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.process_order);

        TableLayout table = findViewById(R.id.tableLayout);

        String[] nameArray = CreateTable.nameArray;
        int[] quantityArray = CreateTable.quantityArray;
        double[] totalArray = CreateTable.totalArray;

        for (int i = 0; i < 7;i++){
            if ( nameArray[i] != null ) {
                TableRow rows = new TableRow(this);
                TextView c1 = new TextView(this);
                TextView c2 = new TextView(this);

                c1.setText(nameArray[i]);
                c2.setText(String.format("%1d", quantityArray[i]));

                c1.setPadding(10, 0, 20, 0);
                c2.setPadding(20, 0, 20, 0);

                c1.setTypeface(Typeface.DEFAULT_BOLD);
                c2.setTypeface(Typeface.DEFAULT_BOLD);

                rows.addView(c1);
                rows.addView(c2);

                table.addView(rows);
            }
        }
    }
}
