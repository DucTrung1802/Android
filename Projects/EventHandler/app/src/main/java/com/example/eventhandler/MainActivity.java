package com.example.eventhandler;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Bước 1: Khai báo biến đối tượng muốn xử lý logic
    // Bước 2: Mapping đối tượng vừa khai báo đến thằng thư mục layout thông qua method findViewById()
    // Bước 3:
    TextView tvSum;
    TextView tvMax;
    TextView tvMin;
    EditText edtNumberA;
    EditText edtNumberB;
    EditText edtNumberC;
    Button btnEvaluate;

    public double calculateSum(double numberA, double numberB, double numberC) {
        return numberA + numberB + numberC;
    }

    public double maxValue(List<Double> array) {
        double max = Collections.max(array);
        return max;
    }

    public double minValue(List<Double> array) {
        double min = Collections.min(array);
        return min;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSum = findViewById(R.id.tvSum);
        tvMax = findViewById(R.id.tvMax);
        tvMin = findViewById(R.id.tvMin);
        edtNumberA = findViewById(R.id.edt_A);
        edtNumberB = findViewById(R.id.edt_B);
        edtNumberC = findViewById(R.id.edt_C);
        btnEvaluate = findViewById(R.id.btn_evaluate);
        List<Double> numberArray= new ArrayList<Double>();

        btnEvaluate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double numberA = Double.parseDouble(edtNumberA.getText().toString().trim());
                double numberB = Double.parseDouble(edtNumberB.getText().toString().trim());
                double numberC = Double.parseDouble(edtNumberC.getText().toString().trim());
                numberArray.add(numberA);
                numberArray.add(numberB);
                numberArray.add(numberC);

                tvSum.setText(String.valueOf(calculateSum(numberA, numberB, numberC)));
                tvMax.setText(String.valueOf(maxValue(numberArray)));
                tvMax.setText(String.valueOf(minValue(numberArray)));
            }
        });
    }
}