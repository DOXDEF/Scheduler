package com.example.scheduler;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_elementary).setOnClickListener(v -> navigateToSchedule("elementary"));
        findViewById(R.id.btn_middle).setOnClickListener(v -> navigateToSchedule("middle"));
        findViewById(R.id.btn_high).setOnClickListener(v -> navigateToSchedule("high"));
        findViewById(R.id.btn_university).setOnClickListener(v -> navigateToSchedule("university"));
    }

    private void navigateToSchedule(String userType) {
        Intent intent = new Intent(this, ScheduleActivity.class);
        intent.putExtra("USER_TYPE", userType);
        startActivity(intent);
    }
}
