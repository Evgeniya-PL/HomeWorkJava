package homework2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        int[] arrOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = arrOne[i] == 1 ? 0 : 1;
        }
        System.out.println(Arrays.toString(arrOne));

        int[] arrTwo = new int[8];
        for (int i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = i * 3 + 1;
        }
        System.out.println(Arrays.toString(arrTwo));

        int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int c = 0; c < arrThree.length; c++) {
            if (arrThree[c] < 6) arrThree[c] *= 2;
        }
        System.out.println(Arrays.toString(arrThree));

        int[] arrFour = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = arrFour[0];
        int min = arrFour[0];
        for (int d = 0; d < arrFour.length; d++) {
            if (arrFour[d] > max) {
                max = arrFour[d];
            }
            if (arrFour[d] < min) {
                min = arrFour[d];
            }
        }
        System.out.println(min + " " + max);

        int[][] arrFive = new int[5][5];
        for (int e = 0; e < arrFive.length; e++) {
            for (int f = 0; f < arrFive.length; f++) {
                if (e == f) {
                    System.out.print(1);
                } else {
                    System.out.print("");
                }
                System.out.print(arrFive[e][f]);
            }
            System.out.println();
        }
    }
}
