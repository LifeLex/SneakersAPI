package com.company.sneakerapi.model;

import java.util.UUID;

public class Sneaker {
    private final UUID id;
    private final String name;

    public Sneaker(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
