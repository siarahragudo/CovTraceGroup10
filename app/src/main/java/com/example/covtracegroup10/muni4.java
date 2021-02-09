package com.example.covtracegroup10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class muni4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muni4);
        Button btnLaoac=(Button)findViewById(R.id.btnLaoac);
        Button btnLingayen=(Button)findViewById(R.id.btnLingayen);
        Button btnMabini=(Button)findViewById(R.id.btnMabini);
        Button btnMalasiqui=(Button)findViewById(R.id.btnMalasiqui);
        Button btnManaoag=(Button)findViewById(R.id.btnManaoag);
        Button btnMangaldan=(Button)findViewById(R.id.btnMangaldan);
        Button btnback=(Button)findViewById(R.id.btnback);
        Button btnnext=(Button)findViewById(R.id.btnnext);



        btnLaoac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni4.this,laoac4.class);
                startActivity(int1);
            }
        });
        btnLingayen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni4.this, lingayen4.class);
                startActivity(int1);
            }
        });
        btnMabini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni4.this,mabini4.class);
                startActivity(int1);
            }
        });
        btnMalasiqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni4.this,malasiqui4.class);
                startActivity(int1);
            }
        });
        btnManaoag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni4.this, manaoag4.class);
                startActivity(int1);
            }
        });
        btnMangaldan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni4.this,mangaldan4.class);
                startActivity(int1);
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni4.this,muni3.class);
                startActivity(int1);
            }
        });
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni4.this,muni5.class);
                startActivity(int1);
            }
        });
    }
}