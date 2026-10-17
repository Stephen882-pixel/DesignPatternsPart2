package com.example;

public class Main {
    public static void main(String[] args) {
        new EmailService().sendWelomeEmail();
        new LoginService().registerUser("Ken",36,"ken@example.com","Nakuru");
        new UserMigration().migrateUser();
    }
}







