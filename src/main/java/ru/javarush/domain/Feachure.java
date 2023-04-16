package ru.javarush.domain;

import static java.util.Objects.isNull;

public enum Feachure {

    TRAILERS("Trailers"),
    COMMENTARIES("Commentaries"),
    DELETED_SCENES("Deleted Scenes"),
    BEHIND_THE_SCENES("Behind the Scenes");

    private final String value;

    Feachure(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Feachure getFeatureByValue(String value){
        if (isNull(value) || value.isEmpty()) {
            return null;
        }

        Feachure[] features = Feachure.values();
        for (Feachure feature: features) {
            if (feature.value.equals(value)) {
                return feature;
            }
        }
        return null;
    }
}
