package com.example.recycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //  Bước 1: Xác định đối tượng mình muốn hiển thị danh sách

    //  Bước 2: Thêm recycleview vào phần layout main_activity.xml và đặt id cũng như khai báo biến
    //  đối tượng và mapping recycleview trong file java

    //  Bước 3: Tạo layout hàng là item_row cho dữ liệu

    //  Bước 4: Tạo adapter để đổ dữ liệu lên recycleview tức là cho thằng dữ liệu đổ vào thằng
    //  layout thứ 2 từ layout đến recycleview
    //  4.1 Kế thừa ViewHolder để mapping đến laypout item_row mà mình tạo ra
    //  4.2 Kế thừa tiếp Adapter của RecycleView để đổ dữ liệu lên recycleview

    //  Bước 5: sang MainActivity tạo dữ liệu và đổ dữ liệu lên thằng RecycleView thông qua
    //  CustomAdapter

    RecyclerView recyclerView;
    CustomAdapter customAdapter;
    List<Song> listSong = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleview);
        listSong.add(new Song(R.drawable.ic_baseline_music_note_24, "A"));
        listSong.add(new Song(R.drawable.ic_baseline_music_note_24, "B"));
        listSong.add(new Song(R.drawable.ic_baseline_music_note_24, "C"));
        listSong.add(new Song(R.drawable.ic_baseline_music_note_24, "D"));
        listSong.add(new Song(R.drawable.ic_baseline_music_note_24, "E"));
        listSong.add(new Song(R.drawable.ic_baseline_music_note_24, "F"));
        customAdapter = new CustomAdapter(listSong, this);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,
//                RecyclerView.VERTICAL, false);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(customAdapter);

    }
}