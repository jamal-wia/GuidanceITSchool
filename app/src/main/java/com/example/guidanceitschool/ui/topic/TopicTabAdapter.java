package com.example.guidanceitschool.ui.topic;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.guidanceitschool.models.TheoreticalTopic;
import com.example.guidanceitschool.models.Topic;

import java.util.List;

public class TopicTabAdapter extends FragmentStateAdapter {

    private List<Topic> topics;

    public TopicTabAdapter(@NonNull FragmentActivity fragmentActivity, List<Topic> topics) {
        super(fragmentActivity);
        this.topics = topics;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        Topic topic = topics.get(position);
        if (topics.get(position) instanceof TheoreticalTopic) {
            fragment = new TheoreticalTopicFragment();
        } else {
            fragment = new PracticalTopicFragment();
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("topic", topic);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getItemCount() {
        return topics.size();
    }
}
