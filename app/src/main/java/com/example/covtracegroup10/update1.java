package com.example.covtracegroup10;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class update1 extends AppCompatActivity {
    EditText municipalities, active, death, recover, date;
    Button insert, update, delete, view, btnback;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update1);
        active = findViewById(R.id.active);
        death = findViewById(R.id.death);
        recover = findViewById(R.id.recover);
        insert = findViewById(R.id.btninsert);
        update = findViewById(R.id.btnupdate);
        delete = findViewById(R.id.btndelete);
        view = findViewById(R.id.btnview);
        btnback = findViewById(R.id.btnback);

        DB = new DBHelper(this);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String activeTXT = active.getText().toString();
                String deathTXT = death.getText().toString();
                String recoverTXT = recover.getText().toString();

                Boolean checkinsertdata = DB.insertuserdata(activeTXT, deathTXT, recoverTXT);
                if(checkinsertdata==true)
                    Toast.makeText(update1.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(update1.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();
            }        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String activeTXT = active.getText().toString();
                String deathTXT = death.getText().toString();
                String recoverTXT = recover.getText().toString();

                Boolean checkupdatedata = DB.updateuserdata(activeTXT, deathTXT, recoverTXT);
                if(checkupdatedata==true)
                    Toast.makeText(update1.this, "Entry Updated", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(update1.this, "New Entry Not Updated", Toast.LENGTH_SHORT).show();
            }        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String activeTXT = active.getText().toString();
                Boolean checkudeletedata = DB.deletedata(activeTXT);
                if(checkudeletedata==true)
                    Toast.makeText(update1.this, "Entry Deleted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(update1.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();
            }        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = DB.getdata();
                if(res.getCount()==0){
                    Toast.makeText(update1.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext()){
                    buffer.append("active :"+res.getString(0)+"\n");
                    buffer.append("death :"+res.getString(1)+"\n");
                    buffer.append("recover :"+res.getString(2)+"\n\n");
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(update1.this);
                builder.setCancelable(true);
                builder.setTitle("Municipalities");
                builder.setMessage(buffer.toString());
                builder.show();
            }        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(update1.this,muni1.class);
                startActivity(int1);
            }
        });

    }}