package ru.javarush.entity;



public enum Rating {
    G("G"),
    PG("PG"),
    PG13("PG-13"),
    R("R"),
    NC17("NC-17");

    private final String VALUE;


    Rating(String value) {
        this.VALUE = value;
    }
}
