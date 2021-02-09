package com.example.covtracegroup10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.BitSet;

public class muni3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muni3);

        Button btnBinmaley=(Button)findViewById(R.id.btnBinmaley);
        Button btnBurgos=(Button)findViewById(R.id.btnBurgos);
        Button btnBugallon=(Button)findViewById(R.id.btnBugallon);
        Button btnDasol=(Button)findViewById(R.id.btnDasol);
        Button btnCalasiao=(Button)findViewById(R.id.btnCalasiao);
        Button btnLabrador=(Button)findViewById(R.id.btnLabrador);
        Button btnback=(Button)findViewById(R.id.btnback);
        Button btnnext=(Button)findViewById(R.id.btnnext);


        btnBinmaley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni3.this,binmaley3.class);
                startActivity(int1);
            }
        });
        btnBurgos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni3.this, burgos3.class);
                startActivity(int1);
            }
        });
        btnBugallon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni3.this,bugallon3.class);
                startActivity(int1);
            }
        });
        btnDasol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni3.this,dasol3.class);
                startActivity(int1);
            }
        });
        btnCalasiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni3.this,calasiao3.class);
                startActivity(int1);
            }
        });
        btnLabrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni3.this,labrador3.class);
                startActivity(int1);
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni3.this,muni2.class);
                startActivity(int1);
            }
        });
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(muni3.this,muni4.class);
                startActivity(int1);
            }
        });
    }
}