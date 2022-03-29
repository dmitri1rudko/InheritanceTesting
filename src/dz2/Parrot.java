package dz2;

public class Parrot {

    String color;
    String habitat;
    boolean speakable;

    public String toDo(){
        return "Parrot can speak";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setSpeakable(boolean speakable) {
        this.speakable = speakable;
    }

    public String getColor() {
        return color;
    }

    public String getHabitat() {
        return habitat;
    }

    public boolean getSpeakable() {
        return speakable;
    }

}
