package com.example.pratical_4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class SecondActivity extends AppCompatActivity {
    //    String message =mMassageEditText.getText().toString();
//    intent.putExtra(EXTRA_MESSAGE , message);heelo
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_REPLY =

            "com.example.pratical_4.SecondActivity.EXTRA_REPLY";


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message =intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);
    }

    public void luanchSecondActivity(View view) {
        Log.d(LOG_TAG,"Button clicked");
        Intent intent = new Intent();
        EditText mMassageEditText = findViewById(R.id.edittext_main);
        String message = mMassageEditText.getText().toString();

        intent.putExtra(EXTRA_REPLY, message);
        setResult(RESULT_OK, intent);
        finish();
    }

}