package com.cook.pro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class pakistani extends AppCompatActivity {
    ImageView imageView;
    private Button idbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakistani);


        idbtn=(Button)findViewById(R.id.idbtn);

        idbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(pakistani.this,OrderDetails.class);
                startActivity(intent);
            }
        });
        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/Modern-Fashion-Elegant-Women-Clothes.jpg?alt=media&token=e249fdb7-983d-44ff-bcfa-8ed16064937e";
        Glide.with(getApplicationContext()).load(url).into(imageView);


    }
}
