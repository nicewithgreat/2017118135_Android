package com.example.hiddenintent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        settupButton();

    }

    public void settupButton(){
        Button b;
        b = (Button) findViewById(R.id.browers);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.tel);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.map);
        b.setOnClickListener(this);

    }

    public void onClick(View v) {

        if(v.getId() == R.id.browers){
            Intent intent = new Intent(Intent.ACTION_VIEW);//
            intent.setData(Uri.parse("https://moodle.hstc.edu.cn"));
            startActivity(intent);
        }
        if(v.getId() == R.id.tel){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:10086"));
            startActivity(intent);
        }
        if(v.getId() == R.id.map){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            //geo:lat,long?z=zoomlevel&q=question-string
            intent.setData(Uri.parse("geo:0,0?z=4&q=business+near+city"));
            startActivity(intent);
        }

    }
}
