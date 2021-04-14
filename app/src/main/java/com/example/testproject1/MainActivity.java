package com.example.testproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Add, Min, Mul, Div;

    EditText Num1, Num2;

    double ans = 0;

    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Add = (Button) findViewById(R.id.button);
        Min = (Button) findViewById(R.id.button2);
        Mul =  (Button) findViewById(R.id.button3);
        Div =  (Button) findViewById(R.id.button4);


        Num1 = (EditText ) findViewById(R.id.FirstNumber);
        Num2 =  (EditText )findViewById(R.id.SecondNumber);

        Result = (TextView) findViewById(R.id.textView);


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String No1 = Num1.getText().toString();
                String No2 = Num2.getText().toString();

                if (No1.isEmpty() || No2.isEmpty() ){

                    Toast.makeText(getApplicationContext(),"Enter Number",Toast.LENGTH_SHORT).show();
                }

                else {

                    double a = Double.parseDouble(Num1.getText().toString());
                    double b = Double.parseDouble(Num2.getText().toString());
                          ans = a + b;

                    String c = String.valueOf(ans);
                    Result.setText(c);
                    ans=0;

                   }
                }

        });

        Min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String No1 = Num1.getText().toString();
                String No2 = Num2.getText().toString();


                if (No1.isEmpty() || No2.isEmpty()){

                    Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();

                }

                else {

                    double N1 = Double.parseDouble(Num1.getText().toString());
                    double N2 = Double.parseDouble(Num2.getText().toString());
                    ans = N1-N2;

                    String c = String.valueOf(ans);
                    Result.setText(c);
                    ans=0;

                }


            }
        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String No1 = Num1.getText().toString();
                String No2 = Num2.getText().toString();

                if (No1.isEmpty() || No2.isEmpty()){

                    Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();

                }

                else {

                    double N1 = Double.parseDouble(Num1.getText().toString());
                    double N2 = Double.parseDouble(Num2.getText().toString());
                    ans = N1 * N2;

                    String c = String.valueOf(ans);
                    Result.setText(c);
                    ans=0;


                }
            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String No1 = Num1.getText().toString();
                String No2 = Num2.getText().toString();

                if (No1.isEmpty() || No2.isEmpty()){

                    Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();

                }
                else {
                    double N1 = Double.parseDouble(Num1.getText().toString());
                    double N2 = Double.parseDouble(Num2.getText().toString());
                    if (N2 != 0) {
                        ans = N1 / N2;
                        String c = String.valueOf(ans);
                        Result.setText(c);
                    }
                    else
                        Toast.makeText(getApplicationContext(), "Enter a valid Number", Toast.LENGTH_SHORT).show();

                }

            }
        });




    }


}