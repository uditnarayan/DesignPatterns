package com.github.uditnarayan.designpatterns.behavioral.strategy;

import java.util.Date;

public class Item {
    private final int id;
    private final String name;
    private final Date expiryDate;

    public Item(int id, String name, Date expiryDate) {
        this.id = id;
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }
}
