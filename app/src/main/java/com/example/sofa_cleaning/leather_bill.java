package com.example.sofa_cleaning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class leather_bill extends AppCompatActivity {
    TextView txt;
    Button hmbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leather_bill);
        txt=findViewById(R.id.textView11);
        Intent intent3=getIntent() ;
        String b=intent3.getStringExtra("NUM");
        int bill=Integer.valueOf(b)*200;
        String B=String.valueOf(bill);
        txt.setText(B);
        txt.setTextSize(20);
        hmbutton=(Button) findViewById(R.id.button4);
        hmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.example.navdrawer");
                startActivity(i);
            }
        });

    }
    }
