package homework;

import java.util.Arrays;

public class HW7 {

    //метод для номирациии заданий
    public static void task(int aa){
        String line = " ****************************** ";
        System.out.println("\n" + "\u001B[36m" + line + aa + line + "\u001B[0m");
    }

    //метод к заданию 5
    public enum Colors {
        GREY,
        BLACK,
        BROWN,
        RED
    }

    //метод к заданию 6
    public static void line() {
        String a = "_______________________________";
        System.out.println(a);
    }

    //метод к заданию 18
    //Написать метод, который принимает на вход массив int, и возвращает среднее значение.

    public static double midValue (int[] array) {
        double midValue = 0;
        for (int i = 0; i < array.length; i++) {
            midValue += array[i];
        }
        return midValue / array.length;
    }

    //метод к заданию 21
    // Создать метод, который принимает на вход массив int,
    // и возвращает минимальное значение, максимальное значение и среднее значение всех чисел массива.
    // Проверить работу метода на массиве из задания 20.

    public static int[] getMinMaxAverage(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
           if (max < array[i]) {
               max = array[i];
           }
        }
        int average;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        average = sum / array.length;

        int[] result = new int[3];
        result[0] = min;
        result[1] = max;
        result[2] = average;
        return result;
    }

    //метод к заданию 24
    //Создать двумерный массив целых случайных чисел от 1 до 10 размерности 4*8.

    public static int randomInt(int upper, int lower) {
        return (int) (Math.random() * (upper - lower)) + lower;
    }

    public static int[][] create2DArrayRandom(int row, int colum, int upper, int lower) {
        int[][] array = new int[row][colum];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
            }
        }

        return array;
    }

    //метод к заданию 25
    //Вывести сумму всех четных чисел массива из задания 24.

    public static int[][]array25 (int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j= 0; j < array.length; j++) {
                array[i][j] = (int) (1 + Math.random() * 10);
            }
        }
        return array;
    }


    public static void main(String[] args) {

        task(1);
//Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).

        String[] catNames;

        catNames = new String[8];

        catNames[0] = "Мурчик";
        catNames[1] = "Черныш";
        catNames[2] = "Серик";
        catNames[3] = "Васька";
        catNames[4] = "Рыжик";
        catNames[5] = "Мурка";
        catNames[6] = "Бенька";
        catNames[7] = "Маркиз";

        for (int i = 0; i < 8; i++) {
            System.out.println(catNames[i]);
        }

        task(2);
// В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”, а значение элемента с индексом 1 на “Черныш”.

        catNames[1] = "Черныш";
        catNames[4] = "Рыжик";

        System.out.println(catNames[1]);
        System.out.println(catNames[4]);

        task(3);
//Создать массив catsColors и заполнить его значениями.

        String[] catColors = {"GREY", "BLACK", "GREY", "BROWN", "RED", "GREY", "RED", "GREY"};
        for (int i = 0; i < 8; i++) {
            System.out.println(catColors[i]);
        }

        task(4);
//Создать массив catsAges и заполнить его любыми значениями.

        int[] catAges = {2, 3, 4, 1, 6, 7, 1, 9};

        System.out.println(Arrays.toString(catAges));


        task(5);
//Создать массив isCatRed и заполнить его соответствующими значениями

        int a = 0;
        for (int i = 0; i < catColors.length; i++) {
            a += 1;
            System.out.println(a);
        }
        Boolean [] isCatRed = new Boolean[a];
        for (int i = 0; i < a; i++) {
            if (catColors[i].equals(String.valueOf(Colors.RED))) {
                System.out.println(isCatRed[i] = true);
            } else {
                System.out.println(isCatRed[i] = false);
            }
        }
        System.out.println(Arrays.toString(isCatRed));

        task(6);
//Распечатать для массивов catsNames и catsColors:
    //имя кота в коробке с номером 6

        System.out.println(catNames[6]);
        line();

    //имена котов из коробок с четными индексами

        for (int i = 0; i < catNames.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - " + catNames[i]);
            }
        }
        line();

    //имена котов из коробок, чьи индексы кратны 4

        for (int i = 0; i < catNames.length; i++) {
            if (i % 4 == 0) {
                System.out.println(i + " - " + catNames[i]);
            }
        }
        line();

    //цвет котов из коробок с нечетными индексами

        for (int i = 0; i < catColors.length; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " - " + catColors[i]);
            }
        }
        line();

    //цвет котов из коробок, чьи индексы кратны 3

        for (int i = 0; i < catColors.length; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " - " + catColors[i]);
            }
        }

        task(7);
