package com.example.pairprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    Button rec;
    TextView list;
    String times;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec = (Button) findViewById(R.id.record);
        list = (TextView) findViewById(R.id.timelist);
        times = "";
    }

    public void recordAction(View view){
        Date currentTime = Calendar.getInstance().getTime();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        times += currentTime + "\n";
        list.setText(times);
    }
}