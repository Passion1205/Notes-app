package com.example.notes.Models;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;


//serialozable - to implement conversion of the state of an object into a byte stream or to send data from one activity to another
@Entity(tableName = "Notes")
public class Notes implements Serializable {

    @PrimaryKey(autoGenerate = true)
    int id=0;

    @ColumnInfo(name = "title" )
    String title="";

    @ColumnInfo(name = "text")
    String text="";

    @ColumnInfo(name = "date")
    String date="";

    @ColumnInfo(name = "pinned")
    boolean pinned = false;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }
}
