package ru.mirea.ushakovaps.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String text = (String) getIntent().getSerializableExtra("key");
        String sent_text = (String) getIntent().getSerializableExtra("sent_text");
        TextView textView = findViewById(R.id.textView);
        textView.setText(sent_text);
        Log.i("act2", "onCreate()");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("act2", "onStart()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("act2", "onRestoreInstanceState()");
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.i("act2", "onPostCreate()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("act2", "onResume()");
    }

    @Override
    public void onPostResume() {
        super.onPostResume();
        Log.i("act2", "onPostResume()");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i("act2", "onAttachedToWindow()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("act2", "onPause()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("act2", "onSaveInstanceState()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("act2", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("act2", "onDestroy()");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i("act2", "onDetachedFromWindow()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("act2", "onRestart()");
    }
}