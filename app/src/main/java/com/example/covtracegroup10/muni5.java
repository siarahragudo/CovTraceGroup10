package com.example.covtracegroup10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class muni5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muni5);

        Button btnMangatarem=(Button)findViewById(R.id.btnMangatarem);
        Button btnMapandan=(Button)findViewById(R.id.btnMapandan);
        Button btnNatividad =(Button)findViewById(R.id.btnNatividad);
        Button btnPozorrubio=(Button)findViewById(R.id.btnPozorrubio);
        Button btnRosales=(Button)findViewById(R.id.btnRosales);
        Button btnSanFabian=(Button)findViewById(R.id.btnSanFabian);
        Button btnback=(Button)findViewById(R.id.btnback);
        Button btnlogout=(Button)findViewById(R.id.btnlogout);


        btnMangatarem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni5.this, mangatarem5.class);
                startActivity(int1);
            }
        });
        btnMapandan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni5.this,mapandan5.class);
                startActivity(int1);
            }
        });
        btnNatividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni5.this,natividad5.class);
                startActivity(int1);
            }
        });
        btnPozorrubio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni5.this,pozorrubio5.class);
                startActivity(int1);
            }
        });
        btnRosales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni5.this,rosales5.class);
                startActivity(int1);
            }
        });
        btnSanFabian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni5.this,sanfabian5.class);
                startActivity(int1);
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni5.this,muni4.class);
                startActivity(int1);
            }
        });
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni5.this,MainActivity.class);
                startActivity(int1);
            }
        });
    }
}