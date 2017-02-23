package com.thenewcoder.aniksintent;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                AlertDialog.Builder mybuilder = new AlertDialog.Builder(MainActivity.this);
                mybuilder.setTitle("Attention!");
                mybuilder.setMessage("Don't go there you'll be fucked up");
                mybuilder.setIcon(R.drawable.cross);
                mybuilder.setPositiveButton("fucked up", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Goodbye Moron",Toast.LENGTH_LONG).show();
                        Intent i = new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(i);
                    }
                });

                mybuilder.setNegativeButton("You're intelligent", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Saved",Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog Mydialog = mybuilder.create();
                Mydialog.show();
            }
        });
    }

}
