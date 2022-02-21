package com.example.studycase2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.time.Year;
import java.util.Date;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String hoten= getIntent().getExtras().getString("hoten");
        String ns= getIntent().getExtras().getString("namsinh");
        int namsinh= Integer.parseInt(ns);
        String st= "Họ tên: "+hoten+", Năm sinh: "+namsinh;
        int tuoi= 2021 -namsinh;

        TextView tvnd= findViewById(R.id.tvnd);
        TextView tvtuoi= findViewById(R.id.tvtuoi);
        tvnd.setText(st);
        tvtuoi.setText("Tuổi: "+tuoi);
    }
}