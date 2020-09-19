package com.khan.pushnotification.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.khan.pushnotification.R;

public class NotificationReceivedActivity extends AppCompatActivity {
    private TextView textView;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_received);

        initialization();

        getIntentValue();

        setIntentValue();
    }

    private void setIntentValue() {
        textView.setText(message);
    }

    private void getIntentValue() {
        message = getIntent().getStringExtra("message");
    }

    private void initialization() {
        textView = findViewById(R.id.textViewId);
    }
}