package homework;

import javax.swing.*;

public class HW4 {

    //задание 20
    public static void assertStringResult(String expectResult, String actualResult){
        if (expectResult == actualResult){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    //задание 19
    public static void assertIntegerResult(int expectResult, int actualResult){
        if (expectResult == actualResult){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }

    //задание 18
    public static int getMinValue(int i){
        int al = Integer.MIN_VALUE;

        return al;
    }

    public static int getMaxVaiue(int i){
        int a = Integer.MAX_VALUE;

        return a;
    }

    public static double getPow(int i){
        double a2 = 2;
        a2 = Math.pow(i, a2);

        return a2;
    }

    //задание 17
    public static double tempF;

    public static void makeTemperature(double tempC){
        tempF = tempC * 1.8 + 32;
        System.out.println("Результат температуры в Цельсиях " + tempC + " и в Фаренгейтах " + tempF);
    }

    //задание 16
    public static String derApples(int apple){
        int appleLastNumber = apple % 10;//находим на какое число заканчивается наше число
        String apples = "";//пустая строка для записи
        boolean applesExclusion = (apple % 100 >= 11) && (apple % 100 <= 14);//переменная для исключений 11 - 14
        if (appleLastNumber == 1) { //если окончание 1 - одно яблоко
            apples = "яблоко";
        } else
            if (appleLastNumber == 0 || appleLastNumber >= 5){ //если окончание 0 или больше = 5 - яблок
            apples = "яблок";
        } else
            if (appleLastNumber >= 2){ //если окончание 2 - 4 - яблока
            apples = "яблока";
        } if (applesExclusion){ //если исключение 11 - 14 - яблок
                apples = "яблок";}
        return apples;
    }

    public static String derStudents(int student){
        int studentLastNumber = student % 10;
        boolean studentExclusion = (student % 100 >= 11) && (student % 100 <= 14);
        String students = "";
        if (studentLastNumber == 1){
            students = "ученик";
        } else if (studentLastNumber == 0 || studentLastNumber >= 5){
            students = "учеников";
        } else if (studentLastNumber >= 2){
            students = "ученика";
        } if (studentExclusion){
            students = "учеников";
        }
        return students;
    }

    public static void countApples(int numOfApples, int numOfStudents){
        System.out.println("Если " + numOfApples + " " + derApples(numOfApples) + " поделить на " + numOfStudents
        + " " + derStudents(numOfStudents) + " то каждый ученик получит " + (numOfApples / numOfStudents) + " "
        + derApples(numOfApples / numOfStudents) + " , и " + (numOfApples % numOfStudents) + " "
        + derApples(numOfApples % numOfStudents) + " останется учителю. ");
    }



    //задание 14
    public static void makeMath(int firstNum, int secondNum) {
        int devResult;
        int devBack;
        devResult = firstNum / secondNum;
        devBack = firstNum % secondNum;
        System.out.println("результат деления " + firstNum + " на " + secondNum + " = " + devResult +
                " а остаток от деления = " + devBack);
    }

    //задание 15
    public static void apple(int apple, int student) {
        System.out.println("если " + apple + " яблок поделить на " + student +
                " учеников, то каждый ученик получит по " + apple / student + " яблок и " + apple % student +
                " яблок останется учителю");
    }



            public static void task ( int aa){

                String lb = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
                String task = " Задача № ";
                String rb = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

                System.out.println(lb + task + aa + rb);
            }

            public static void main (String[]args){

                task(3);
                System.out.println(2 == 2 && 7 == 7);

                System.out.println(!(15 < 3));

                System.out.println(("Сосна" == "Дуб") || ("Вишня" == "Клен"));

                System.out.println(!("Сосна" == "Дуб"));

                System.out.println((!(15 < 3)) && (10 > 20));

                String t = "Глаза даны, чтобы видеть";
                String constant = "Глаза даны, чтобы видеть";
                String t1 = "Под третьим этажом находится второй";
                int a = 2;
                int b = 3;
                System.out.println((constant.equals(t)) && (b > a));

                System.out.println((6 / 2 == 3) || (7 * 5 == 20));


                task(4);

                //1) ("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время");

                String t2 = "В минуте 70 секунд";
                int a1 = 60;
                int b1 = 70;
                String t3 = "Работающие часы показывают время";
                String constant1 = "Работающие часы показывают время";
                System.out.println((a1 == b1) || (constant1.equals(t3)));

                //2) !(28 > 7) И !(300/5 = 60);

                System.out.println((!(28 > 7)) && (!(300 / 5 == 60)));

                //3) ("Телевизор - электрический прибор") И ("Стекло - дерево");

                String con = "Телевизор - электрический прибор";
                String con1 = "Телевизор - электрический прибор";
                String con2 = "Стекло - стекло";
                String con3 = "Дерево - дерево";
                System.out.println(con.equals(con1) && con2.equals(con3));

                //4) Не((300 < 100))  → ("Жажду можно утолить водой");

                if (!(300 < 100)) {
                    System.out.println("Жажду можно утолить водой");
                }

                //5) (75 < 81) → (88 = 88)

                if (75 < 81) {
                    System.out.println("80=80");
                }

                task(5);

                //а) Андрей старше Светы. Наташа старше Светы.

                int A = 40;
                int C = 30;
                int H = 35;

                if ((A > C) && (H > C)) {
                    System.out.println("Андрей старше Светы. Наташа старше Светы");
                } else {
                    System.out.println(false);
                }

                //б) На полке стоят учебники, а на столе лежат справочники.

                String book = "На полке стоят учебники";
                String magazin = "На столе лежат справочники";

                if (book == "На полке стоят учебники") {
                    System.out.println("На полке стоят учебники");
                }

                if (magazin == "На столе лежат справочники") {
                    System.out.println("На столе лежат справочники");
                }

                //в) БОльшая часть детей — девочки. Остальные - мальчики.

                int children = 10;
                int girl = 6;

                if (children / 2 < girl) {
                    System.out.println("БОльшая часть детей — девочки.");
                    int boy = children - girl;
                    System.out.println("Остальные - мальчики.");
                }

                task(6);

                //“Водительские права можно получить, только когда исполнится 16 лет.”

                int limit = 16;
                int age = 18;
                if (limit > age) {
                    System.out.println("Водительские права нельзя получить");
                } else {
                    System.out.println("Водительские права можно получить");
                }

                task(7);

                //”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”

                String p1 = "Петя не едет в автобусе";
                String p2 = "При этом читает книгу";
                String p3 = "Не смотрит в окно";

                if (p1 == "Петя не едет в автобусе") {
                    System.out.println("Петя не едет в автобусе");
                }
                if ((p2 == "При этом читает книгу") || (p3 == "Не смотрит в окно")) {
                    System.out.println("При этом читает книгу или не смотрит в окно");
                }

                task(8);

                //"Если с другом ты, это хорошо, а когда наоборот - плохо"

                int I = 1;
                int frend = 2;
                int togiezer = 2;

                if (I + frend == togiezer) {
                    System.out.println("С другом ты, это хорошо");
                } else {
                    System.out.println("Без друга плохо");
                }

                task(9);

                //Записать выражения в виде условий if-else:

                //Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.

                age = 20;
                if (age > 18) {
                    System.out.println("\u001B[32m" + "Ты взрослый");
                } else {
                    System.out.println("\u001B[31m" + "Ты ребенок" + "\u001B[0m");
                }

                //Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.

                String Earth = "мокрая";
                if (Earth == "сухая") {
                    System.out.println("\u001B[32m" + "Нет дождя");
                }
                if (Earth == "мокрая") {
                    System.out.println("\u001B[31m" + "Идет дождь" + "\u001B[0m");
                }

                //Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь. Иначе идет снег.

                String Earth1 = "влажная";
                if (Earth1 == "сухая") {
                    System.out.println("\u001B[32m" + "Нет дождя");
                } else {
                    if (Earth1 == "мокрая") {
                        System.out.println("\u001B[31m" + "Идет дождь");
                    } else {
                        System.out.println("\u001B[34m" + "Идет снег" + "\u001B[0m");
                    }
                }

                //Если на небе тучи, идет дождь, иначе идет “слепой” дождь.

                String Sky = "нет тучи";
                if (Sky == "тучи") {
                    System.out.println("\u001B[32m" + "Идет дождь");
                } else {
                    System.out.println("\u001B[34m" + "Идет “слепой” дождь" + "\u001B[0m");
                }

                //Если сегодня суббота, значит, завтра воскресенье. Если сегодня пятница, значит, вчера был четверг.
                // Иначе вчера был не четверг, а завтра - не воскресенье

                String today = "вторник";
                if (today == "суббота") {
                    System.out.println("\u001B[32m" + "завтра воскресенье");
                } else if (today == "пятница") {
                    System.out.println("\u001B[32m" + "вчера был четверг");
                } else {
                    System.out.println("\u001B[31m" + "вчера был не четверг, а завтра - не воскресенье");
                }

                //Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.

                String cancer = "не свистнул";
                if (cancer == "свистнул") {
                    System.out.println("\u001B[31m" + "прошла вечность");
                } else {
                    System.out.println("\u001B[32m" + "ждите дальше");
                }

                //Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.

                int you = 15;
                String y = "не закончил школу";
                if ((you >= 18) || (y == "закончил школу")) {
                    System.out.println("\u001B[32m" + "ты можешь не жить с родителями");
                } else {
                    System.out.println("\u001B[31m" + "живи с родителями" + "\u001B[0m");
                }


                task(10);

                //Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
                //Выведите результат работы алгоритма на печать.
                //Найдите в презентации, какой блок схеме соответствует ваш алгоритм.

                int x = 0;
                if (x % 2 == 0) {
                    x = x * 2;
                } else {
                    x = x * x;
                }
                System.out.println(x);


                task(11);

                //Напишите алгоритм проверки возраста на соответствие условиям (if-else):
                //Голосовать можно с 18 лет
                //Машину можно водить с 16 лет
                //В школу можно идти с 5 лет
                //Выведите результат работы алгоритма на печать.
                //Найдите в презентации, какой блок схеме соответствует ваш алгоритм.

                int r = 1100;
                if (r >= 18) {
                    System.out.println("Голосовать можно");
                } else {
                    System.out.println("\u001B[31m" + "Голосовать нельзя" + "\u001B[0m");
                }

                if (r >= 16) {
                    System.out.println("Машину можно водить");
                } else {
                    System.out.println("\u001B[31m" + "Машину нельзя водить" + "\u001B[0m");
                }

                if ((r >= 5) && (r < 21)) {
                    System.out.println("В школу можно идти");
                } else {
                    System.out.println("\u001B[31m" + "В школу нельзя идти" + "\u001B[0m");
                }

                task(12);

                //Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
                //5 - выдать похвальную грамоту и перевести в следующий класс
                //4 - перевести в следующий класс
                //3 - дать задание на лето и перевести в следующий класс
                //2 - вызвать родителей и оставить в текущем классе на второй год
                //Выведите результат работы алгоритма на печать.
                //Найдите в презентации, какой блок схеме соответствует ваш алгоритм.

                int grade = 5;
                if (grade == 5) {
                    System.out.println("выдать похвальную грамоту и перевести в следующий класс");
                } else if (grade == 4) {
                    System.out.println("перевести в следующий класс");
                } else if (grade == 3) {
                    System.out.println("дать задание на лето и перевести в следующий класс");
                } else if (grade == 2) {
                    System.out.println("вызвать родителей и оставить в текущем классе на второй год");
                }

                task(13);

                //Напишите алгоритм программы, которая проверяет 2 числа.
                // Программа складывает числа, которые делятся на 3 без остатка, и
                // вычитает числа, которые делятся на 5 без остатка.
                // Программа умножает числа, которые делятся на 2 без остатка,
                // но если хотя бы одно число отрицательное, программа умножает результат предыдущего действия на (-1).
                //Если числа не прошли ни одну проверку, программа выводит на печать ошибку о невозможности произвести действия.

                int v = 30;
                int v1 = 30;
                int result = 0;
                if ((v % 3 == 0) && (v1 % 3 == 0)) {
                    result = (v + v1);
                    System.out.println(result);
                } else if ((v % 5 == 0) && (v1 % 5 == 0)) {
                    result = (v - v1);
                    System.out.println(result);
                } else if ((v % 2 == 0) && (v1 % 2 == 0)) {
                    result = (v * v1);
                    System.out.println(result);
                } else if ((v < 0) || (v1 < 0)) {
                    result = result * -1;
                    System.out.println(result);
                } else {
                    System.out.println("error");
                }

                task(14);

                //Распечатать следующие выражения, используя метод и параметры:
                //Результат деления k на l = …, а остаток от деления  = …
                //Результат деления k на m = …, а остаток от деления  = …
                //Результат деления l на m = …, а остаток от деления  = …
                //Результат деления m на k = …, а остаток от деления  = …
                //И так далее все возможные варианты.
                //Сравнить код из HW2 с кодом из HW4. Что для вас легче?

                int k = 2;
                int l = 3;
                int m = 4;

                makeMath(k, l);
                makeMath(k, m);
                makeMath(k, k);

                makeMath(l, k);
                makeMath(l, l);
                makeMath(l, m);

                makeMath(m, k);
                makeMath(m, l);
                makeMath(m, m);

                task(15);

                //Выполнить задание 18 из HW2 с помощью метода и параметров:
                //а) Создать переменные apple и  student и присвоить им значения 40 и 6 соответственно.
                // Распечатать выражение:
                //Если … яблок(а) поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
                //Распечатать это же выражение со значениями 100 и 21.

                apple(40, 6);
                apple(150, 21);

                task(16);

                //Выполнить задание 18 из HW2 с помощью метода и параметров:
                //Написать метод так, чтобы правильные склонения слов (н-р, яблок или яблока)
                // печатались автоматически в зависимости от значений параметров.
                //Распечатать выражение с параметрами:
                //apple = 42, 55, 1
                //student = 42, 5, 2

                countApples(42,42);
                countApples(55,5);
                countApples(1,2);

                task(17);

                //Напишите метод, который примет на вход параметр температуры в Цельсиях,
                //и распечатает результат температуры в Цельсиях и в Фаренгейтах.

                makeTemperature(37);
                makeTemperature(36.6);

                task(18);

                //а) Создать метод, который примет на вход параметр i и распечатает таблицу
                //b) поменять значение i и распечатать таблицу с новым значением i

                System.out.println(" | " + "int min " + "| " + getMinValue(10) + " |");
                System.out.println(" | " + "int max " + "| " + getMaxVaiue(10) + "  |");
                System.out.println(" | " + "i ^ 2   " + "| " + getPow(10) + "       |");

                task(19);

                //Напишите тест, который валидирует (проверит правильность работы) ваш код из задания №10.
                // Тестовые данные - 2, 5, 0.

                assertIntegerResult(2,2);
                assertIntegerResult(25,25);
                assertIntegerResult(0,0);

                assertIntegerResult(2,6);
                assertIntegerResult(25, 10);
                assertIntegerResult(0, -2);

                task(20);

                //Напишите тест, который валидирует ваш код из задания №11.
                //Придумайте тестовые данные.
                //Выведите результат проверки на печать.

                assertStringResult("Голосовать можно", "Машину водить можно");
                assertStringResult("Машину водить можно", "Голосовать можно");
                assertStringResult("В школу нельзя идти", "В школу нельзя идти");

                task(21);

                //Напишите алгоритм программы, которая проверяет число типа short на количество разрядов,
                // и выводит результат проверки.
                //( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
                //Выведите результат проверки на печать.

                short e = -11;
                if (e <= Short.MAX_VALUE && e >= Short.MIN_VALUE){
                    if (e > -10 && e < 10){
                        System.out.println("It's a one-digit number");
                    } else if (e >= 10 && e < 100 || e <= -10 && e > -100){
                        System.out.println("It's a two-digit number");
                    } else if (e >= 100 && e < 1000 || e <= -100 && e > -1000){
                        System.out.println("It's a three-digit number");
                    } else if (e >= 1000 && e < 10000 || e <= -1000 && e > -10000){
                        System.out.println("It's a four-digit number");
                    } else if (e >= 10000 && e < 100000 || e <= -10000 && e > -100000){
                        System.out.println("It's a five-digit number");
                    }
                } else {
                    System.out.println("Error");
                }
            }
        }