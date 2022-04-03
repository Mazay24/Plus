package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle arguments = getIntent().getExtras();
        TextView textView2 = findViewById(R.id.textView2);
        String first;
        String second;
        Integer result = arguments.getInt("first")+arguments.getInt("second");

        first = arguments.get("first").toString();

        if(arguments.getInt("second")<0){
            second = "("+arguments.get("second").toString()+")";
        }
        else {
            second = arguments.get("second").toString();
        }
        textView2.setText(first+" + "+second+" = "+result);
    }
    public void onClickReturn(View view){
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
}