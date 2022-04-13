public class ArrayTest {
    public static void main(String[] args) {
        int[][] array = {
                {1},
                {2, 2},
                {3, 3, 3}
        };

        for (int dex = 0; dex < array[0].length; dex++) {
            for (int i = 0; i < array[dex].length; i++) {
                System.out.println(array[2][dex]);
            }
        }
    }
}