//Распечатать “Накорми кота!” для всех серых котов

        for (int i = 0; i < catColors.length;i++) {
            if (catColors[i].equals("Серый")) {
                System.out.println("Накорми кота он " + catColors[i]);
            }
        }

        task(8);
//Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет

        for (int i = 0; i < catAges.length; i++) {
            if (catAges[i] < 0 || catAges[i] > 50) {
                System.out.println("Error");
            } else if(catAges[i] < 2) {
                System.out.println("Отнеси кота на прививку!");
                } else {
                System.out.println("Кот остается дома");
            }
        }

        task(9);
//Для кота в последней коробке распечатать имя, цвет, возраст

        if (catNames.length != 0 || catColors.length != 0 || catAges.length != 0) {

            System.out.println(catNames [catNames.length - 1] + " " + catColors[catColors.length - 1] + " "
            + catAges[catAges.length - 1] + " " + "year");
        }

        task(10);
//Распечатать имена всех котов, чей возраст больше 2 лет

        if (catAges.length == catColors.length && catColors.length == catNames.length) {

            for (int i = 0; i < catAges.length; i++) {
                if (catAges[i] > 2) {
                    System.out.println(catNames[i]);
                }
            }
        }

        task(11);
//Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true

        if (catNames.length == isCatRed.length && catNames.length != 0) {
            for (int i = 0; i < catNames.length; i++){

                if (isCatRed[i] == true && catNames[i].equals("Рыжик")) {
                    System.out.println("Накорми кота! Его зовут " + catNames[i]);
                }
            }
        }

        task(12);
//Распечатать средний возраст котов из массива catsAges

        double sum = 0;
        for (int i = 0; i < catAges.length; i++) {
            sum = sum + catAges[i];
        }
        System.out.printf("%.1f%n", sum / catAges.length);

        task(13);
//Распечатать возраст самого молодого кота

        int min = catAges[0];

        for (int i = 0; i < catAges.length;i++) {

            if(min > catAges[i]) {
                min = catAges[i];
            }
        }
        System.out.println(min);

        task(14);
//Распечатать возраст самого старого кота

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < catAges.length; i++) {
            if(max < catAges[i]) {
                max = catAges[i];
            }
        }
        System.out.println("Max age of cat: " + max);

        task(15);
//Распечатать количество серых котов

        int greyCat = 0;
        for (int i = 0; i < catColors.length; i++) {
            if (catColors[i].equals("GREY")) {
                greyCat++;
            }
        }
        System.out.println("количество серых котов = " + greyCat);

        task(16);
//Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет

        if (catAges.length == catNames.length && catNames.length != 0){

            for (int i = 0; i < catAges.length; i++) {

                if (i % 2 == 0 && catAges[i] <= 3) {
                    System.out.println("Кот " + catNames[i] + " его индекс [" + i + "], его возраст " + catAges[i]);
                }
            }
        }

        task(17);
//Создать массив четных положительных чисел, значения которых не больше 10. (заполняем значения с помощью цикла for)

        int count = 0;
        for (int i = 0; i <= 10; i += 2) {
                count++;
        }

        int[] massiv = new int[count];
        int num = 0;
        for (int j = 0; j < massiv.length; j++) {
                massiv[j] = num;
                num += 2;
            }
        System.out.println(Arrays.toString(massiv));

        task(18);
//Написать метод, который принимает на вход массив int, и возвращает среднее значение.
// Проверить работу метода тестом, если параметр - массив catsAges

        System.out.println(Arrays.toString(catAges));
        System.out.println(midValue(catAges));
        HW5.verifyEquals(4.125, midValue(catAges));

        task(19);
//Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900

        int n = 0;
        for (int i = -1000; i < 900; i++) {
            if (i % 2 == 1)
                n++;
        }
        int[] negative = new int[n];
        for (int i = -1000, k = 0; i < -900; i++) {
            if (i % 2 != 0) {
                if (k < negative.length) {
                    negative[k] = i;

                    System.out.print(negative[k] + " ");
                    k++;
                }
            }
        }

        task(20);
