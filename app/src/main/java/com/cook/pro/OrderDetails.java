package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class OrderDetails extends AppCompatActivity {
    private EditText name,class_,address,quantity;
    private Button send;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);


        databaseReference= FirebaseDatabase.getInstance().getReference("orders");


        name=(EditText)findViewById(R.id.name);
        class_=(EditText)findViewById(R.id.class_);
        address=(EditText)findViewById(R.id.address);
        quantity=(EditText)findViewById(R.id.quantity);
        send=(Button) findViewById(R.id.send);


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addStudents();
            }
        });

    }

    public void addStudents(){

        String studentName=name.getText().toString();
        String studentId=class_.getText().toString();
        String addressName=address.getText().toString();
        String quantityName=quantity.getText().toString();

        if (!TextUtils.isEmpty(studentId) && !TextUtils.isEmpty(studentName) && !TextUtils.isEmpty(addressName) && !TextUtils.isEmpty(quantityName)){

            String id=databaseReference.push().getKey();
            Students students =new Students(id,studentId,studentName,addressName,quantityName);
            databaseReference.child(id).setValue(students);
            name.setText("");
            class_.setText("");
            address.setText("");
            quantity.setText("");

            Intent i=new Intent (OrderDetails.this,reviews.class);
            startActivity(i);

        }else {

            Toast.makeText(OrderDetails.this, "Fill all details", Toast.LENGTH_SHORT).show();
        }
    }
}
