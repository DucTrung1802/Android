package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    List<Song> listSong;
    Context mContext;

    public CustomAdapter(List<Song> listSong, Context mContext) {
        this.listSong = listSong;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Convert từ file xml sang view sử dụng LayoutInflater
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_row, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        // Đổ dữ liệu lên view
        holder.imgView.setBackgroundResource(listSong.get(position).getImage());
        holder.tvName.setText(listSong.get(position).getTitleSong());
    }

    @Override
    public int getItemCount() { // là kích thước dữ liệu
        return listSong.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgView;
        public TextView tvName;
        public TextView tvPhone;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            imgView = itemView.findViewById(R.id.img_person);
            tvName = itemView.findViewById(R.id.txt_name);
            tvPhone = itemView.findViewById(R.id.txt_phone);

        }
    }
}
