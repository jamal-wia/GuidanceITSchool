package com.example.guidanceitschool.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {User.class}, exportSchema = false, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
