package com.example.practice.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Musician {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    private String name;
    @OneToOne(mappedBy ="musician",cascade = CascadeType.ALL)
    private Biography biography;

    @OneToMany(mappedBy = "musician")
    private Set<Performance> performances;

    @ManyToMany
    @JoinTable(name = "City_of_residence"
    ,joinColumns = @JoinColumn(name= "musician_Id")
    ,inverseJoinColumns =@JoinColumn(name= "city_id"))
    private Set<city> citiesOfResidence;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Biography getBiography() {
        return biography;
    }

    public void setBiography(Biography biography) {
        this.biography = biography;
    }
}
