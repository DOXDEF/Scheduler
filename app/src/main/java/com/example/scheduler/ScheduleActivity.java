package com.example.scheduler;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        String userType = getIntent().getStringExtra("USER_TYPE");
        setupSchedule(userType);
    }

    private void setupSchedule(String userType) {
        GridLayout scheduleGrid = findViewById(R.id.schedule_grid);

        if (userType.equals("university")) {
            // 대학생용 동적 시간표 생성
            createDynamicSchedule(scheduleGrid);
        } else {
            // 초/중/고 시간표 생성
            createFixedSchedule(scheduleGrid);
        }
    }

    private void createFixedSchedule(GridLayout grid) {
        // 정해진 시간표 생성 코드 (고정 시간)
    }

    private void createDynamicSchedule(GridLayout grid) {
        // 1시간 간격으로 동적 시간표 생성 코드
    }
}

