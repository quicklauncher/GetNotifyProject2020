package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class arab extends AppCompatActivity {
    ListView lv;
    String[] position={"Jogger","Flat Sole"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arab);



        lv=(ListView) findViewById(R.id.listview2);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,position);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent intent=new Intent(arab.this,a1.class);
                    startActivity(intent);

                }
                if (i==1){
                    Intent intent=new Intent(arab.this,a2.class);
                    startActivity(intent);

                }



            }
        });
    }
}
