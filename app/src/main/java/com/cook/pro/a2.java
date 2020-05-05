package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class a2 extends AppCompatActivity {
    private Button idbtn;
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);


        idbtn=(Button)findViewById(R.id.idbtn);

        idbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(a2.this,OrderDetails.class);
                startActivity(intent);
            }
        });
        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/Arabian-Lamb-Stew-3.jpg?alt=media&token=0d6a16d3-ccef-494f-a7f9-a06e4cf9adb3";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
