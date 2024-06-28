package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Multiplication extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multiplication);
        ed1=(EditText) findViewById(R.id.one);
        ed2=(EditText) findViewById(R.id.two);
        bt1=(AppCompatButton) findViewById(R.id.multi);
        bt2=(AppCompatButton) findViewById(R.id.goback);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             try {
                 String getNum1=ed1.getText().toString();
                 String getNum2=ed2.getText().toString();
                 int num1=Integer.parseInt(getNum1);
                 int num2=Integer.parseInt(getNum2);
                 int multi=num1*num2;
                 Toast.makeText(getApplicationContext(),String.valueOf(multi),Toast.LENGTH_LONG).show();
             }
             catch (Exception e){
                 Toast.makeText(getApplicationContext(),"error",Toast.LENGTH_LONG).show();
             }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}