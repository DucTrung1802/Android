package com.example.recycleview;

public class Song {
    private int image;
    private String titleSong;

    public Song() {

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitleSong() {
        return titleSong;
    }

    public void setTitleSong(String titleSong) {
        this.titleSong = titleSong;
    }

    public Song(int image, String titleSong) {
        this.image = image;
        this.titleSong = titleSong;
    }
}
