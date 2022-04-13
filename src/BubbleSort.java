public class BubbleSort {
    public static void main(String[] args) {
        show(ar);
        bubbleSort(ar);
        show(ar);
    }

    static int[] ar = {3, 3234,2235,3,43426,6,22344,543535,63,6447,8,4,3,554,6,5,65474,57,347,34,74,5,6,5,6};

    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
    }

    public static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
