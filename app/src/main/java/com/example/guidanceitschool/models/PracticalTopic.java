package com.example.guidanceitschool.models;

import java.util.List;

public class PracticalTopic extends Topic {

    private List<String> questions;
    private int rightQuestion;

    public PracticalTopic(List<String> questions, int rightQuestion) {
        this.questions = questions;
        this.rightQuestion = rightQuestion;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public int getRightQuestion() {
        return rightQuestion;
    }
}
