package com.example.scheduler;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 버튼 초기화
        Button btnElementary = findViewById(R.id.btn_elementary);
        Button btnUniversity = findViewById(R.id.btn_university);

        // 초/중/고등학생 버튼 클릭 시
        btnElementary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ScheduleActivity로 이동
                Intent intent = new Intent(MainActivity.this, ScheduleActivity.class);
                startActivity(intent);
            }
        });

        // 대학생 버튼 클릭 시
        btnUniversity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // UniScheduleActivity로 이동
                Intent intent = new Intent(MainActivity.this, UniScheduleActivity.class);
                startActivity(intent);
            }
        });
    }
}
