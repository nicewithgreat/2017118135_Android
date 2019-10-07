package com.example.fourmod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Page2 extends AppCompatActivity implements  View.OnClickListener{
    private final static String TAG = "Page2";

    public void onClick(View v) {
        Intent intent;
        if(v.getId() == R.id.button6){
            intent = new Intent(Page2.this , MainActivity.class);
            startActivity(intent);
        }else if (v.getId() == R.id.button5){
            intent = new Intent(Page2.this , Page1.class);
            startActivity(intent);
        }else if (v.getId() == R.id.button4) {
            intent = new Intent(Page2.this, Page2.class);
            startActivity(intent);
        }

    }

    public void settupButton(){
        Button b;
        b = (Button) findViewById(R.id.button6);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.button5);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.button4);
        b.setOnClickListener(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        setTitle("Page2");
        Log.d(TAG, this.toString());
        settupButton();
    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d(TAG, "onStart");
//    }
//
//    @Override
//    protected void onPostResume() {
//        super.onPostResume();
//        Log.d(TAG, "onPostResume");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d(TAG, "onPause");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d(TAG, "onStop");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d(TAG, "onDestroy");
//    }

}
