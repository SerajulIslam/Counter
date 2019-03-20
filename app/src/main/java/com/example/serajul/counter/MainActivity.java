package com.example.serajul.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton =findViewById(R.id.idButtonAdd);
        Button subButton =findViewById(R.id.idButtonSub);
        Button resetButton =findViewById(R.id.ButtonReset);

        final TextView showReselt =findViewById(R.id.idResult);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                showReselt.setText(String.valueOf(i));
            }
        });
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                showReselt.setText(String.valueOf(i));


            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=0;
                showReselt.setText(String.valueOf(i));
            }
        });

    }
}
