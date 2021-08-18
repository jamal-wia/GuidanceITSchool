package com.example.guidanceitschool.ui.topic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.guidanceitschool.R;
import com.example.guidanceitschool.models.TheoreticalTopic;

public class TheoreticalTopicFragment extends Fragment {

    private TheoreticalTopic theoreticalTopic;
    private TextView textTheoretical;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        theoreticalTopic = (TheoreticalTopic) getArguments().getSerializable("topic");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_theoretical_topic, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textTheoretical = view.findViewById(R.id.text_theoretical_topic);
        textTheoretical.setText(theoreticalTopic.getText());
    }
}
