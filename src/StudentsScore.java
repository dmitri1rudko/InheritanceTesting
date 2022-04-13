import java.util.Arrays;

public class StudentsScore {
    public static void main(String[] args) {
        int[][][] all = {
                {{1111}, {2222}, {3333}, {4444}}, {

                {2, 4, 3, 5, 2, 5, 4, 5, 3, 5},
                {4, 4, 3, 2, 2, 5, 3, 3, 3, 5},
                {2, 4, 3, 5, 5, 5, 2, 4, 3, 5},
                {3, 5, 2, 2, 2, 3, 3, 5, 3, 5}}
        };

        int sum = 0;
        double counter = 0;

        for(int t = 0; t < all.length; t++) {
            for (int i = 0; i < all[t].length; i++) {
                for (int j = 0; j < all[t][i].length; j++) {
                    System.out.println(all[t][i][j]);
                }
                System.out.println(Arrays.toString(all[t][i]));
            }
            System.out.println(Arrays.deepToString(all[t]));
        }

    }
}
