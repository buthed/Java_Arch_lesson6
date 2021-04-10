package com.tematihonov;

public class Animal {
    private int idAnimal;
    private String type;
    private String name;
    private String habitat;

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public String getName() {
        return name;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getType() {
        return type;
    }
}
