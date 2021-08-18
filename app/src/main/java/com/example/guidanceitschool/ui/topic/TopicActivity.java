package com.example.guidanceitschool.ui.topic;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.guidanceitschool.R;
import com.example.guidanceitschool.models.Topic;

import java.util.ArrayList;
import java.util.List;

public class TopicActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private List<Topic> topics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);
        topics = (ArrayList) getIntent().getSerializableExtra("topics");

        initViews();
    }

    private void initViews() {
        viewPager = findViewById(R.id.view_pager_topic);
        viewPager.setAdapter(new TopicTabAdapter(this, topics));
    }
}