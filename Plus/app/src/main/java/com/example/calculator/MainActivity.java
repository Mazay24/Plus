package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText1;
    Integer first = 0;
    Integer second = 0;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, MainActivity2.class);
        intent.putExtra("firstNumber", first);
        intent.putExtra("secondNumber", second);
        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText1);

    }

    public void onClickSum(View view){
        try {
            first = Integer.parseInt(editText.getText().toString());
            second = Integer.parseInt(editText1.getText().toString());
            intent.putExtra("firstNumber", first);
            intent.putExtra("secondNumber", second);
            startActivity(intent);
        }
        catch (Exception ex){
            Toast.makeText(this, "Неверный ввод", Toast.LENGTH_LONG).show();
        }
    }
}