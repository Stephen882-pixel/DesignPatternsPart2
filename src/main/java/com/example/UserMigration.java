package com.example;

public class UserMigration {
    void migrateUser(){

        User user = new User.UserBuilder()
                .setAge(27)
                .build();
        System.out.println("The user has been migrated successfully: " + user);
    }
}


