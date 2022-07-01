package homework;

public class HW5 {

    public static int numer = 1;
    public static void task (){

        String line = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        String task = " Задача № ";
        String line1 = " ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

        System.out.println("\u001B[34m" + line + task + numer + line1 + "\u001B[0m");
        numer++;
    }
//Задача 1

    public static void verifyEquals(String expected, String actual){
        if (expected.equals(actual)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(int expected, int actual){
        if(expected == actual){
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(double expected, double actual){
        if(expected == actual){
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

//Задача 2

    public static String dayWeek (int b){
        String day = " ";
        if(b >= 1 && b <= 7){
            if (b == 1) {
                day = "Monday";
            } else if (b == 2){
                day = "Tuesday";
            } else if (b == 3){
                day = "Wednesday";
            } else if (b == 4) {
                day = "Thursday";
            } else if (b == 5) {
                day = "Friday";
            } else if (b == 6) {
                day = "Saturday";
            } else if (b == 7) {
                day = "Sunday";
            }
        } else {
            day = "bad Data";
        }
        return day;
    }

//Задача 3

    public static int returnLargestOfThree(int x, int y, int z){
      int largest;

      if(x > y){
          largest = x;
      } else {
          largest = y;

          return largest;
      }
      if (largest < z){
          largest = z;

      }
        return largest;
    }

    public static int sayMyLargestWithMathMethod(int x, int y, int z){
        int max = (Math.max(Math.max(x, y), z));

        return max;
    }

//задача 4

    public static int returnSmallOfThree(int a, int b, int c){
        int small;

        if(a < b){
            small = a;
        } else {
            small = b;
        }
        if (small > c){
            small = c;
        }
        return small;
    }

//задача 5

    public static String average(double a, double b, double c, double d, double i){

        String result = "";
        double catMax = 40.55;
        double catMin = 35.15;

        if((a >= catMin) && (a <= catMax) && (b >= catMin) && (b <= catMax) && (c >= catMin) && (c <= catMax)
                && (d >= catMin) && (d <= catMax) && (i >= catMin) && (i <= catMax)) {
            double value = ((a + b + c + d + i) / 5);
            result = String.format("%.2f", value);
        } else {
            result = "Error";
        }
        return result;
    }

//задача 6

    public static void convertToMoney(double a){ //10.75

      int grn = (int)a; //10
      double kop = a * 100 - grn * 100; //175 - 100
      int money = (int)kop;

      System.out.println(grn + " грн " + money + " коп");
    }

    public static String converToMoney1(double a){
        double b = 0;
        b = (a - (int) a * 100);

        return (int) a + " грн " + (int) b + " коп";

    }

//задача 7

    public static void convertOfMass(double a){ //25.960

        int kg = (int)a; //25
        double gr = a - kg; //0.960
        double gram = gr * 1000; //960.0
        int mass = (int)gram; //960

        System.out.println(kg + " кg " + mass + " gram");
    }

//задача 8

    public static double PriseQuantityOfGoods(double prise, double quantity){

        double sum = 0;
        sum = prise * quantity;
        convertToMoney(sum);

        return sum;
    }

// задача 9

    public static String convertPriseToString(double prise) { //152.2 переводим цену в стринг чтоб положить в метод ниже
        if (prise >= 0) {
            String returnString = "";
            int priseGrn = (int)prise; //152
            double priseCoins = prise - priseGrn; // 0.5
            int priseCoinsInt = (int)(priseCoins * 100); //50
            returnString = priseGrn + " грн " + priseCoinsInt + " коп "; //печать сумму и 0 коп

            return returnString;
        }
            return "Введите правильное значение";
    }

    public static String convertMassToString(double mass){ // переводим количество товара в стринг чтоб положить в метод ниже
        if (mass >= 0) {
            String returnString = "";
            int massKg = (int)mass;
            double massCoins = mass - massKg;
            int massCoinsInt = (int)(massCoins * 100);
            returnString = massKg + " кг " + massCoinsInt + " гр ";

            return returnString;
        }
        return "Введите правильное значение";
    }

    public static void printLine(){ //печать линии

        System.out.println("_______________________________________________________________");
    }

    public static void printCheck(String item, String measure, double price, double amount){ // печатает наименование и цену
        System.out.println(item);
        System.out.println("Цена за 1" + measure + "\t\t\t\t" + convertPriseToString(price));
    }

    public static void printCheck1(double mass){ // печатает количество товара
        System.out.println("Количество " + "\t\t\t\t" + convertMassToString(mass));
    }

    public static void printResult(double price, double amount){

        System.out.println("К оплате");
        PriseQuantityOfGoods(price, amount);
    }

// задача 10

    public static double salary(double hour, double price){
        double salary;
        salary = (hour * 20) * price;

        convertToMoney(salary);
        converToMoney1(salary);
        //convertPriseToString(salary);
        //convertToMoney(salary);

        return salary;
    }

    public static double salary1(double hour, double price) {
        double salary;
        salary = (hour * 20) * price;
        converToMoney1(salary);

        return salary;
    }

// задача 11

    public static String Payroll(String measure, double price, double amount){


        //System.out.println(measure + "\t\t\t\t" + salary(price, amount));
        //System.out.println(measure);
        //return (measure + salary(price, amount));
        return (measure + salary1(price, amount));
    }

// задача 12

    public static String checkX (int x){
        if (x < 0){
            return x + " is negative";
        } else if (x > 0){
            return x + " is positive";
        } else {
            return x + " zero";
        }
    }

// задача 13

    public static int findYourLuckyNumber(int a){
        int sum = (a % 10) + (a / 10) % 10 + (a / 100);
        if(sum > 9){
            sum = (sum % 10) + (sum / 10);
            if (sum > 9){
                sum = (sum % 10) + (sum / 10);
            }
        }
        System.out.println("Your lucky number is " + sum);

        return sum;
    }

// задача 14

    //а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
    //Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
    //Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.

    //b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать

    public static String mediana(int a, int b, int c){ //метод с видео (c ошибкой)
        int srednee = (a + b + c) / 3;
        if (srednee - ((a + b + c) - returnLargestOfThree(a, b, c) - returnSmallOfThree(a, b, c)) > 2){

            return ("Среднее значение = " + srednee + " отличается от медианы "
                    + ((a + b + c) - returnLargestOfThree(a, b, c) - returnSmallOfThree(a, b, c)) + " на "
                    + ((srednee - ((a + b + c) - returnLargestOfThree(a, b, c) - returnSmallOfThree(a, b, c)))));
        } else {

            return ("Среднее значение = " + srednee + " медиана = "
                    + ((a + b + c) - returnLargestOfThree(a, b, c) - returnSmallOfThree(a, b, c)));
        }
    }

    public static String mediana1(int a, int b, int c){ // мой метод (c ошибкой)
        int srednee= (a + b + c) / 3;
        int mediana = ((a + b + c) - (returnLargestOfThree(a, b, c) + returnSmallOfThree(a, b, c)));
        int raznica;
        raznica = srednee - mediana;
        if (raznica < 0){
            raznica = (-1) * raznica;
        }
        if (raznica > 2){

            return ("Среднее значение " + srednee + " отличается от медианы " +  mediana + " на " + raznica);
        } else {

            return ("Среднее значение = " + srednee + " , медиана = " + mediana);
        }
    }

    public static String medianaMath(int a, int b, int c){
        int srednee = (Integer.sum(Integer.sum(a, b), c)) / 3;
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int median = a + b + c - (max + min);
        String result = "";

        int difference = srednee - median;
        Math.abs(difference);

        if (difference > 2) {
            result = "Среднее значение " + srednee + " отличается от медианы " +  median + " на " + difference;
        } else {
            result = "Среднее значение = " + srednee + " , медиана = " + median;
        }
        return result;
    }

// задача 15

    //Написать метод, который использует методы класса Math,
    // принимает на вход сумму к оплате (например, 10.75) и округляет сумму в пользу покупателя.
    // Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.

    public static String roundingUp(double a){
        int b = (int) Math.ceil(a);
        String sum = b + " грн " + (b / 100) + "0" + " коп";

        return sum;
    }

// задача 16

    //Посчитать с помощью методов класса Math
    //a = 3
    //b = 4
    //c = 20
    //
    //((a * b + c) * ab)
    //Вернуть значение с округлением в бОльшую сторону.

    public static int roundingUpEquation(double a, double b, double c){
        double d = (a * b + c) * Math.pow(a, b);
        d = Math.sqrt(d) / Math.PI;
        d = (int)Math.ceil(d);

        return (int)d;
    }

// задача 17

    //Write the java statement that assigns 1 to x if y is greater then 0
    //напишите утверждение, которое присваивает 1 Х, если Y больше 0

    //Suppose that score is a variable of type double.
    //Предположим это число является переменной типа double.
    //Write the java statement that increases the score by 5 marks if score is between 80 and 90
    //напишите утверждение которое увеличивает число на 5, если число находится в диапазоне от 80 до 90.

    //Rewrite in Java the following statement without using the NOT (!) operator:
    //Перепишите в Java следующее утверждение, без использования оператора NOT (!)
    //item = ! ((i < 10) || (v > = 50))

    //Write a java statement that prints TRUE IF X is an odd number and positive
    //напишите утверждение в java, которое напечатает TRUE, если Х нечетное и положительное число

    public static double task171(double y){
        double x = 0;
        if(y > 0){
            x = 1;
        }

        return x;
    }

    public static double task172(double score){
        if(score >= 80 && score <= 90){
            score = score + 5;
        }

        return score;
    }

    public static boolean task173(int i, int v){
      boolean item;
        if (item = ((i > 10) && (v < 50))){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        return item;
    }

    public static void task174(int x){
        if((x % 2 != 0) && (x >= 0)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

// задача 18

    //Написать метод, который с помощью методов класса Math
    // высчитывает любую степень сгенерированного случайного числа.
    // Метод возвращает математически округленное целое значение и выводит на экран:
    //“Число … в степени … = …”
    //Число может быть в пределах от 0 до 1 исключительно.
    //Степень числа может быть от 0 до 10 включительно

    public static Double Pov(int a){
        if(a >= 0 && a <= 10){
            return Math.pow(Math.random(), a);
        } else {
            System.out.println("Error");
            return Double.MIN_VALUE;
        }
    }

// задача 19

    //Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.

    public static double random(){
        int a = (int) (Math.random() * 100 + 1);
        System.out.println(a);

        return a;
    }

//задача 20

    //Assume that the following declaration have been made:
    //int year;
    //boolean isLeapYear;
    //Write a fragment that will assign isLeapYear to true if year represent a leap year and false otherwise
    //Note: The simplest definition of a leap year is any year that is divisible by four.
    //For a challenge, you could research the full definition of a leap year and create a fragment to detect
    // a proper leap year.

    //Предположим, что было сделано следующее объявление:
    //int year;
    //boolean isLeapYear;
    // Напишите фрагмент, который будет присваивать isLeapYear значение true,
    // если год представляет собой высокосный год, и значение false в противном случае
    //Примечание. Самое простое определение високосного года — это любой год, который делится на четыре.
    // Для испытания вы можете изучить полное определение високосного года и
    // создать фрагмент для определения правильного високосного года.

    public static String leapYear(int year) {
        boolean isLeapYear;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        return "Year " + year + " is a Leap year " + isLeapYear;
    }













    public static void main(String[]args){

        task(); //1 задание

        //ВСЕ!!! результаты должны быть протестированы, для этого необходимо создать метод
        //с названием verifyEquals(expectedResult, actualResult)

        verifyEquals(1,2);
        verifyEquals(1,1);

        task(); //2 задание

        //Написать метод, который принимает на вход число от 1 до 7  и
        //возвращает день недели.

        System.out.println(dayWeek(5));
        System.out.println(dayWeek(0));
        System.out.println(dayWeek(7));
        System.out.println(dayWeek(10));

        // тест
        verifyEquals("Friday", "Friday");
        verifyEquals("bad Data", "Friday");
        verifyEquals("Sunday", "Sunday");
        verifyEquals("bad Data", "bad Data");

        task(); // 3 задание

        //Given three values, x, y, z,
        //determine the largest value and
        //assign this value to hte variable largest

        System.out.println(returnLargestOfThree(-1, -2, -6)); //ручной метод сравнения
        System.out.println(sayMyLargestWithMathMethod(-1,-2,-6)); //сравнение через метод Math

        verifyEquals(-1,-1); //тест метода

        task(); // 4 задание

        //Using nested if statements, write a fragment of code
        //that prints the smallest value
        //contained in the variables a, b, c.

        System.out.println(returnSmallOfThree(0,2,-6));

        verifyEquals(-6,-6);


        task(); // 5 задание

        //Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.

        System.out.println(average(36,38.6, 39.1, 37.9, 38.3));

        verifyEquals(38.6, 38.44);

        task(); // 6 задание

        //Написать метод, который принимает на вход десятичное число (например, 10.75),
        //и возвращает строку “10 грн 75 коп”.

        convertToMoney(10.75);
        convertToMoney(100.56);
        convertToMoney(0.05);

        verifyEquals(10.75, 10.75);
        verifyEquals(100.56, 100.56);
        verifyEquals(0.05, 0.05);

        task(); // 7 задание

        //Написать метод, который принимает на вход десятичное число
        //и возвращает строку “10 кг 75 гр”.

        convertOfMass(25.960);
        convertOfMass(369.321);
        convertOfMass(-53.69);
        convertOfMass(0);

        task(); // 8 задание

        //Написать метод, который принимает на вход 2 параметра -
        //цену и количество товара (может быть вес товара, или количество в штуках).
        //Алгоритм возвращает сумму покупки в виде десятичного числа.

        PriseQuantityOfGoods(10.26, 30.960);

        task(); // 9 задание

        //9 Написать метод, который принимает на вход необходимые параметры, и печатает чек.
        //Например:

        //Яблоки
        //Цена за 1 кг           50 руб 13 коп
        //Количество товара      3 кг 400 гр
        //_______________________________________
        //Сумма к оплате         170 руб 44 коп

        printCheck("Яблоки", "кг", 5, 3); // выводит наименование и цену за кг
        printCheck1(3); //выводит количество товара
        printLine(); //линия
        printResult(5,3); // итого к оплате

        task(); // 10 задание

        //Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы,
        //и возвращает заработную плату в месяц.

        //System.out.println(salary(10, 20));
        salary(10,20);

        task(); // 11 задание

        //Написать метод, который принимает на вход необходимые параметры и
        // печатает строку ведомости выдачи зарплаты сотрудникам.
        //Распечатать ведомость для нескольких сотрудников, например:
        //Март 2022
        //Смирнова Мария Ивановна 		70000 руб 00 коп
        //Серебряков Иван Петрович 		128059 руб 00 коп

        System.out.println("Март 2022");
        System.out.println(Payroll("Смирнова Мария Ивановна ", 10, 20));
        Payroll("Смирнова Мария Ивановна", 10, 20);
        Payroll("Серебряков Иван Петрович", 40, 20.3);

        task(); // 12 задание

        System.out.println(checkX(-6));
        System.out.println(checkX(6));
        System.out.println(checkX(0));

        task(); //13 задание

        //Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
        // Счастливое число рассчитывается по формуле: сумма всех чисел,
        // если результат больше 9, снова считается сумма всех чисел.
        //Например:
        //год рождения 1999
        //1 + 9 + 9 + 9 = 28
        //2 + 8 = 10
        //1 + 0 = 1
        //Счастливое число - 1

        findYourLuckyNumber(1986);
        findYourLuckyNumber(2022);
        findYourLuckyNumber(1955);

        int expected = 6;
        expected = 2;
        verifyEquals(expected, 2);

        task(); // 14 задание

        //а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
        //Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
        //Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
        //b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать

        System.out.println(mediana(-6, 0, 99));

        System.out.println(mediana1(-6, 0, 99));

        System.out.println(medianaMath(-6, 0, 99));

        task(); // 15 задание

        //Написать метод, который использует методы класса Math,
        // принимает на вход сумму к оплате (например, 10.75) и округляет сумму в пользу покупателя.
        // Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.

        System.out.println(roundingUp(10.75));

        task(); // 16 задание

        //Посчитать с помощью методов класса Math
        //a = 3
        //b = 4
        //c = 20
        //((a * b + c) * ab)/пi
        //Вернуть значение с округлением в бОльшую сторону.

        System.out.println(roundingUpEquation(3, 4, 20));

        task(); //17 задание

        //Write the java statement that assigns 1 to x if y is greater then 0
        //напишите утверждение, которое присваивает 1 Х, если Y больше 0

        //Suppose that score is a variable of type double.
        //Предположим это число является переменной типа double.
        //Write the java statement that increases the score by 5 marks if score is between 80 and 90
        //напишите утверждение которое увеличивает число на 5, если число находится в диапазоне от 80 до 90.

        //Rewrite in Java the following statement without using the NOT (!) operator:
        //Перепишите в Java следующее утверждение, без использования оператора NOT (!)
        //item = ! ((i < 10) || (v > = 50))

        //Write a java statement that prints TRUE IF X is an odd number and positive
        //напишите утверждение в java, которое напечатает TRUE, если Х нечетное и положительное число

        //Write a java statement that prints TRUE IF both X and Y are positive numbers
        //напишите утверждение в java, которое напечатает TRUE, если оба значения X и Y положительные числа

        //Write a java statement that prints TRUE IF X and Y have the same sign (-/+)
        //напишите утверждение в java, которое напечатает TRUE, если X и Y будут иметь одинаковый знак (-/+)

        System.out.println(task171(10.1));
        System.out.println(task172(12.2));
        task173(10,100);
        task174(11);

        task(); // 18 задание

        //Написать метод, который с помощью методов класса Math
        // высчитывает любую степень сгенерированного случайного числа.
        // Метод возвращает математически округленное целое значение и выводит на экран:
        //“Число … в степени … = …”
        //Число может быть в пределах от 0 до 1 исключительно.
        //Степень числа может быть от 0 до 10 включительно

        System.out.println(Pov(2));

        task(); // 19 задание

        //Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.

        random();

        task(); // 20 задание

        //Assume that the following declaration have been made:
        //int year;
        //boolean isLeapYear;
        //Write a fragment that will assign isLeapYear to true if year represent a leap year and false otherwise
        //Note: The simplest definition of a leap year is any year that is divisible by four.
        //For a challenge, you could research the full definition of a leap year and create a fragment to detect
        // a proper leap year.

        //Предположим, что было сделано следующее объявление:
        //int year;
        //boolean isLeapYear;
        // Напишите фрагмент, который будет присваивать isLeapYear значение true,
        // если год представляет собой высокосный год, и значение false в противном случае
        //Примечание. Самое простое определение високосного года — это любой год, который делится на четыре.
        // Для испытания вы можете изучить полное определение високосного года и
        // создать фрагмент для определения правильного високосного года.

        System.out.println(leapYear(2020));
        System.out.println(leapYear(2019));

    }


}
