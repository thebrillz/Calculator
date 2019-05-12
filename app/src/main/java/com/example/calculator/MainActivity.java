package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6); //buttons for the calculator

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText1);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                TextView result = (TextView) findViewById(R.id.textView);

                float num1 = Float.parseFloat(editText.getText().toString());
                float num2 = Float.parseFloat(editText2.getText().toString());
                float res = num1 + num2;
                result.setText(res + "");

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText1);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                TextView result = (TextView) findViewById(R.id.textView);

                float num1 = Float.parseFloat(editText.getText().toString());
                float num2 = Float.parseFloat(editText2.getText().toString());
                float res = num1 - num2;
                result.setText(res + "");

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText1);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                TextView result = (TextView) findViewById(R.id.textView);

                float num1 = Float.parseFloat(editText.getText().toString());
                float num2 = Float.parseFloat(editText2.getText().toString());
                float res = num1 * num2;
                result.setText(res + "");

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText1);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                TextView result = (TextView) findViewById(R.id.textView);

                float num1 = Float.parseFloat(editText.getText().toString());
                float num2 = Float.parseFloat(editText2.getText().toString());
                float res = num1/ num2;
                result.setText(res + "");

            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText1);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                TextView result = (TextView) findViewById(R.id.textView);

                double num1 = Double.parseDouble(editText.getText().toString());
                double num2 = Double.parseDouble(editText2.getText().toString());
                double res = Math.pow(num1,num2 );

                result.setText(res + "");

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText1);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                TextView result = (TextView) findViewById(R.id.textView);

                float num1 = Float.parseFloat(editText.getText().toString());
                float num2 = Float.parseFloat(editText2.getText().toString());
                float res = num1 % num2;
                result.setText(res + "");

            }
        });


    }
}
