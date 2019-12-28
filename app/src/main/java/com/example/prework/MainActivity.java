package com.example.prework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("Regina", "Button Clicked");
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));   //option Enter for the cast import
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.lightPurple));
            }
        });
        /*findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setText("Goodbye");
            }
        });*/
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setText("Hello from Regina!");
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorAccent));
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.white));
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //grab user input
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();

                //display on set text @textView only if user input exists
                if(TextUtils.isEmpty(newText)){
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Regina!");
                }
                else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }

                ((EditText) findViewById(R.id.editText)).setText("");
            }
        });

    }
}
