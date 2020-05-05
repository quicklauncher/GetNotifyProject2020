package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class china extends AppCompatActivity {

    ListView lv;
    String[] position = {"V-collar shirts", "Circular collar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china);


        lv = (ListView) findViewById(R.id.listview4);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, position);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(china.this, c1.class);
                    startActivity(intent);

                }
                if (i == 1) {
                    Intent intent = new Intent(china.this, c2.class);
                    startActivity(intent);

                }



            }
        });
    }
}


