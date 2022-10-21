package utils;

public class Utils {

    public static void line() {
        System.out.println("_________________________________________");
    }

    public static void ln() {
        System.out.println( );
    }


    public static void task(int number){
        String line = " ****************************** ";
        System.out.println("\n" + "\u001B[36m" + line + number + line + "\u001B[0m");
        number++;
    }

    public static String verify(int a, int b) {
        if (a == b) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");

            return "Pass";
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");

            return "Fail";
        }
    }

    public static String verify(double a, double b) {
        if (a == b) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");

            return "Pass";
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");

            return "Fail";
        }
    }

    public static String verify(String strin1, String strin2) {
        if (strin1.equals(strin2)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");

            return "Pass";
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");

            return "Fail";
        }
    }
    public static int getRandomInt(int upper, int lower) {
        return (int)(Math.random() * (upper - lower) + lower);
    }

    public static double getRandomDb(int upper, int lower) {
        return ((Math.random() * (upper - lower) + lower));
    }

    public static int[] createArrayRandomInt(int length, int upper, int lower) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomInt(upper,lower);
        }

        return array;
    }




}
