package com.coder.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText numberText1;
    EditText numberText2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        numberText1 = findViewById(R.id.numberText1);
        numberText2 = findViewById(R.id.numberText2);
        resultText = findViewById(R.id.textView);
    }

    public void sum(View view){
        if(numberText1.getText().toString().matches("")||numberText2.getText().toString().matches("")){
            resultText.setText("Enter Number Please!");
        }else{
            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            double result = number1+number2;
            resultText.setText("Result : "+result);
        }



    }

    public void deduct(View view){
        if(numberText1.getText().toString().matches("")||numberText2.getText().toString().matches("")){
            resultText.setText("Enter Number Please!");
        }else{
            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            double result = number1-number2;
            resultText.setText("Result : "+result);
        }
    }

    public void multiply(View view){
        if(numberText1.getText().toString().matches("")||numberText2.getText().toString().matches("")){
            resultText.setText("Enter Number Please!");
        }else{
            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            double result = number1*number2;
            resultText.setText("Result : "+result);
        }

    }

    public void divide(View view){
        if(numberText1.getText().toString().matches("")||numberText2.getText().toString().matches("")){
            resultText.setText("Enter Number Please!");
        }else{
            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            double result = number1/number2;
            resultText.setText("Result : "+result);
        }

    }
}