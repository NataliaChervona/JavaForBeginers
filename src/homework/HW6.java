package homework;

public class HW6 {

    public static int number = 1;
    public static void task(){
        String line = " ****************************** ";
        System.out.println("\n" + "\u001B[36m" + line + number + line + "\u001B[0m");
        number++;
    }
//Задача 10
//Написать метод, который принимает на вход параметры start, end, step,
//и печатает последовательность десятичных чисел, начиная с числа start, с шагом step. Точка выхода из цикла-число end.
    public static void task10(double a, double b, double c){
        for (double i = a; i < b; i += c){
            System.out.print(String.format("%.1f", i));
            System.out.print("  ");
        }
    }
    public static void task101(double start, double and, double step){
        if (step > 0) {
            if (start < and) {
                for (double i = start; i < and; i += step) {
                    System.out.println(i);
                }
            } else {
                System.out.println("десятичных чисел соответствующих условию не найдено");
            }
        } else if (step == 0 ) {
            System.out.println("цикл будет выполняться бесконечно");
        } else {
            if (start > and) {
                for (double i = start; i > and; i += step) {
                    System.out.println(i);
                }
            } else {
                System.out.println("десятичных чисел соответствующих условию не найдено");
            }
        }
    }
    public static void task102(double start, double and, double step) {
        //при возрастающем (increasing) значении start < and, step > 0
        //при убывающем (decreasing) значении start > and, step < 0
        if (start < and && step > 0) {
            for (start = start; start < and; start += step) {
                System.out.println(start);
            }
        } else if (start > and && step < 0) {
            for (start = start; start < and; start += step) {
                System.out.println(start);
            }
        } else {
            System.out.println("invalid data");
        }
    }

//задача 11
//Написать метод, который принимает параметр l и печатает последовательность четных чисел от нуля.
// Длина последовательности = l.
    public static void task11(int l){
        int and = 0;

        for (int a = 0; and <= l; a += 2){
                System.out.println(a);
                and++;
        }
    }

//задача 12
//Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
    public static void task12(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(String.format("%2.0f", Math.pow(2, i)));
        }
    }

//задача 13
//Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
    public static String task13() {
        String result1 = "";
        String result2 = "";
        String result3 = "";
        String result4 = "";
        for (int i = 0; i < 10; i++) {
            result1 = result1 + i;
            result2 = result2 + i + i;
            result3 = result3 + i + i + i;
            result4 = result4 + i + i + i + i;
        }
        return result1 + result2 + result3 + result4;
    }

//задача 16
//Написать метод, который принимает параметры n, m, l,
// и печатает последовательность нечетных чисел начиная с числа n, с шагом m, l длина последовательности.
    public static void task16(int n, int m, int l) {//не верное решение
      for (int i = n; i < l; i += m){
          if (i % 2 != 0) {
              System.out.println(i);
              i++;
          }
      }
    }

    public static void task161(int n, int m, int l) {
        if(n % 2 == 0 && m % 2 == 0) {
            System.out.println("все числа четные, начните с другого или измените шаг");
        } else {
            while (l > 0) {
                if (n % 2 != 0) {
                    System.out.print(n + " ");
                    l--;
                }
                n = n + m;
            }
        }
    }

//задача 17
//Сгенерируйте и распечатайте последовательность по формуле:
//n + 1 = n + 2
    public static void task17(int n){
        int l = n + 5;
        for ( ; n < l; n++) {
            System.out.println("[" + (n + 1) + "]" + " = " + (n + 2));
        }
    }

//задача 18
//Написать метод, который принимает параметры l, n, и печатает последовательность чисел,
// начиная с числа n, по формуле для n + 1 члена последовательности:n + 1 = 2n
//Длина последовательности l.
    public static void task18(int n, int l) {
        if (n < l) {
            System.out.println("[" + n + "]" + " = " + n);

            for (; n < l; n++) {
                System.out.println("[" + (n + 1) + "]" + " = " + (2 * n));
            }

        } else {
            System.out.println("invalid data");
        }
    }

//задача 19
//Сгенерируйте последовательность целых положительных двузначных чисел,
// в которых разница между первой цифрой (десятки) и второй цифрой (единицы) не превышает 3.
    public static void task19(){
        int des = 0;
        int ed = 0;
        for (int i = 10; i < 100; i++) {
            des = i / 10;
            ed = i % 10;
            if (des - ed <= 3 && ed - des <= 3) {
                System.out.print(i + " ");
            }
        }
    }

