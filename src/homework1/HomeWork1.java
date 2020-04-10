package homework1;

public class HomeWork1 {

    public static void main(String[] args) {
    }
    private static float ExampleOne ( int a, int b, int c, int d){
        float result = a * (b + (c / d));
        a = 5;
        b = 3;
        c = 9;
        d = 2;

        System.out.println(result);
        return result;
    }
    private static boolean ExampleTwo ( int x, int y){
        if (10 <= (x + y) && (x + y) <= 20) {
            return true;
        } else {
            return false;
        }
    }
    private static void ExampleThree ( int number){
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    private static void ExampleFour (String name){
        System.out.println("Привет," + name);
    }
    private static void ExampleFive ( int year){
        if ((year % 4 == 0) && (year % 100 > 0) || (year % 400 == 0)) {
            System.out.println("Год високосный.");
        } else {
            System.out.println("Год не високосный.");
        }
    }
}
