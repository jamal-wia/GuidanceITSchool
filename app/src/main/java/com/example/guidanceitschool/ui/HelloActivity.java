package com.example.guidanceitschool.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guidanceitschool.R;
import com.example.guidanceitschool.ui.main.MainActivity;

public class HelloActivity extends AppCompatActivity {

    private TextView helloTextView;
    private Button forwardButton;

    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        name = getIntent().getStringExtra("name");
        initViews();
    }

    private void initViews() {
        setContentView(R.layout.activity_hello);
        helloTextView = findViewById(R.id.hello_text);
        forwardButton = findViewById(R.id.forward_button_hello);

        helloTextView.setText("Добро пожаловать, " + name + "!");
        forwardButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
    }
}