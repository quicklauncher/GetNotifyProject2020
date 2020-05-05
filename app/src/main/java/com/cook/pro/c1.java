package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class c1 extends AppCompatActivity {
private ImageView imageView;
    private Button idbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1);



        idbtn=(Button)findViewById(R.id.idbtn);

        idbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(c1.this,OrderDetails.class);
                startActivity(intent);
            }
        });
        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/12058529_BLACK_001_ProductLarge.jpg?alt=media&token=bf172ae0-1c91-4adf-9597-e73e4472d307";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
