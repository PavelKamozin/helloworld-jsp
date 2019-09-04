package org.example.appengine.model;


import org.springframework.stereotype.Component;

@Component
public class Person {

    private int id;
    private String name;

    public Person() {
    }

    public Person(String n) {
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
