package ru.java.courses.sports;

public class Athlete {
    private String name;
    private boolean active = true;

    public Athlete(String name) {
        if (name != null && !name.equals("")){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Имя не может быть пустым2");
        }

    }

    public String getName() {
        return name;
    }

    public final void setName(String newName) {
        if (newName != null && !newName.equals("")) {
            this.name = newName;
        } else {
            throw new IllegalArgumentException("У спортсмена всегда должно быть имя!");
        }
    }

    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
}
