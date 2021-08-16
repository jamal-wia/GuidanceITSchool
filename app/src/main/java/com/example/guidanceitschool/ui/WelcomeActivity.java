package com.example.guidanceitschool.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.guidanceitschool.R;

public class WelcomeActivity extends AppCompatActivity {

    private Button signUpButton;
    private TextView signInTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initViews();
    }

    private void initViews() {
        signUpButton = findViewById(R.id.sign_up_button_welcome);
        signInTextView = findViewById(R.id.sign_in_text_welcome);

        signUpButton.setOnClickListener(v -> {
            startActivity(new Intent(this, SignUpActivity.class));
        });
        signInTextView.setOnClickListener(v -> {
            startActivity(new Intent(this, SignInActivity.class));
        });
    }
}
