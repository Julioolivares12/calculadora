package com.develop.julio.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnsumar,btnrestar,btnmul,btndiv,btnprocesar,btnc;
    private EditText edtdatos;

    double valor1;
    double valor2;

    double rs ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtdatos= findViewById(R.id.edtvalor);
        //botones para calculadora
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);

        //botnones para procesos
        btnsumar = findViewById(R.id.btnsuma);
        btnrestar = findViewById(R.id.btnresta);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);
        btnprocesar = findViewById(R.id.btnprocesar);
        btnc = findViewById(R.id.btnc);

        final int[] funcion = {0};
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = edtdatos.getText().toString();
                data =data+"1";
                edtdatos.setText(data);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = edtdatos.getText().toString();
                data =data+"2";
                edtdatos.setText(data);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = edtdatos.getText().toString();
                data =data+"3";
                edtdatos.setText(data);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = edtdatos.getText().toString();
                data =data+"4";
                edtdatos.setText(data);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = edtdatos.getText().toString();
                data =data+"5";
                edtdatos.setText(data);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = edtdatos.getText().toString();
                data =data+"6";
                edtdatos.setText(data);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = edtdatos.getText().toString();
                data =data+"7";
                edtdatos.setText(data);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = edtdatos.getText().toString();
                data =data+"8";
                edtdatos.setText(data);

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = edtdatos.getText().toString();
                data =data+"9";
                edtdatos.setText(data);

            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = edtdatos.getText().toString();
                data =data+"0";
                edtdatos.setText(data);

            }
        });
        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                funcion[0] = 1;
                valor1 = Double.valueOf(edtdatos.getText().toString());
                edtdatos.setText("");
            }
        });
        btnrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                funcion[0] = 2;
                valor1 = Double.valueOf(edtdatos.getText().toString());
                edtdatos.setText("");
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                funcion[0] = 3;
                valor1 = Double.valueOf(edtdatos.getText().toString());
                edtdatos.setText("");
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                funcion[0] = 4;
                valor1 = Double.valueOf(edtdatos.getText().toString());
                edtdatos.setText("");
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtdatos.setText("");
            }
        });
        btnprocesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor2 = Double.valueOf(edtdatos.getText().toString());
                switch (funcion[0]){

                    case 1:
                        rs = valor1+valor2;

                        break;
                    case 2:
                        rs = valor1-valor2;

                        break;
                    case 3:
                        rs = valor1*valor2;

                        break;
                    case 4:
                        rs = valor1/valor2;
                        break;
                }
                edtdatos.setText(String.valueOf(rs));

            }
        });
    }
}
