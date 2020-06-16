package com.example.helloword02062020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mBtnClick;
    TextView mTvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnClick = findViewById(R.id.buttonClick);
        mTvTitle = findViewById(R.id.textviewTitle);

        // Kiem tra gia tri trong system
        // ctrl + p : xem tham so truyen vao
//        mTvTitle.setText("Main Activity");
//        Log.d("BBB",mTvTitle.getText().toString());
//        Access Modifier trong Java
    }



}