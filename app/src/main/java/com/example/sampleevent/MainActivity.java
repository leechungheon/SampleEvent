package com.example.sampleevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.motion.MotionUtils;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    GestureDetector detector;

    @Override
    protected void onStart() {
        super.onStart();

        showToast("onStart 호출됨");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToast("onStop 호출됨");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("onDestroy 호출됨");
    }

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("onCreate 호출됨");
    }

    public void showToast(String data){
        Toast.makeText(this, data, Toast.LENGTH_LONG).show();
    }

}