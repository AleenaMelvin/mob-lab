package com.model.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2,t3;
    Button bb1,bb2,bb3,bb4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText)findViewById(R.id.editTextText2);
        t2=(EditText)findViewById(R.id.editTextText3);
        t3=(EditText)findViewById(R.id.editTextText4);
        bb1=(Button)findViewById(R.id.button);
        bb2=(Button)findViewById(R.id.button2);
        bb3=(Button)findViewById(R.id.button3);
        bb4=(Button)findViewById(R.id.button4);
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1= Integer.parseInt(t1.getText().toString());
                int n2= Integer.parseInt(t2.getText().toString());
                int n3= n1+n2;
                String n4=String.valueOf(n3);
                t3.setText(n4);
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1= Integer.parseInt(t1.getText().toString());
                int n2= Integer.parseInt(t2.getText().toString());
                int n3= n1-n2;
                String n4=String.valueOf(n3);
                t3.setText(n4);

            }
        });
        bb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1= Integer.parseInt(t1.getText().toString());
                int n2= Integer.parseInt(t2.getText().toString());
                int n3= n1*n2;
                String n4=String.valueOf(n3);
                t3.setText(n4);

            }
        });
        bb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1= Integer.parseInt(t1.getText().toString());
                int n2= Integer.parseInt(t2.getText().toString());
                int n3= n1/n2;
                String n4=String.valueOf(n3);
                t3.setText(n4);

            }
        });
    }
}
