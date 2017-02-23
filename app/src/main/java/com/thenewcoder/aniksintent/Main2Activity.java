package com.thenewcoder.aniksintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

     Button b,bn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b = (Button)findViewById(R.id.button2);
        bn =(Button)findViewById(R.id.button4);
        b.setOnClickListener(this);
        bn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button2){
            Intent it = new Intent(Main2Activity.this,Main3Activity.class);
            startActivity(it);
            finish();
        }
        else {
            Intent itt  = new Intent(Main2Activity.this,MainActivity.class);
            startActivity(itt);
            finish();
        }

    }


}
