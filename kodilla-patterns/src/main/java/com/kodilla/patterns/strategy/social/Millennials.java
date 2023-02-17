package com.kodilla.patterns.strategy.social;

public non-sealed class Millennials extends User {

    public Millennials(String username) {
        super(username);
        this.socialPublisher = new FacebookPublisher();
    }
}
