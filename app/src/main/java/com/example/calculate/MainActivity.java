package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Integer firstVariable, secondVariable;
    private String operation;
    private boolean isFirstVarClick = false;
    private boolean plus = false;
    private boolean minus = false;
    private boolean mul = false;
    private boolean div = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tv_result);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.num_one:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("1");
                } else {
                    tvResult.append("1");
                }

                if (isFirstVarClick) {
                    tvResult.setText("1");
                }
                isFirstVarClick = false;
                break;

            case R.id.num_two:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("2");
                } else {
                    tvResult.append("2");
                }


                if (isFirstVarClick) {
                    tvResult.setText("2");
                }
                isFirstVarClick = false;
                break;

            case R.id.num_three:

                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("3");
                } else {
                    tvResult.append("3");

                }


                if (isFirstVarClick) {
                    tvResult.setText("3");
                }
                isFirstVarClick = false;
                break;

            case R.id.num_four:

                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("4");
                } else {
                    tvResult.append("4");

                }


                if (isFirstVarClick) {
                    tvResult.setText("4");
                }
                isFirstVarClick = false;
                break;

            case R.id.num_five:

                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("5");
                } else {
                    tvResult.append("5");

                }

                if (isFirstVarClick) {
                    tvResult.setText("5");
                }
                isFirstVarClick = false;
                break;
            case R.id.nuM_six:

                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("6");
                } else {
                    tvResult.append("6");

                }

                if (isFirstVarClick) {
                    tvResult.setText("6");
                }
                isFirstVarClick = false;
                break;

            case R.id.num_seven:

                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("7");
                } else {
                    tvResult.append("7");

                }


                if (isFirstVarClick) {
                    tvResult.setText("7");
                }
                isFirstVarClick = false;
                break;

            case R.id.num_eight:

                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("8");
                } else {
                    tvResult.append("8");

                }

                if (isFirstVarClick) {
                    tvResult.setText("8");
                }
                isFirstVarClick = false;
                break;

            case R.id.num_nine:

                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("9");
                } else {
                    tvResult.append("9");

                }

                if (isFirstVarClick) {
                    tvResult.setText("9");
                }
                isFirstVarClick = false;
                break;

            case R.id.num_zero:

                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("0");
                } else {
                    tvResult.append("0");

                }

                if (isFirstVarClick) {
                    tvResult.setText("0");
                }
                isFirstVarClick = false;
                break;

            case R.id.clear:
                tvResult.setText("0");
                tvResult.setTextSize(70f);
                break;

        }
    }

    public void OnOperationClick(View view) {
        switch (view.getId()) {
            case R.id.plus:
                isFirstVarClick = true;
                firstVariable = Integer.parseInt(tvResult.getText().toString());
                operation = "+";
                tvResult.setText(firstVariable + operation);
                break;

            case R.id.minus:
                isFirstVarClick = true;
                firstVariable = Integer.parseInt(tvResult.getText().toString());
                operation = "-";
                tvResult.setText(firstVariable + operation);
                break;

            case R.id.mul:
                isFirstVarClick = true;
                firstVariable = Integer.parseInt(tvResult.getText().toString());
                operation = "*";
                tvResult.setText(firstVariable + operation);
                break;

            case R.id.div:
                isFirstVarClick = true;
                firstVariable = Integer.parseInt(tvResult.getText().toString());
                operation = "/";
                tvResult.setText(firstVariable + operation);
                break;


            case R.id.equal:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("0");

                } else if (operation.equals("+")) {
                    plus = true;
                    String text = tvResult.getText().toString();
                    secondVariable = Integer.parseInt(text);
                    Integer result = firstVariable + secondVariable;

                    tvResult.setText(result.toString());
                    firstVariable = null;
                    secondVariable = null;
                    isFirstVarClick = false;

                } else if (operation.equals("-")) {
                    minus = true;
                    String text = tvResult.getText().toString();
                    secondVariable = Integer.parseInt(text);
                    Integer result = firstVariable - secondVariable;

                    tvResult.setText(result.toString());
                    firstVariable = null;
                    secondVariable = null;
                    isFirstVarClick = false;

                } else if (operation.equals("*")) {
                    mul = true;
                    String text = tvResult.getText().toString();
                    secondVariable = Integer.parseInt(text);
                    Integer result = firstVariable * secondVariable;

                    tvResult.setText(result.toString());
                    firstVariable = null;
                    secondVariable = null;
                    isFirstVarClick = false;

                } else if (operation.equals("/")) {
                    div = true;
                    String text = tvResult.getText().toString();
                    secondVariable = Integer.parseInt(text);
                    Integer result = firstVariable / secondVariable;

                    tvResult.setText(result.toString());
                    firstVariable = null;
                    secondVariable = null;
                    isFirstVarClick = false;
                }
        }
    }
}