package com.example.readjsonfromfile;

import androidx.annotation.NonNull;

public class Mountain {
    private String name;
    private String location;
    private int size;

    public Mountain(String name, String location, int size) {
        this.name = name;
        this.location = location;
        this.size = size;
    }

    //getters
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public int getSize() {
        return size;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setSize(int size) {
        this.size = size;
    }

    @NonNull
    @Override
    public String toString() {
        return name + " has an altitude of " + size + " meters above sea-level. It is located in " + location + ".";
    }
}
