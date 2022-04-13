package test;

public class fdsfsdf {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }
        for (int i : numbers) {
            System.out.println(i);
        }
    }

}
