package com.example.covtracegroup10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class muni2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muni2);

        Button btnBani=(Button)findViewById(R.id.btnBani);
        Button btnBasista=(Button)findViewById(R.id.btnBasista);
        Button btnBautista=(Button)findViewById(R.id.btnBautista);
        Button btnBayambang=(Button)findViewById(R.id.btnBayambang);
        Button btnBinalonan=(Button)findViewById(R.id.btnBinalonan);
        Button btnBolinao=(Button)findViewById(R.id.btnBolinao);
        Button btnback=(Button)findViewById(R.id.btnback);
        Button btnnext=(Button)findViewById(R.id.btnnext);


        btnBani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni2.this,bani2.class);
                startActivity(int1);
            }
        });
        btnBasista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni2.this,basista2.class);
                startActivity(int1);
            }
        });
        btnBautista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni2.this,bautista2.class);
                startActivity(int1);
            }
        });
        btnBayambang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni2.this,bayambang2.class);
                startActivity(int1);
            }
        });
        btnBinalonan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni2.this,binalonan2.class);
                startActivity(int1);
            }
        });
        btnBolinao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni2.this,bolinao2.class);
                startActivity(int1);
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni2.this,muni1.class);
                startActivity(int1);
            }
        });
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni2.this,muni3.class);
                startActivity(int1);
            }
        });





    }
}