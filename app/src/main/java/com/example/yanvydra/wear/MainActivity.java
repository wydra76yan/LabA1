package com.example.yanvydra.wear;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
             button.setBackgroundColor(Color.RED);
             button2.setBackgroundColor(Color.BLUE);
             button3.setBackgroundColor(Color.GREEN);
             button4.setBackgroundColor(Color.YELLOW);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                button.setBackgroundColor(Color.BLACK);
                button2.setBackgroundColor(Color.MAGENTA);
                button3.setBackgroundColor(Color.DKGRAY);
                button4.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                button.setBackgroundColor(Color.LTGRAY);
                button2.setBackgroundColor(Color.YELLOW);
                button3.setBackgroundColor(Color.RED);
                button4.setBackgroundColor(Color.YELLOW);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                button.setBackgroundColor(Color.BLACK);
                button2.setBackgroundColor(Color.BLACK);
                button3.setBackgroundColor(Color.BLACK);
                button4.setBackgroundColor(Color.BLACK);
            }
        });


    }

}
//в xml selectore первой кнопки указать background последующей
