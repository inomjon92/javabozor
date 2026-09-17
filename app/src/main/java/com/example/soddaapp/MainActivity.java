package com.example.soddaapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("Hello World! Bu eng sodda Java APK.");
        textView.setTextSize(24);
        setContentView(textView);
    }
}
