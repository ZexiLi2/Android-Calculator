package com.example.calculadosra;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3,btn4, btn5, btn6, btn7, btn8, btn9,btndeci, btnsuma,btnresta, btnmult, btndivi, btnigual, btnAc;
    TextView txtresult;
    String operation = "";
    double num1, num2, result;

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

        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btndeci = findViewById(R.id.buttonDot);
        btnigual = findViewById(R.id.buttonEqual);
        btnsuma = findViewById(R.id.buttonPlus);
        btnresta = findViewById(R.id.buttonMin);
        btnmult = findViewById(R.id.buttonMult);
        btndivi = findViewById(R.id.buttonSb);
        txtresult = findViewById(R.id.textView);
        btnAc = findViewById(R.id.buttonAC);

        //numeros here
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult.setText(txtresult.getText().toString()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult.setText(txtresult.getText().toString()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult.setText(txtresult.getText().toString()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult.setText(txtresult.getText().toString()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult.setText(txtresult.getText().toString()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult.setText(txtresult.getText().toString()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult.setText(txtresult.getText().toString()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult.setText(txtresult.getText().toString()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult.setText(txtresult.getText().toString()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult.setText(txtresult.getText().toString()+"9");
            }
        });
        btndeci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult.setText(txtresult.getText().toString()+".");
            }
        });
//other buttons here!
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation= "+";
                num1 = Double.parseDouble(txtresult.getText().toString());
                txtresult.setText("");
            }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation= "-";
                num1 = Double.parseDouble(txtresult.getText().toString());
                txtresult.setText("");
            }
        });
        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation= "*";
                num1 = Double.parseDouble(txtresult.getText().toString());
                txtresult.setText("");
            }
        });
        btndivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation= "/";
                num1 = Double.parseDouble(txtresult.getText().toString());
                txtresult.setText("");
            }
        });
        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult.setText("");
            }
        });

        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = Double.parseDouble(txtresult.getText().toString());
                if (operation.equals("+")){
                    txtresult.setText("");
                    result = num1 + num2;
                }
                if (operation.equals("-")){
                    txtresult.setText("");
                    result = num1 - num2;
                }
                if (operation.equals("*")){
                    txtresult.setText("");
                    result = num1 * num2;
                }
                if (operation.equals("/")){
                    txtresult.setText("");
                    result = num1 / num2;
                }

                else{
                    txtresult.setText("ERR0R");
                }
                txtresult.setText(String.valueOf(result));
            }
        });
    }
}