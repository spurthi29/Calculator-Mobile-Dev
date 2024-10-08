package com.example.calculator;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix;
    Button btnSeven, btnEight, btnNine, btnZero;
    Button btnAdd, btnSub, btnMul, btnDiv;
    Button btnClear, btnEq, btnDot;
    EditText txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOne = (Button) findViewById(R.id.button_one);
        btnOne.setOnClickListener(this);
        btnTwo = (Button) findViewById(R.id.button_two);
        btnTwo.setOnClickListener(this);
        btnThree = (Button) findViewById(R.id.button_three);
        btnThree.setOnClickListener(this);
        btnFour = (Button) findViewById(R.id.button_four);
        btnFour.setOnClickListener(this);
        btnFive = (Button) findViewById(R.id.button_five);
        btnFive.setOnClickListener(this);
        btnSix = (Button) findViewById(R.id.button_six);
        btnSix.setOnClickListener(this);
        btnSeven = (Button) findViewById(R.id.button_seven);
        btnSeven.setOnClickListener(this);
        btnEight = (Button) findViewById(R.id.button_eight);
        btnEight.setOnClickListener(this);
        btnNine = (Button) findViewById(R.id.button_nine);
        btnNine.setOnClickListener(this);
        btnZero = (Button) findViewById(R.id.button_zero);
        btnZero.setOnClickListener(this);
        btnAdd = (Button) findViewById(R.id.button_add);
        btnAdd.setOnClickListener(this);
        btnSub = (Button) findViewById(R.id.button_sub);
        btnSub.setOnClickListener(this);
        btnMul = (Button) findViewById(R.id.button_mul);
        btnMul.setOnClickListener(this);
        btnDiv = (Button) findViewById(R.id.button_div);
        btnDiv.setOnClickListener(this);
        btnClear = (Button) findViewById(R.id.button_clear);
        btnClear.setOnClickListener(this);
        btnEq = (Button) findViewById(R.id.button_eq);
        btnEq.setOnClickListener(this);
        btnDot = (Button) findViewById(R.id.button_dot);
        btnDot.setOnClickListener(this);
        txtResult = (EditText) findViewById(R.id.txt_result);
        txtResult.setText("");
    }

    public void onClick(View v) {
        if (v.equals(btnOne))
            txtResult.append("1");
        if (v.equals(btnTwo))
            txtResult.append("2");
        if (v.equals(btnThree))
            txtResult.append("3");
        if (v.equals(btnFour))
            txtResult.append("4");
        if (v.equals(btnFive))
            txtResult.append("5");
        if (v.equals(btnSix))
            txtResult.append("6");
        if (v.equals(btnSeven))
            txtResult.append("7");
        if (v.equals(btnEight))
            txtResult.append("8");
        if (v.equals(btnNine))
            txtResult.append("9");
        if (v.equals(btnZero))
            txtResult.append("0");
        if (v.equals(btnDot))
            txtResult.append(".");
        if (v.equals(btnClear))
            txtResult.setText("");

        if (v.equals(btnEq)) {
            try {
                String data = txtResult.getText().toString();
                if (data.contains("/")) {
                    String[] operands = data.split("/");
                    if (operands.length == 2) {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        double result = operand1 / operand2;
                        txtResult.setText(String.valueOf(result));
                    }
                    else {
                        Toast.makeText(getBaseContext(), "Invalid Input",
                                Toast.LENGTH_LONG).show();
                    }
                }

                else if (data.contains("*")) {
                    String[] operands = data.split(Pattern.quote("*"));
                    if (operands.length == 2) {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        double result = operand1 * operand2;
                        txtResult.setText(String.valueOf(result));
                    }
                    else {
                        Toast.makeText(getBaseContext(), "Invalid Input",
                                Toast.LENGTH_LONG).show();
                    }
                }

                else if (data.contains("+")) {
                    String[] operands = data.split(Pattern.quote("+"));
                    if (operands.length == 2) {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        double result = operand1 + operand2;
                        txtResult.setText(String.valueOf(result));
                    }
                    else {
                        Toast.makeText(getBaseContext(), "Invalid Input", Toast.LENGTH_LONG).show();
                    }
                }

                else if (data.contains("-")) {
                    String[] operands = data.split("-");
                    if (operands.length == 2) {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        double result = operand1 - operand2;
                        txtResult.setText(String.valueOf(result));
                    }
                    else {
                        Toast.makeText(getBaseContext(), "Invalid Input", Toast.LENGTH_LONG).show();
                    }
                }
            }

            catch (Exception e) {
                Toast.makeText(getBaseContext(), "Invalid Input", Toast.LENGTH_LONG).show();
            }
        }

        if(v.equals(btnAdd))
            txtResult.append("+");
        if(v.equals(btnSub))
            txtResult.append("-");
        if(v.equals(btnMul))
            txtResult.append("*");
        if(v.equals(btnDiv))
            txtResult.append("/");
    }
}