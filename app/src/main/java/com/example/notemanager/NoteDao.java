package com.example.notemanager;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import androidx.lifecycle.LiveData;

import java.util.List;

public interface NoteDao {
    //--------------------------------------------- DAO Class --------------------------------------
    //This is a data access class which specifies all the database operations that we want to do on the
    // on the note object
    /* DAO have to be interfaces or abstract classes, because we don't provide the  method body*/

    @Insert
    void insert(Note note);

    @Update
    void update(Note note);

    @Delete
    void delete(Note note);

    @Query("DELETE FROM note_table")
    void deleteAllNotes();

    @Query("SELECT * FROM note_table ORDER BY priority DESC")
    LiveData<List<Note>> getAllNotes();
}
