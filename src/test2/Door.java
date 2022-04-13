package test2;

public class Door {
    public static void main(String[] args) {

        TurningKey turningKey = new TurningKey();
        turningKey.enterKey();
        turningKey.turnKey();
        turningKey.open(); // interface method
        turningKey.removeKey();

        CardKey cardKey = new CardKey();
        cardKey.insertCardKey();
        cardKey.open();
        cardKey.removeCardKey();

        DigitalKey digitalKey = new DigitalKey();
        digitalKey.putDigitalKey();
        digitalKey.open();
    }
}
