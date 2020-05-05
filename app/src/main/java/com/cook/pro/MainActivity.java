 package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

 public class MainActivity extends AppCompatActivity {

     private ImageView imageView,imageView2,imageView3,imageView4,imageView5,imageView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(ImageView) findViewById(R.id.one);
        imageView2=(ImageView) findViewById(R.id.two);
        imageView3=(ImageView) findViewById(R.id.three);
        imageView4=(ImageView) findViewById(R.id.four);
        imageView5=(ImageView) findViewById(R.id.five);
        imageView6=(ImageView) findViewById(R.id.six);

    }

     public void pakk(View view) {
         Intent i=new Intent(MainActivity.this,Pakki.class);
         startActivity(i);
     }

     public void indd(View view) {
         Intent i=new Intent(MainActivity.this,indd.class);
         startActivity(i);
     }

     public void arabicc(View view) {
         Intent i=new Intent(MainActivity.this,arab.class);
         startActivity(i);
     }

     public void turkishh(View view) {
         Intent i=new Intent(MainActivity.this,turk.class);
         startActivity(i);
     }

     public void chinese(View view) {
         Intent i=new Intent(MainActivity.this,china.class);
         startActivity(i);
     }

     public void otherss(View view) {
         Intent i=new Intent(MainActivity.this,other.class);
         startActivity(i);
     }
 }
