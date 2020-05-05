package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class hareesa extends AppCompatActivity {
    private Button idbtn;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);

        idbtn=(Button)findViewById(R.id.idbtn);

        idbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hareesa.this,OrderDetails.class);
                startActivity(intent);
            }
        });

        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/download.jpeg?alt=media&token=19c4169c-ad45-48f4-940f-1e19840d7b80";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
