package com.example;

public class EmailService {
    void sendWelomeEmail(){
        User user = new User.UserBuilder()
                .setEmail("sam@example.com")
                .setAddress("Rhapta 80")
                .build();
        System.out.println("Welcome email has been sent successfully: " + user);
    }
}



