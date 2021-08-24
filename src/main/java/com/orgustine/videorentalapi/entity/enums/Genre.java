package com.orgustine.videorentalapi.entity.enums;

public enum Genre {
    ACTION(5),
    DRAMA,
    ROMANCE,
    COMEDY,
    HORROR;
    private int age;

    Genre() {
    }

    Genre(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
