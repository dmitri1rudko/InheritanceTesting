package test2;

public class DigitalKey implements Key {
    @Override
    public void open() {
        System.out.println("Open a door with digital key");
    }

    public void putDigitalKey() {
        TurningKey turningKey = new TurningKey();
        turningKey.m = "dsad";
    }
}
