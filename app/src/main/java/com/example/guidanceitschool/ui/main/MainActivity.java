package com.example.guidanceitschool.ui.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guidanceitschool.Lesson;
import com.example.guidanceitschool.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView lessonsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        lessonsRecyclerView = findViewById(R.id.lessons_recyclerview_main);
        LessonsAdapter adapter = new LessonsAdapter();
        lessonsRecyclerView.setAdapter(adapter);
        adapter.submitList(Lesson.getLessons());
    }
}