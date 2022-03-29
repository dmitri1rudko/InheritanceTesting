package dz2;

public class Fish {
    String fishFamily;
    String bodyShape;
    int lengthOfFish;
    int numberOfFins;

    public String toDo(){
        return "Fish can swim";
    }

    public void setFishFamily(String fishFamily) {
        this.fishFamily = fishFamily;
    }

    public void setBodyShape(String bodyShape) {
        this.bodyShape = bodyShape;
    }

    public void setLengthOfFish(int lengthOfFish) {
        this.lengthOfFish = lengthOfFish;
    }

    public void setNumberOfFins(int numberOfFins) {
        this.numberOfFins = numberOfFins;
    }

    public String getFishFamily() {
        return fishFamily;
    }

    public String getBodyShape() {
        return bodyShape;
    }

    public int getLengthOfFish() {
        return lengthOfFish;
    }

    public int getNumberOfFins() {
        return numberOfFins;
    }
}
