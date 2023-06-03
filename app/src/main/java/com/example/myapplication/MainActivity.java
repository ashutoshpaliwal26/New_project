package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void sendData(View view){
        Toast.makeText(this, "Sending Data...", Toast.LENGTH_SHORT).show();
    }

    public void recieveData(View view){
        Toast.makeText(this, "Recive Data...", Toast.LENGTH_SHORT).show();
    }

    public void printData(View view){
        Toast.makeText(this, "Printing Data...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}