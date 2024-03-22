package ru.mirea.ushakovaps.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("act1", "onCreate()");
    }

    public void onClickNewActivity(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        EditText editText = findViewById(R.id.editText);
        String text = editText.getText().toString();
        intent.putExtra("key", "MIREA - Ушакова Полина Сергеевна");
        intent.putExtra("sent_text", text);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("act1", "onStart()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("act1", "onRestoreInstanceState()");
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.i("act1", "onPostCreate()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("act1", "onResume()");
    }

    @Override
    public void onPostResume() {
        super.onPostResume();
        Log.i("act1", "onPostResume()");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i("act1", "onAttachedToWindow()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("act1", "onPause()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("act1", "onSaveInstanceState()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("act1", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("act1", "onDestroy()");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i("act1", "onDetachedFromWindow()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("act1", "onRestart()");
    }
}