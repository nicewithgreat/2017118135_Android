package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class hellomax extends AppCompatActivity implements View.OnClickListener{

    private final static String TAG = "hellomax";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hellomax);
        setTitle("Page2");
        settupButton();
    }

    @Override
    public void onClick(View v) {
        Intent intent;

//        if(v.getId() == R.id.button){
//            }
        if(v.getId() == R.id.button2){intent = new Intent(hellomax.this , MainActivity.class);
            startActivity(intent);}

    }

    public void settupButton(){
        Button b;
//        b = (Button) findViewById(R.id.button);
//        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, "onPostResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }


}