//задача 20
//Написать метод, который вычислит значение функции:
    public static void task20(double x) {
        if (x > 1.5) {
            System.out.println(2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30);
        } else if (x <= 1.5 && x >= 0) {
            System.out.println(x + 1);
        } else {
            System.out.println(x);
        }
    }







    public static void main(String[] args) {
        task();//1
//Распечатать последовательность чисел от 0 до 9 включительно.
        for (int a = 0; a < 10; a++) {
            System.out.print(a + " ");
        }

        task();//2
//Распечатать последовательность чисел от 10 исключительно до 0 включительно.
        for (int a = 9; a > -1; a--) {
            System.out.print(a + " ");
        }

        task();//3
//Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
        for (int a = 50; a < 55; a += 2){
            System.out.print(a + " ");
        }

        task();//4
//Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
        for (int a = 326; a > 300; a--){
            if (a % 7 == 0) {
                System.out.print(a + " ");
            }
        }

        task();//5
//Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
        for (double a = 12; a <= 13; a += 0.1) {
            System.out.print(String.format("%.1f", a));
            System.out.print("  ");
        }

        task();//6
//Распечатать последовательность четных чисел от 215 до 237 включительно
        for (int a = 215; a < 238; a++){
            if (a % 2 == 0){
                System.out.print(a + " ");
            }
        }

        task();//7
//Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
        for (int a = 8; a < 14; a++){
            if (a % 7 == 0){
                System.out.print(a);
            } else {
                System.out.println("нет кратности 7");
            }
        }

        task();//8
//Распечатать последовательность которая начинается с минимального значения типа данных short
// и заканчивается максимальным значением short.
// Числа в последовательности должны быть кратны 15001.
        for (short a = Short.MIN_VALUE; a < Short.MAX_VALUE; a++){
            if (a % 15001 == 0){
                System.out.print(a + "  ");
            }
        }

        task();//9
//Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
// Числа, кратные 11, должны быть распечатаны синим цветом.
// Числа, кратные 12, должны быть распечатаны красным цветом.
// А ноль необходимо распечатать словом ZERO.
        for (int a = -10; a < 35; a++){
            if (a == 0) {
                System.out.print("zero ");
            } else if (a % 11 == 0) {
                System.out.print("\u001B[34m" + a  + " " + "\u001B[0m");
            } else if (a % 12 == 0) {
                System.out.print("\u001B[31m" + a  + " " + "\u001B[0m");
            }
        }

        task();//10
//Написать метод, который принимает на вход параметры start, end, step,
//и печатает последовательность десятичных чисел, начиная с числа start, с шагом step. Точка выхода из цикла-число end.

        task10(1, 10, 3);
        System.out.println("_____________________________________");

        task101(-10, 10, 2);
        System.out.println("_____________________________________");

        //happy path
        task102(10.5, 20.75, 1.29);
        System.out.println("_____________________________________");

        //happy path
        task102(15.9, 0, -1.45);
        System.out.println("_____________________________________");

        //negative
        task102(15.9, 0, 0);
        System.out.println("_____________________________________");

        //negative
        task102(15.9, 0, 1);
        System.out.println("_____________________________________");

        //negative
        task102(-15.9, 0, -1);
        System.out.println("_____________________________________");

        //negative
        task102(0, 0, 1);
        System.out.println("_____________________________________");

        //negative
        task102(0, 0, -1);
        System.out.println("_____________________________________");

        task();//11
//Написать метод, который принимает параметр l и печатает последовательность четных чисел от нуля.
// Длина последовательности = l.
        task11(10);

        task();//12
//Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
        task12(6);

        task();//13
//Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
        System.out.println(task13());

        task();//14
//Распечатайте последовательность чисел: 0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
        for (int i = 0, y = 1; i > -6 || y <= 5; i--, y++) {
            if (i < 6) {
                System.out.print(i + ", " + y + ", ");
            } else {
                System.out.println(i);
            }
        }

        System.out.print("\n" + 0 + ", ");
        for (int y = 1; y < 6; y++) {
            System.out.print(y + ", " + (y * -1) + ", ");
        }

        task();//15
//Распечатать последовательность чисел:
//0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
        for (int a = 0; a < 26;a++){
            if (a % 3 == 0 || a % 5 == 0) {
                System.out.print(a + " ");
            }
        }

        task();//16
//Написать метод, который принимает параметры n, m, l,
// и печатает последовательность нечетных чисел начиная с числа n, с шагом m, l длина последовательности  .
        //task16(1, 2, 10);//не верное решение

        task161(1,2,10);
        System.out.println("\n" + "____________________________");
        task161(1,-22,9);
        System.out.println("\n" + "____________________________");
        task161(1,9,9);
        System.out.println("\n" + "____________________________");
        task161(100,-100,-25);

        task();//17
//Сгенерируйте и распечатайте последовательность по формуле:
//n + 1 = n + 2
        task17(1);

        task();//18
//Написать метод, который принимает параметры l, n, и печатает последовательность чисел,
// начиная с числа n, по формуле для n + 1 члена последовательности:n + 1 = 2n
//Длина последовательности l.
        task18(2,8);
        task18(2,-8);

        task();//19
//Сгенерируйте последовательность целых положительных двузначных чисел,
// в которых разница между первой цифрой (десятки) и второй цифрой (единицы) не превышает 3.
        task19();

        task();//20
//Написать метод, который вычислит значение функции:
        task20(10);


    }
}
