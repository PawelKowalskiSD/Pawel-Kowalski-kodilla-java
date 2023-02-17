package com.kodilla.patterns.strategy.social;

public non-sealed class YGeneration extends User {


    public YGeneration(String username) {
        super(username);
        this.socialPublisher = new SnapchatPublisher();
    }
}
