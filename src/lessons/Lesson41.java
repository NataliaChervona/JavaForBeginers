package lessons;

import org.w3c.dom.ls.LSOutput;

public class Lesson41 {

    public static void main(String[] args) {
        task10(5);
        task19(5,25);
        task19(5,5);
        System.out.println(test(-22.2, -33.3));
        System.out.println(test1(2,4));
    }

    public static int task10(int number){
//Проверьте это число на четность. Если число четное, удвойте это число, иначе возведите в квадрат
//Выведите результат работы алгоритма на печать

        if(number % 2 == 0){
            number = number * 2;

        } else {
            number = number * number;
        }

        System.out.println(number);

        return number;
    }

    public static String task19(int actual, int expected){
 //Напишите тест, который валидирует (проверит правильность работы) ваш код в задании
 //input 2 >> expected >> 4, input 5 >> expected >> 25

        String result = " ";

        if (actual == expected){
            result = "Pass";
            System.out.println("\u001B[32m" + result);
        } else {
            result = "Fail";
            System.out.println("\u001B[31m" + result + "\u001B[0m");
        }

        return result;
    }

    public static boolean test(double a, double b){
        double ab = 0;
        ab = a * b;
        boolean flag = true;
        String test = ab + "грн";
        if (ab > 5) {
            flag = false;
        }

        return flag;
    }
    public static boolean test1(double a, double b) {

        return (a * b) > 5;
    }

}