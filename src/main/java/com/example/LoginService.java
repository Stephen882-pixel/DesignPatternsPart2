package com.example;

public class LoginService {
    void registerUser(String name,int age,String email,String city){
        User user = new User.UserBuilder()
                .setEmail(email)
                .setCity(city)
                .setAge(age)
                .setName(name)
                .build();
        System.out.println("The user has been successfully registered: " + user);
    }
}


