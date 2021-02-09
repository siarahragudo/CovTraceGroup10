package com.example.covtracegroup10;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class muni1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muni1);

        Button btnAgno=(Button)findViewById(R.id.btnAgno);
        Button btnAguilar=(Button)findViewById(R.id.btnAguilar);
        Button btnAlcala=(Button)findViewById(R.id.btnAlcala);
        Button btnAnda=(Button)findViewById(R.id.btnAnda);
        Button btnAsingan=(Button)findViewById(R.id.btnAsingan);
        Button btnBalungao=(Button)findViewById(R.id.btnBalungao);
        Button btnupdate=(Button)findViewById(R.id.btnupdate);
        Button btnback=(Button)findViewById(R.id.btnback);
        Button btnnext=(Button)findViewById(R.id.btnnext);


        btnAgno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni1.this,agno1.class);
                startActivity(int1);
            }
        });
        btnAguilar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni1.this,aguilar1.class);
                startActivity(int1);
            }
        });
        btnAlcala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni1.this,alcala1.class);
                startActivity(int1);
            }
        });
        btnAnda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni1.this,anda1.class);
                startActivity(int1);
            }
        });
        btnAsingan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni1.this,asingan1.class);
                startActivity(int1);
            }
        });
        btnBalungao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni1.this,balungao1.class);
                startActivity(int1);
            }
        });
        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni1.this,update1.class);
                startActivity(int1);
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni1.this,MainActivity.class);
                startActivity(int1);
            }
        });
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni1.this,muni2.class);
                startActivity(int1);
            }
        });





    }
}