package com.example.eventhandler;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Bước 1: Khai báo biến đối tượng muốn xử lý logic
    // Bước 2: Mapping đối tượng vừa khai báo đến thằng thư mục layout thông qua method findViewById()
    // Bước 3:
    EditText edtName;
    EditText edtAge;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edt_name);
        edtAge = findViewById(R.id.edt_age);
        btnShow = findViewById(R.id.btn_show);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtName.getText().toString().trim();
                String age = edtAge.getText().toString().trim();

                Toast.makeText(getApplicationContext(), name + " " + age, Toast.LENGTH_SHORT).show();
            }
        });
    }
}