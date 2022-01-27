package ru.java.courses.sports;

public class Coach {
    private String name;
    private int experience;

    public Coach(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Имя не может быть пустым1");
        }
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Имя не может быть пустым1");
        }
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


}
