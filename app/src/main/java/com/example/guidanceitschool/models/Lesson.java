package com.example.guidanceitschool.models;

import com.example.guidanceitschool.R;

import java.util.ArrayList;
import java.util.List;

public class Lesson {

    private int id;
    private int image;
    private String title;
    private List<Topic> topics;

    public Lesson(int id, int image, String title, List<Topic> topics) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.topics = topics;
    }

    public int getId() {
        return id;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public static List<Lesson> getLessons() {
        List<Lesson> result = new ArrayList<>();
        for (int i = 0; i < 20; ++i) {
            List<Topic> topics = new ArrayList();

            topics.add(new TheoreticalTopic("bla bla bla"));

            List<String> questions = new ArrayList();
            questions.add("Question - " + i);
            questions.add("Question - " + i + 1);
            questions.add("Question - " + i + 2);
            topics.add(new PracticalTopic(questions, 2));

            result.add(new Lesson(i, R.drawable.ic_launcher, "Урок номер - " + i, topics));
        }
        return result;
    }

    public List<Topic> getTopics() {
        return topics;
    }
}
