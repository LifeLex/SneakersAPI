package com.company.sneakerapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Sneaker {
    @Id
    private final UUID id;

    @Column(name = "firstName")
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
