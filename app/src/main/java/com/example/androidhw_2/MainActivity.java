package com.example.androidhw_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText h;
    EditText w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        h=(EditText)findViewById(R.id.high);
        w=(EditText)findViewById(R.id.weight);
    }
}
