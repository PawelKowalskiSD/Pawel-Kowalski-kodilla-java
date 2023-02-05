package com.kodilla.good.patterns.challenges;

public class User {

    private final String name;
    private final String surname;
    private final String shippingAddress;
    private final String emailAddress;
    private final String phoneNumber;

    public User(String name, String surname, String shippingAddress, String emailAddress, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.shippingAddress = shippingAddress;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
