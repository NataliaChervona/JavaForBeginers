package hw8;

//import static utils.Utils.*;

import java.util.Arrays;

import static utils.Utils.*;

public class HW8 {

    //метод проверяет не пустой ли массиве
    public static boolean checkForEmptyArray(int[] array) {
        if (array.length != 0) {

            return true;
        } else {

            return false;
        }
    }

    //метод проверяет на положительность чисел в массиве
    public static boolean checkPositiveNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0.0) {
                return false;
            }
        }

        return true;
    }

    //метод считает сколько нечетных чисел в массиве
    public static int quantityOdd(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                result++;
            }
        }

        return result;
    }

    //метод возвращает из пришедшего массива, массив четных чисел
    public static int[] returnEvenArray(int[] array) {
        checkForEmptyArray(array);
        int[] arr = new int[quantityEven(array)];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arr[count] = array[i];
                count++;
            }
        }
        return arr;
    }

    //7 Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел
    public static int[] getArraysOf5(int a, int b, int c, int y, int x) {
        int[] arr = {a, b, c, y, x};

        return arr;
    }

    //8 Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел
    public static double[] getArraysDouble(double a, double b, double c, double e, double d) {
        double[] arraysDouble = {a, b, c, e, d};

        return arraysDouble;
    }

    //9 Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
    public static String[] getArraysString(String a, String b, String c, String d, String e) {
        String[] arraysString = {a, b, c, d, e};

        return arraysString;
    }

    //10 Написать метод, который принимает на вход массив целых чисел,
    // и возвращает массив тех же чисел, умноженных на 2.5
    public static double[] multiplication(int[] array, double a) {
        double[] result = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * a;
        }
        return result;
    }

    //11 Написать метод, который принимает на вход массив целых положительных чисел,
    // и возвращает количество четных чисел в этом массиве
    public static int quantityEven(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result++;
            }
        }

        return result;
    }

    //12 Написать метод, который принимает на вход массив целых положительных чисел,
    // и возвращает массив нечетных чисел

    //1 способ
    public static int[] returnOddArray(int[] array) {
        checkForEmptyArray(array);
        int[] arr = new int[quantityOdd(array)];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                arr[count] = array[i];
                count++;
            }
        }
        return arr;
    }

    //2 способ
    public static int[] returnOddArr(int[] A) {
        int j = 0;
        int lengthOdd = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                lengthOdd++;
            }
        }

        int[] B = new int[lengthOdd];
        for (int i = 0; i < A.length; i++) {
            if (A.length != 0 && A[i] >= 0) {
                if (A[i] % 2 != 0) {
                    B[j] = A[i];
                    j++;
                }
            } else {
                System.out.println("Error");
            }
        }
        System.out.println(Arrays.toString(B));

        return B;
    }

    //13 Написать метод, который принимает на вход массив целых чисел,
    // и возвращает массив значений true или false, если числа больше 10
    public static boolean[] getBooleanArray(int[] array) {
        boolean[] arrayBoolean = new boolean[array.length];
        if (array == null || array.length == 0) {

            return null;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                arrayBoolean[i] = true;
            } else {
                arrayBoolean[i] = false;
            }
        }
        System.out.println(Arrays.toString(array));

        return arrayBoolean;
    }

    //14 Написать метод, который принимает на вход массив слов,  и возвращает строку, состоящую из этих слов
    public static String createSentence(String[] words) {
        String sentence = " ";
        for (int i = 0; i < words.length; i++) {
            sentence += words[i] + " ";
        }
        return sentence;
    }

    //15 Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива
    public static int sumSecondHalf(int[] array) {
        int sum = 0;
        if (array.length > 0) {
            for (int i = array.length / 2; i < array.length; i++) {
                sum += array[i];
            }
        } else {
                System.out.println("Error");
        }
        return sum;
    }

    // 16 //Написать метод, который принимает на вход целое положительные число в пределах от 1 до 10 исключительно,
    //    и возвращает таблицу умножения на это число в виде массива
    //    Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
    public static int[] arrayOfMultByNumber(int num) {
        if (num <= 0 || num >= 10) {
            return new int[]{};
        } else {
            int[] arrayOfMultByNumber = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int i = 0; i < arrayOfMultByNumber.length; i++) {
                arrayOfMultByNumber[i] = arrayOfMultByNumber[i] * num;
            }
            return arrayOfMultByNumber;
        }
    }

    //17 Написать метод, который принимает массив целых чисел и возвращает массив четных чисел,
    // если четных чисел больше, или массив нечетных чисел, если нечетных чисел больше.
    public static int[] getArrayEvenOrOdd(int[] array) {
        if (quantityOdd(array) > quantityEven(array)) {
            return returnOddArray(array);
        } else  if (quantityOdd(array) < quantityEven(array)){
            return returnEvenArray(array);
        } else {
            return new int[]{};
        }
    }

    //18 Написать метод, который принимает на вход длину массива и генерирует массив случайных положительных чисел
    // от 0 до 100 исключительно.
    public static int[] arrayOfRandomPositiveNum(int length, int from, int to) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = from + (int) (Math.random() * (to + 1));
        }

        return array;
    }

    //19 Написать метод, который принимает на вход длину массива l
    //   и количество знаков d (однозначные, двузначные, трехзначные и тд числа),
    //   и генерирует массив случайных целых положительных чисел длины l,
    //   в котором все числа имеют количество знаков d

    //1 способ
    public static int[] createRandomArrayLToD(int l, int d) {
        int[] array = new int[l];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomInt((int) Math.pow(10, d - 1) * 10, (int) Math.pow(10, d-1));
        }
        return array;
    }

    //2 способ
    public static int[] massLD(int l, int d) {
        double[] mass = new double[l];
        for (int i = 0; i < l; i++) {
            mass[i] = Math.random() * 0.9 + 0.1;
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < d; j++) {
                mass[i] *= 10;
            }
        }
        int[] vozvrat = new int[l];
        for (int i = 0; i < l; i++) {
            vozvrat[i] = (int) mass[i];
        }
        return vozvrat;
    }

    //20 Написать метод, который принимает на вход массив целых положительных чисел,
    // и возвращает массив только двузначных чисел.
    // Проверить работу метода на массиве из задания 18.

    //1 способ
    public static int[] createDoubleDigitsArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 && array[i] < 100) {
                count++;
            }
        }
        int[] newArray = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 && array[i] < 100) {
                newArray[newArray.length - count] = array[i];
                count--;
            }
        }
        return newArray;
    }

    //2 способ
    public static int[] returnTwoNum(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {
                count++;
            }
        }
        int[] help = new int[array.length - count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                help[index++] = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        return help;
    }

    //21 Написать метод, который принимает на вход массив целых положительных двузначных чисел,
    // и возвращает массив разниц между десятками и единицами
    public static int[] differenceTensAndOnes(int[] array) {
        int[] arr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i] / 10 * 10 - array[i] % 10;
            //arr[i] = Math.abs(array[i] / 10 - array[i] % 10);
        }
        System.out.println(Arrays.toString(array));
        return arr;
    }

    //22 Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9,
    // и возвращает массив, который содержит номер телефона, состоящий из этих чисел,
    // и название страны, которой номер принадлежит.
    //Например:method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}

    //1 способ
    public static String[] getPhoneNum(int[] array) {
        if (array == null || array.length == 0) {

            return null;
        }
        String[] arrayPhoneNum = new String[2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                arrayPhoneNum[0] = "\"" + array[0] + "(" + array[1] + array[2] + array[3] + ")" + array[4] + array[5] +
                        array[6] + "-" + array[7] + array[8] + "-" + array[9] + array[10] + "\"";
                if (array[0] == 1) {
                    arrayPhoneNum[1] = "\"USA\"";
                } else if (array[0] == 2) {
                    arrayPhoneNum[1] = "\"Canada\"";
                } else if (array[0] == 3) {
                    arrayPhoneNum[1] = "\"China\"";
                } else if (array[0] == 4) {
                    arrayPhoneNum[1] = "\"Australia\"";
                } else if (array[0] == 5) {
                    arrayPhoneNum[1] = "\"New Zealand\"";
                } else if (array[0] == 6) {
                    arrayPhoneNum[1] = "\"Germany\"";
                } else if (array[0] == 7) {
                    arrayPhoneNum[1] = "\"Switzerland\"";
                } else if (array[0] == 8) {
                    arrayPhoneNum[1] = "\"France\"";
                } else if (array[0] == 9) {
                    arrayPhoneNum[1] = "\"Japan\"";
                }
            } else {
                return null;
            }
        }
        return arrayPhoneNum;
    }

    //2 способ

    public static String selectCountry(int number) {
        switch (number) {
            case 1:
                return "USA";
            case 33:
                return "France";
            case 34:
                return "Spain";
            case 44:
                return "United Kingdom";
            default:
                return "Unknown country";
        }
    }

    //23 Написать метод, который принимает массив целых положительных чисел больше 0,
    // и возвращает массив уникальных чисел.
    public static int[] returnUniqueNum(int[] array) {
        int[] unique = {};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        unique = new int[array.length - count];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] !=0) {
                unique[count] = array[i];
                count++;
            }
        }
        return unique;
    }

    //24 Написать метод, который принимает на вход массив целых положительных чисел,
    // и возвращает количество уникальных и неуникальных элементов в этом массиве
    public static int[] countUniqueNonUnique(int[] array) {
        int n = 0;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[i] == array[j]) {
                            array[j] = -1;
                            n++;
                        }

                    }
                }
            }
            return new int[]{array.length - n, n};
        }
        return new int[]{};
    }

    //25 Написать метод, который принимает на вход массив целых положительных чисел,
    // и 2 целых положительных числа (значения индексов).
    // Метод возвращает массив, который содержит только числа из первого массива в промежутке между индексами.
    //Например:method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}
    public static int[] arrayNumbersBetweenIndex(int[] arrayInt, int indexStart, int indexEnd) {
        int[] temp = new int[arrayInt.length];
        int index = 0;

        if (indexStart >= 0 && indexEnd >= 0) {
            if (indexStart <= arrayInt.length - 1 && indexEnd <= arrayInt.length - 1
                    && indexStart <= indexEnd) {
                for (int i = indexStart; i < indexEnd + 1; i++) {
                    if (arrayInt[i] >= 0) {
                        temp[index] = arrayInt[i];
                        index++;
                    } else {
                        System.out.println("error (введите целые положительные значения)");
                        return new int[0];
                    }
                }
            } else {
                System.out.println("error (значение индексов больше длины массива)" + (arrayInt.length - 1));
                return new int[0];
            }
        } else {
            System.out.println("error (введите целые положительные значения)");
            return new int[]{};
        }
        return Arrays.copyOf(temp, index);
    }

    //26 Написать метод, который принимает на вход 2 массива int[]
    // и возвращает объединенный массив уникальных неповторяющихся элементов
    public static int[] getUniqueArray(int[] array, int[]array1) {
        if (array == null || array1 == null || (array.length == 0 && array.length == 0)) {
            return null;
        } else {
            int[] arrayUnique = new int[array.length + array.length];
            for (int i = 0; i < array.length; i++) {
                arrayUnique[i] = array[i];
            }
            for (int i = 0; i < array.length; i++) {
                arrayUnique[array.length + 1] = array[i];
            }
            return returnUniqueNum(arrayUnique);
        }
    }



    public static void main(String[] args) {

        task(6);
        //Перенести вспомогательные методы, которые вам помогают выполнять ЛЮБОЕ домашнее задание.
        //Создать объекты типа Integer, Double, String и присвоить им любые значения.
        //Создать объекты типа Integer, Double, String и присвоить им такие же значения, как и переменным класса HW8_1
        //Сравнить переменные соответствующих типов из классов HW8_1 и HW8 и распечатать сравнения в виде таблички:

        Integer a = 1;
        Double b = 2.2;
        String str = "Hello";

        boolean intEqual = a.equals(HW8_1.a);
        boolean dobEqual = b.equals(HW8_1.b);
        boolean strEqual = str.equals(HW8_1.str);

        line();
        System.out.println("|\tHW8\t\t" + "|\tHW8_1\t" + "|\taraEquals?\t|");
        line();
        System.out.println("|\t" + a + "\t\t" + "|\t" + HW8_1.a + "\t\t|\t" + intEqual + "\t\t|");
        line();
        System.out.println("|\t" + b + "\t\t" + "|\t" + HW8_1.b + "\t\t|\t" + dobEqual + "\t\t|");
        line();
        System.out.println("|\t" + str + "\t" + "|\t" + HW8_1.str + "\t|\t" + strEqual + "\t\t|");
        line();

        task(7);
        //Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел

        System.out.println(Arrays.toString(getArraysOf5(2, 3, 5, 7, 0)));
        System.out.println(Arrays.toString(createArrayRandomInt(5, 10, 1)));

        task(8);
        //Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел

        System.out.println(Arrays.toString(getArraysDouble(1.2, 1.3, 1.04, 1.6, 6.3)));

        task(9);
        //Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов

        System.out.println(Arrays.toString(getArraysString("str1", "str2", "str3", "str4", "str5")));

        task(10);
        //Написать метод, который принимает на вход массив целых чисел,
        // и возвращает массив тех же чисел, умноженных на 2.5

        int[] arrayTask10 = {1, 2, 3, 4, 5};
        int[] arrayTask10_1 = {-1, -2, -3, -4, -5};
        int[] arrayTask10_2 = {0};

        System.out.println(Arrays.toString(multiplication(createArrayRandomInt(3, 8, 2), 2.5)));
        System.out.println(Arrays.toString(multiplication(arrayTask10, 2.5)));
        System.out.println(Arrays.toString(multiplication(arrayTask10_1, 2.5)));
        System.out.println(Arrays.toString(multiplication(arrayTask10_2, 2.5)));

        task(11);
        //Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает количество четных чисел в этом массиве

        int[] arrayTask11 = {1, 2, 3, 4, 5};
        //int[] arrayTask11 = {-1, -2, -3, -4, -5};
        //int[] arrayTask11 = {};

        if (checkForEmptyArray(arrayTask11)) {
            if (checkPositiveNumber(arrayTask11)) {
                System.out.println(quantityEven(arrayTask11));
            } else {
                System.out.println("Array have negative number");
            }
        } else {
            System.out.println("Array is empty");
        }

        task(12);
        //Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает массив нечетных чисел

        returnOddArr(createArrayRandomInt(20, 100, 2));

        task(13);
        //Написать метод, который принимает на вход массив целых чисел,
        // и возвращает массив значений true или false, если числа больше 10

        int[] array13 = createArrayRandomInt(6, 20, 3);
        System.out.println(Arrays.toString(getBooleanArray(array13)));

        task(14);
        //Написать метод, который принимает на вход массив слов,  и возвращает строку, состоящую из этих слов

        String[] array14 = {"a", "b", "c", "d", "i"};
        System.out.println(createSentence(array14));

        task(15);
        //Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива

        //int[] array15 = createArrayRandomInt(4, 3, 20);
        int[] array15 = {2, 5, 6, 9, 7};
        System.out.println(sumSecondHalf(array15));

        task(16);
        //Написать метод, который принимает на вход целое положительные число в пределах от 1 до 10 исключительно,
        // и возвращает таблицу умножения на это число в виде массива
        //Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

        int num = 0;
        System.out.println(Arrays.toString(arrayOfMultByNumber(num)));

        task(17);
        //Написать метод, который принимает массив целых чисел и возвращает массив четных чисел,
        // если четных чисел больше, или массив нечетных чисел, если нечетных чисел больше.

        int[] arr17_1 = {1, 0, 11, 10, 111};//больше нечетных
        int[] arr17_2 = {1, 0, 11, 10, 100};//больше четных
        int[] arr17_3 = {1, 0, 11, 10, 111, 100};//поровну

        System.out.println(Arrays.toString(getArrayEvenOrOdd(arr17_1)));
        System.out.println(Arrays.toString(getArrayEvenOrOdd(arr17_2)));
        System.out.println(Arrays.toString(getArrayEvenOrOdd(arr17_3)));

        task(18);
        //Написать метод, который принимает на вход длину массива и генерирует массив случайных положительных чисел
        // от 0 до 100 исключительно.

        System.out.println(Arrays.toString(arrayOfRandomPositiveNum(7, 0, 99)));

        task(19);
        //Написать метод, который принимает на вход длину массива l
        // и количество знаков d (однозначные, двузначные, трехзначные и тд числа),
        // и генерирует массив случайных целых положительных чисел длины l,
        // в котором все числа имеют количество знаков d

        System.out.println(Arrays.toString(createRandomArrayLToD(5, 3)));
        System.out.println(Arrays.toString(massLD(5, 2)));

        task(20);
        //Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает массив только двузначных чисел.
        // Проверить работу метода на массиве из задания 18.

        System.out.println(Arrays.toString(createDoubleDigitsArray(arrayOfRandomPositiveNum(7, 0, 99))));

        returnTwoNum(arrayOfRandomPositiveNum(7, 0, 99));

        task(21);
        //Написать метод, который принимает на вход массив целых положительных двузначных чисел,
        // и возвращает массив разниц между десятками и единицами

        int arr21[] = {20, 61, 78, 55, 96};
        System.out.println(Arrays.toString(differenceTensAndOnes(arr21)));

        task(22);
        //Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9,
        // и возвращает массив, который содержит номер телефона, состоящий из этих чисел,
        // и название страны, которой номер принадлежит.
        //Например:method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}

        int arr22[] = {8, 5, 6, 9, 2, 4, 3, 9, 4, 6, 3};
        System.out.println(Arrays.toString(getPhoneNum(arr22)));

        System.out.println((selectCountry(441234567)));
        System.out.println((selectCountry(34)));

        task(23);
        //Написать метод, который принимает массив целых положительных чисел больше 0,
        // и возвращает массив уникальных чисел.

        int arr23[] = {1, 1, 0, 0, 9, 6, 9, 8};
        System.out.println(Arrays.toString(returnUniqueNum(arr23)));

        task(24);
        //Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает количество уникальных и неуникальных элементов в этом массиве

        int arr24[] = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        System.out.println(Arrays.toString(countUniqueNonUnique(arr24)));

        task(25);
        //Написать метод, который принимает на вход массив целых положительных чисел,
        // и 2 целых положительных числа (значения индексов).
        // Метод возвращает массив, который содержит только числа из первого массива в промежутке между индексами.
        //Например:method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}

        int arr25[] = {0, 2, 5, 9};
        System.out.println (Arrays.toString(arrayNumbersBetweenIndex(arr25, 2, 12)));

        task(26);
        //Написать метод, который принимает на вход 2 массива int[]
        // и возвращает объединенный массив уникальных неповторяющихся элементов

        int[] arr26 = {1, 1, 2, 3, 4, 4};
        int[] arr26_1 = {5, 6, 7, 7, 7, 8};
        System.out.println(Arrays.toString(getUniqueArray(arr26, arr26_1)));
        
    }
}
