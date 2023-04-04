package com.example.sofa_cleaning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sofa_category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sofa_category);
    }

    public void velvetPricing(View view) {
        Intent intent1=new Intent(this,velvet_pricing.class);
        startActivity(intent1);
    }

    public void leatherPricing(View view) {
        Intent intent1=new Intent(this,leather_pricing.class);
        startActivity(intent1);
    }
}