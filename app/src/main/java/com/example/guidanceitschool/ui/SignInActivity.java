package com.example.guidanceitschool.ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guidanceitschool.App;
import com.example.guidanceitschool.R;
import com.example.guidanceitschool.database.User;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class SignInActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button signInButton;

    private List<User> users = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        initData();
        initViews();
    }

    private void initData() {
        App.instance
                .getAppDatabase()
                .userDao()
                .getUsers()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(users -> {
                    this.users = users;
                });
    }

    private void initViews() {
        emailEditText = findViewById(R.id.email_edit_text_sign_in);
        passwordEditText = findViewById(R.id.password_edit_text_sign_in);
        signInButton = findViewById(R.id.sign_in_button);

        signInButton.setOnClickListener(v -> {
            String email = emailEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            User user = getUserByEmail(email);
            if (user.getEmail().equals(email)
                    && user.getPassword().equals(password)) {
                // TODO открыть main экран
            }
        });
    }

    private User getUserByEmail(String email) {
        User result = null;
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                result = user;
            }
        }
        return result;
    }
}