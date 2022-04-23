package com.example.recycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter {
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
