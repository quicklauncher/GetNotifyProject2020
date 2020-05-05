package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class c2 extends AppCompatActivity {
private ImageView imageView;

    private Button idbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2);

        idbtn=(Button)findViewById(R.id.idbtn);

        idbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(c2.this,OrderDetails.class);
                startActivity(intent);
            }
        });
        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/images-2-5.jpg?alt=media&token=c0a726c0-ef84-4400-a40e-661433e0c8a5";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
