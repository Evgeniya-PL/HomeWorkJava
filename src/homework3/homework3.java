package homework3;

import java.util.Random;
import java.util.Scanner;

public class homework3 {

    private static int fieldSizeX;
    private static int fieldSizeY;
    private static char[][] field;

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static final char Human_Dot = 'X';
    private static final char Ai_Dot = '0';
    private static final char Empty_Dot = '.';


    private static void initMap() {
        fieldSizeX = 3;
        fieldSizeY = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[x][y] = Empty_Dot;
            }
        }
    }

    private static void printMap() {
        System.out.println("_______");
        for (int y = 0; y < fieldSizeY; y++) {
            System.out.print("|");
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[x][y] + "|");
            }
            System.out.println();
        }
    }

    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.printf("Введите координаты X и Y (от 1 до %d) через пробел:", fieldSizeX);
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!(isEmptyCell(y, x) && isValidCell(y, x)));
        field[y][x] = Human_Dot;
    }

    private static boolean isEmptyCell(int y, int x) {
        return field[y][x] == Empty_Dot;
    }

    private static boolean isValidCell(int y, int x) {
        return x >= 0 && x <= fieldSizeX && y >= 0 && y <= fieldSizeY;
    }

    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(y, x));
        field[y][x] = Ai_Dot;
    }

    private static boolean isMapFull() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isEmptyCell(y, x)) return false;
            }
        }
        return true;
    }

   private static boolean checkWin (char a) {
        for (int y = 0; y < fieldSizeY; y++) {
            if (field[0][y] == a && field[1][y] == a && field[2][y] == a) return true;
            if (field[y][0] == a && field[y][1] == a && field[y][2] == a) return true;
            if ((field[0][0] == a && field[1][1] == a && field[2][2] == a) ||
                    (field[2][0] == a && field[1][1] == a && field[0][2] == a))return true;
        }
        return false;
    }

    public static void main(String[] args){
           while (true) {
               initMap();
               printMap();
               while (true) {
                   humanTurn();
                   printMap();
                   if (gameChecks(Human_Dot, "Human win!")) break;
                   aiTurn();
                   printMap();
                   if (gameChecks(Ai_Dot, "Ai win!")) break;
               }
               System.out.println("Play again?");
               if (!SCANNER.next().equals("y"))
                   break;
           }
       }

    private static boolean gameChecks(char human_dot, String s) {
        if (checkWin(human_dot)) {
            System.out.println(s);
            return true;
        }
        if (isMapFull()) {
            System.out.println("Draw!");
            return true;
        }
        return false;
    }
}



