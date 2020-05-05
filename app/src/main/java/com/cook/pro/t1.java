package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class t1 extends AppCompatActivity {
private ImageView imageView;
    private Button idbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1);



        idbtn=(Button)findViewById(R.id.idbtn);

        idbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(t1.this,OrderDetails.class);
                startActivity(intent);
            }
        });
        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/download%20(1).jpeg?alt=media&token=c8d7bc6b-1e81-4647-98c1-80d89545095f";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
