import java.util.Arrays;

public class leetcodeTwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] error = {9,9,9,9};
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i -1; j < nums.length; j++) {
                if (i + j == target) {
                    res[0] = j;
                    res[1] = i;
                }
            }
        }
        return error;
    }

    public static void main(String[] args) {
        int[] array = {3,3};
        System.out.println(Arrays.toString(twoSum(array, 6)));
    }
}
