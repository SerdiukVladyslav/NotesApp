package com.example.notesapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import com.example.notesapp.adapters.*;
import com.example.notesapp.data.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        List<Note> noteList = new ArrayList<>();
        noteList.add(new Note(1, "2024-12-05 10:30", "This is the first note."));
        noteList.add(new Note(2, "2024-12-05 11:00", "This is the second note."));
        noteList.add(new Note(3, "2024-12-05 12:00", "This is the third note."));

        NoteAdapter adapter = new NoteAdapter(noteList);
        recyclerView.setAdapter(adapter);
    }
}
