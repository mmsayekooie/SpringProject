package com.example.practice.entities;

import javax.persistence.*;

@Entity
public class Biography {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    private String text;
    @OneToOne
    @MapsId
    private Musician musician;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Musician getMusician() {
        return musician;
    }

    public void setMusician(Musician musician) {
        this.musician = musician;
    }
}
