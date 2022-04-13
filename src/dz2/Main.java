package dz2;

public class Main {

    public static void main(String[] args) {

        // Make a fish
        Fish clown = new Fish();
        clown.setBodyShape("Oval");
        clown.setLengthOfFish(9);
        clown.setNumberOfFins(11);
        clown.setFishFamily("Pomacentridae");
        System.out.println("Fish family: " + clown.getFishFamily());
        System.out.println("Fish number of fins: " + clown.getNumberOfFins());
        System.out.println("Fish length: " + clown.getLengthOfFish() + "cm");
        System.out.println("Fish body shape: " + clown.getBodyShape());
        System.out.println(clown.toDo());

        // Make output readable
        makeOutputReadable();

        // Make a parrot
        Parrot cockatiel = new Parrot();
        cockatiel.setColor("White");
        cockatiel.setHabitat("Australia");
        cockatiel.setSpeakable(true);
        System.out.println("Parrot color: " + cockatiel.color);
        System.out.println("Parrot habitat: " + cockatiel.habitat);
        System.out.println("Parrot can speak: " + cockatiel.speakable);
        System.out.println(clown.toDo());

        // Make output readable
        makeOutputReadable();

        // Make a cat
        Cat murzik = new Cat();
        murzik.setName("Murzik");
        murzik.setBehaviour("Home");
        murzik.setColor("Brown");
        murzik.setAge(1);
        System.out.println("Cat name: " + murzik.getName());
        System.out.println("Cat behaviour: " + murzik.getBehaviour());
        System.out.println("Cat color: " + murzik.color);
        System.out.println("Cat age: " + murzik.getAge());
        System.out.println(murzik.toDo());

        // Make output readable
        makeOutputReadable();

        // Make a dog
        Dog jack = new Dog();
        jack.setName("Jack");
        jack.setAge(10);
        jack.setBehaviour("Home");
        jack.setColor("Grey");
        System.out.println("Dog name: " + jack.getName());
        System.out.println("Dog behaviour: " + jack.getBehaviour());
        System.out.println("Dog age: " + jack.getAge());
        System.out.println("Dog color: " + jack.getColor());
        System.out.println(jack.toDo());

    }

    public static void makeOutputReadable(){
        System.out.println("'----------------------'");
    }

}
