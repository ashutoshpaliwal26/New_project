package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void Print(View view){
        Toast.makeText(this, "Hello world", Toast.LENGTH_SHORT).show();
    }

    public void PrintB(View view){
        Toast.makeText(this, "Printing Data...", Toast.LENGTH_SHORT).show();
    }

    public void Send(View  view){
        Toast.makeText(this, "Sending Data...", Toast.LENGTH_SHORT).show();
    }

    public void Recieve(View view){
        Toast.makeText(this, "Recieving Data...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}