//Создать массив из 10 случайных положительных целых чисел

        int[] array = new int[10]; //создала массив с именем array, потом его инициализировала и обозначила количество индексов
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10));
            System.out.print(array[i] + " ");
        }

        task(21);
// Создать метод, который принимает на вход массив int,
// и возвращает минимальное значение, максимальное значение и среднее значение всех чисел массива.
// Проверить работу метода на массиве из задания 20.

        int[] test = getMinMaxAverage(catAges);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
        System.out.println();
        int[] test1 = getMinMaxAverage(array);
        for (int i = 0; i < test1.length; i++) {
            System.out.print(test1[i] + " ");
        }

        task(22);
//Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.

        int lengthEven = 0;
        int lengthOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                lengthEven++;
            } else {
                lengthOdd++;
            }
        }
        int[] even = new int[lengthEven];
        int[] odd = new int[lengthOdd];
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && countEven < even.length) {
                even[countEven] = array[i];
                countEven++;
            } else if (countOdd < odd.length) {
                odd[countOdd] = array[i];
                countOdd++;
            }
        }
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));

        task(23);
//Создать двумерный массив, который состоит из имен, возрастов, цветов котов:
//Распечатать все данные котов в коробках с четными индексами, используя двумерный массив.

        //1 способ

        String[][] twoDimArray = new String[3][8];
        for (int i = 0; i < twoDimArray.length; i++) { //строки
            for (int j = 0; j < twoDimArray.length; j++) { //столбцы
                if (i == 0) {
                    twoDimArray[i][j] = catNames[j];
                } else  if (i == 1) {
                    twoDimArray[i][j] = String.valueOf(catAges[j]);
                } else {
                    twoDimArray[i][j] = catColors[j];
                }
            }
        }
        System.out.println(Arrays.deepToString(twoDimArray));
        System.out.println();
        System.out.println("______________________");

        //2 способ

        String[][]arrayCats2D = {
                {"Мурчик", "Черныш", "Серик", "Васька", "Рыжик","Мурка", "Бенька", "Маркиз"},
                {"2", "3", "4", "1", "6","7", "1", "9"},
                {"GREY", "BLACK", "GREY", "BROWN", "RED", "GREY", "RED", "GREY"}
        };
        for (int j = 0; j < arrayCats2D.length; j++) {
            if (j % 2 == 0) {
                System.out.println(arrayCats2D[0][j] + " " + arrayCats2D[1][j] + " " + arrayCats2D[2][j]);
            }
        }
        System.out.println("______________________");

        //3 способ

        String[][] array23 = new String[3][8];
        if (catNames.length == array23[0].length
            && catAges.length == array23[0].length
            && catColors.length == array23[0].length) {
            for (int i = 0; i < array23.length; i++) {
                array23[0][i] = catNames[i];
                System.out.print(array23[0][i] + " ");
                array23[1][i] = String.valueOf(catAges[i]);
                System.out.print(array23[1][i] + " ");
                array23[2][i] = catColors[i];
                System.out.print(array23[2][i] + " ");
                System.out.println();
            }
        }

        task(24);
//Создать двумерный массив целых случайных чисел от 1 до 10 размерности 4*8.

        int[][] array24 = create2DArrayRandom(4,8,10,1);

        System.out.println(Arrays.deepToString(array24));

        task(25);
//Вывести сумму всех четных чисел массива из задания 24.

        //1 способ

        int sum1 = 0;
        for (int i = 0; i < array24.length; i++) {
            for (int j = 0; j < array24.length; j++) {
                if (array24[i][j] % 2 == 0) {
                    sum1 = sum1 + array24[i][j];
                }
            }
        }
        System.out.println("Сумма четных чисел " + sum1);

        System.out.println("______________________");

        //2 способ

        array25(array24);
        int count1 = 0;
        for (int i = 0; i < array24.length; i++) {
            for (int j = 0; j < array24[i].length; j++) {
                if (array24[i][j] % 2 == 0) {
                    count1 = count1 + array24[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(array24));
        System.out.println("Сумма четных чисел " + count1);


    }
}
