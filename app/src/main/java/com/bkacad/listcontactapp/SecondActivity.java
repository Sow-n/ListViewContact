package com.bkacad.listcontactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tvName, tvPhone;
    private Button btnBack;


    private void initUI(){
        tvName = findViewById(R.id.tvName);
        tvPhone = findViewById(R.id.tvPhone);
        btnBack = findViewById(R.id.btnBack);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initUI();

        Intent intent = getIntent();
        String input = intent.getStringExtra("contact");
        String tmp[] = input.split("-");
        tvName.setText(tmp[0]);
        tvPhone.setText(tmp[1]);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
//                startActivity(intent);
                finish();
            }
        });
    }
}