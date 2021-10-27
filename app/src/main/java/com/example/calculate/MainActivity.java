package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Integer firstVariable, secondVariable;
    private String operation;
    private Button sendResultButton;
    private boolean isFirstVarClick = false;
    private boolean plus = false;
    private boolean minus = false;
    private boolean mul = false;
    private boolean div = false;
    private boolean equalClicked = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendResultButton = findViewById(R.id.btn_send_result);
        tvResult = findViewById(R.id.tv_result);
    }


    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.num_one:
                if (tvResult.getText().toString().equals("0") || equalClicked) {
                    tvResult.setText("1");
                    equalClicked = false;
                    sendResultButton.setVisibility(View.INVISIBLE);
                } else {
                    tvResult.append("1");
                }
                if (isFirstVarClick) {
                    tvResult.setText("1");
                }
                isFirstVarClick = false;
                break;
            case R.id.num_two:
                if (tvResult.getText().toString().equals("0") || equalClicked) {
                    tvResult.setText("2");
                    equalClicked = false;
                    sendResultButton.setVisibility(View.INVISIBLE);
                } else {
                    tvResult.append("2");
                }
                if (isFirstVarClick) {
                    tvResult.setText("2");
                }
                isFirstVarClick = false;
                break;
            case R.id.num_three:
                if (tvResult.getText().toString().equals("0") || equalClicked) {
                    tvResult.setText("3");
                    equalClicked = false;
                    sendResultButton.setVisibility(View.INVISIBLE);
                } else {
                    tvResult.append("3");
                }
                if (isFirstVarClick) {
                    tvResult.setText("3");
                }
                isFirstVarClick = false;
                break;
            case R.id.num_four:
                if (tvResult.getText().toString().equals("0") || equalClicked) {
                    tvResult.setText("4");
                    equalClicked = false;
                    sendResultButton.setVisibility(View.INVISIBLE);
                } else {
                    tvResult.append("4");
                }
                if (isFirstVarClick) {
                    tvResult.setText("4");
                }
                isFirstVarClick = false;
                break;
            case R.id.num_five:
                if (tvResult.getText().toString().equals("0") || equalClicked) {
                    tvResult.setText("5");
                    equalClicked = false;
                    sendResultButton.setVisibility(View.INVISIBLE);
                } else {
                    tvResult.append("5");
                }
                if (isFirstVarClick) {
                    tvResult.setText("5");
                }
                isFirstVarClick = false;
                break;
            case R.id.nuM_six:
                if (tvResult.getText().toString().equals("0") || equalClicked) {
                    tvResult.setText("6");
                    equalClicked = false;
                    sendResultButton.setVisibility(View.INVISIBLE);
                } else {
                    tvResult.append("6");
                }
                if (isFirstVarClick) {
                    tvResult.setText("6");
                }
                isFirstVarClick = false;
                break;
            case R.id.num_seven:
                if (tvResult.getText().toString().equals("0") || equalClicked) {
                    tvResult.setText("7");
                    equalClicked = false;
                    sendResultButton.setVisibility(View.INVISIBLE);
                } else {
                    tvResult.append("7");
                }
                if (isFirstVarClick) {
                    tvResult.setText("7");
                }
                isFirstVarClick = false;
                break;
            case R.id.num_eight:
                if (tvResult.getText().toString().equals("0") || equalClicked) {
                    tvResult.setText("8");
                    equalClicked = false;
                    sendResultButton.setVisibility(View.INVISIBLE);
                } else {
                    tvResult.append("8");
                }
                if (isFirstVarClick) {
                    tvResult.setText("8");
                }
                isFirstVarClick = false;
                break;
            case R.id.num_nine:
                if (tvResult.getText().toString().equals("0") || equalClicked) {
                    tvResult.setText("9");
                    equalClicked = false;
                    sendResultButton.setVisibility(View.INVISIBLE);
                } else {
                    tvResult.append("9");
                }
                if (isFirstVarClick) {
                    tvResult.setText("9");
                }
                isFirstVarClick = false;
                break;
            case R.id.num_zero:
                if (tvResult.getText().toString().equals("0") || equalClicked) {
                    tvResult.setText("0");
                    equalClicked = false;
                    sendResultButton.setVisibility(View.INVISIBLE);
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
                equalClicked = true;
                    sendResultButton.setVisibility(View.VISIBLE);
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("0");
                } else if (operation.equals("+")) {
                    String text = tvResult.getText().toString();
                    secondVariable = Integer.parseInt(text);
                    Integer result = firstVariable + secondVariable;

                    tvResult.setText(firstVariable + operation + secondVariable + "=" + result.toString());
                    isFirstVarClick = false;

                } else if (operation.equals("-")) {
                    String text = tvResult.getText().toString();
                    secondVariable = Integer.parseInt(text);
                    Integer result = firstVariable - secondVariable;

                    tvResult.setText(firstVariable + operation + secondVariable + "=" + result.toString());
                    isFirstVarClick = false;

                } else if (operation.equals("*")) {
                    String text = tvResult.getText().toString();
                    secondVariable = Integer.parseInt(text);
                    Integer result = firstVariable * secondVariable;

                    tvResult.setText(firstVariable + operation + secondVariable + "=" + result.toString());
                    isFirstVarClick = false;

                } else if (operation.equals("/")) {
                    String text = tvResult.getText().toString();
                    secondVariable = Integer.parseInt(text);
                    Integer result = firstVariable / secondVariable;

                    tvResult.setText(firstVariable + operation + secondVariable + "=" + result.toString());
                    isFirstVarClick = false;
                }
        }
    }

    public void sendOperation(View view) {
        String allOperation = tvResult.getText().toString();
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("Send key", allOperation);
        startActivity(intent);
    }
}