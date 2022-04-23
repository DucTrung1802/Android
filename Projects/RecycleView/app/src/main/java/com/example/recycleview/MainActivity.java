package com.example.recycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    //  Bước 1: Xác định đối tượng mình muốn hiển thị danh sách
    //  Bước 2: Thêm recycleview vào phần layout main_activity.xml và đặt id cũng như khai báo biến
    //  đối tượng và mapping recycleview trong file java
    //  Bước 3: Tạo layout hàng là item_row cho dữ liệu
    //  Bước 4: Tạo adapter để đổ dữ liệu lên recycleview tức là cho thằng dữ liệu đổ vào thằng
    //  layout thứ 2 từ layout đến recycleview
    //  4.1 Kế thừa ViewHolder để mapping đến laypout item_row mà mình tạo ra

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}