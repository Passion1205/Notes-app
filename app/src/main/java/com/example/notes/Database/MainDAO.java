package com.example.notes.Database;


import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;


import com.example.notes.Models.Notes;

import java.util.List;

@Dao
public interface MainDAO {

    @Insert(onConflict = REPLACE)
    void insert(Notes notes);

    @Query("SELECT *FROM Notes ORDER BY id DESC")
    List<Notes> getAll();

    @Query("UPDATE Notes SET title= :title, text= :text WHERE id= :id")
    void update(int id, String title, String text);

    @Delete
    void delete(Notes notes);

    @Query("UPDATE Notes SET pinned= :pin WHERE id= :id")
    void pin(int id, boolean pin);
}
