package com.example.sofa_cleaning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class leather_pricing extends AppCompatActivity {
    EditText et, Address,Contact,Name;
    String numOfSeats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leather_pricing);
        et=findViewById(R.id.editTextTextPersonName);
        Address=findViewById(R.id.editTextTextPersonName2);
        Contact=findViewById(R.id.editTextTextPersonName3);
        Name=findViewById(R.id.editTextTextPersonName5);
    }
    public void Leather_checkout(View view) {
        et=findViewById(R.id.editTextTextPersonName);
        numOfSeats=et.getEditableText().toString();
        String Address_string = Address.getEditableText().toString();
        String contact_string = Contact.getEditableText().toString();
        String name=Name.getEditableText().toString();
        if (numOfSeats.isEmpty()){
            et.setError("Please Enter Number of Seats!!!");
            et.requestFocus();
            return;
        }
        if (Address_string.isEmpty()){
            Address.setError("Please Enter your Address!!!");
            et.requestFocus();
            return;
        }
        if(contact_string.isEmpty()){
            Contact.setError("Please Enter your Contact!!!");
            et.requestFocus();
            return;
        }
        if(name.isEmpty()){
            Name.setError("Please Enter your Name!!!");
            et.requestFocus();
            return;
        }
        Intent intent2=new Intent(this,leather_bill.class);
        intent2.putExtra("NUM",numOfSeats);
        startActivity(intent2);
    }

}

