package com.example.eventhandler;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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

        public double calculateSum()

        btnEvaluate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = edtName.getText().toString().trim();
                String age = edtAge.getText().toString().trim();

                Toast.makeText(getApplicationContext(), name + " " + age, Toast.LENGTH_SHORT).show();
            }
        });
    }
}