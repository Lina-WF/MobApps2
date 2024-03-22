package ru.mirea.ushakovaps.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void countSymbols(View view) {
        EditText editText = findViewById(R.id.editText);
        String text = editText.getText().toString();
        int count = text.length();
        Toast toast = Toast.makeText(getApplicationContext(),
                "Студент №23 Группа БСБО-09-21 Кол-во символов: " + count,
                Toast.LENGTH_SHORT);
        toast.show();
    }
}