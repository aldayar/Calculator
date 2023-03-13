package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer first, second;
    private Boolean isOperationClick=false;

    private Integer result;

    private String operationSelected;
    private String operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.view);

    }

    @SuppressLint("NonConstantResourceId")
    public void onNumberClick(View view) {

            switch (view.getId()) {
                case R.id.num1:
                    if (textView.getText().toString().equals("0") || isOperationClick) {
                        textView.setText("1");
                    } else {
                        textView.append("1");
                    }
                    isOperationClick = false;
                    break;
                case R.id.num2:
                    if (textView.getText().toString().equals("0") || isOperationClick) {
                        textView.setText("2");
                    } else {
                        textView.append("2");
                    }
                    isOperationClick = false;
                    break;
                case R.id.num3:
                    if (textView.getText().toString().equals("0") || isOperationClick) {
                        textView.setText("3");
                    } else {
                        textView.append("3");
                    }
                    isOperationClick = false;
                    break;
                case R.id.num4:
                    if (textView.getText().toString().equals("0") || isOperationClick) {
                        textView.setText("4");
                    } else {
                        textView.append("4");
                    }
                    isOperationClick = false;
                    break;
                case R.id.num5:
                    if (textView.getText().toString().equals("0") || isOperationClick) {
                        textView.setText("5");
                    } else {
                        textView.append("5");
                    }
                    isOperationClick = false;
                    break;
                case R.id.num6:
                    if (textView.getText().toString().equals("0") || isOperationClick) {
                        textView.setText("6");
                    } else {
                        textView.append("6");
                    }
                    isOperationClick = false;
                    break;
                case R.id.num7:
                    if (textView.getText().toString().equals("0") || isOperationClick ) {
                        textView.setText("7");
                    } else {
                        textView.append("7");
                    }
                    isOperationClick = false;
                    break;
                case R.id.num8:
                    if (textView.getText().toString().equals("0") || isOperationClick) {
                        textView.setText("8");
                    } else {
                        textView.append("8");
                    }
                    isOperationClick = false;
                    break;
                case R.id.num9:
                    if (textView.getText().toString().equals("0") || isOperationClick) {
                        textView.setText("9");
                    } else {
                        textView.append("9");
                    }
                    isOperationClick = false;
                    break;
                case R.id.num0:
                    if (textView.getText().toString().equals("0") || isOperationClick) {
                        textView.setText("0");
                    } else {
                        textView.append("0");
                    }
                    isOperationClick = false;
                    break;
                case R.id.btn_clean:
                    textView.setText("0");
                    first = 0;
                    second = 0;
                    break;
            }
        }


        @SuppressLint("NonConstantResourceId")
        public void onOperationClick (View view){
            switch (view.getId()) {
                case R.id.plus_btn:
                    first = Integer.parseInt(textView.getText().toString());
                    operationSelected = "+";
                    isOperationClick = true;
                    break;
                case R.id.minius_btn:
                    first = Integer.parseInt(textView.getText().toString());
                    operationSelected = "-";
                    isOperationClick = true;
                    break;
                case R.id.multiplication_btn:
                    first = Integer.parseInt(textView.getText().toString());
                    operationSelected = "x";
                    isOperationClick = true;
                    break;
                case R.id.divishion_btn:
                    first = Integer.parseInt(textView.getText().toString());
                    operationSelected = "÷";
                    isOperationClick = true;
                    break;
                case R.id.equal_btn:
                    second = Integer.parseInt(textView.getText().toString());
                    switch (operationSelected) {
                        case "+":
                            result = first + second;
                            operation = String.valueOf(result);
                            break;
                        case "-":
                            result = first - second;
                            operation = String.valueOf(result);
                            break;
                        case "x":
                            result = first * second;
                            operation = String.valueOf(result);
                            break;
                        case "÷":
                            result = first / second;
                            operation = String.valueOf(result);
                            break;
                    }
                    textView.setText(result.toString());
                    isOperationClick = true;
                    break;


            }
        }
    }

