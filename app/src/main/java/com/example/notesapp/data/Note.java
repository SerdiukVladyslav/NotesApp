package com.example.notesapp.data;

public class Note {
    private int id;
    private String date;
    private String text;

    public Note(int id, String date, String text) {
        this.id = id;
        this.date = date;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getText() {
        return text;
    }
}
