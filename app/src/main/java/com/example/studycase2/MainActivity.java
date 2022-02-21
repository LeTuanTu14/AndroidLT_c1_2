package com.example.studycase2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et_hoten= findViewById(R.id.editText_hoten);
        EditText et_namsinh= findViewById(R.id.editText_namsinh);
        Button bt= findViewById(R.id.button_Submit);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("hoten",et_hoten.getText().toString());
                intent.putExtra("namsinh",et_namsinh.getText().toString());
                startActivity(intent);
            }
        });

    }
}