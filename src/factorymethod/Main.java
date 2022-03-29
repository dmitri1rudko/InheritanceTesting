package factorymethod;

public class Main {
    public static void main(String[] args) {
        WatchMaker maker = getWatchMaker("Rome");
        Watch watch = maker.createWatch();
        watch.showTime();
    }

    public static WatchMaker getWatchMaker(String maker) {
        if (maker.equals("Digital")) {
            return new DigitalWatchMaker();
        } else if (maker.equals("Rome")) {
            return new RomeWatchMaker();
        } else {
            throw new RuntimeException("Производитель часов не найден");
        }
    }
}
