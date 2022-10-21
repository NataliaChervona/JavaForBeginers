package lessons.lessons1to7;

public class Lesson6 {

    public static void main(String[] args){

//        for( ; ;) {  шаблон цикла for
//
//        }

// Печатаем Java for beginners для всех чисел от 1 до 5 включительно
        for(int i = 1; i < 6; i++) {
            System.out.println("Java for beginners");
        }
// Печатаем числа от 1 до 5 включительно
        for(int i = 1; i < 6; i++){
            System.out.println(i);
        }
        System.out.println("__________________");
//Печатаем только нечетные числа от 1 до 10 включительно
        for(int i = 1; i < 11; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("__________________");
//Печатаем только нечетные числа от 1 до 10 включительно второй способ
        for(int i = 1; i < 11; i = i + 2){
                System.out.println(i);
        }
        System.out.println("__________________");
//Печатаем только нечетные числа от 1 до 10 включительно третий способ
        for(int i = 1; i < 11; i += 2){
            System.out.println(i);
        }
        System.out.println("__________________");
// Печатаем все числа от1 до 100 включительно с шагом 10
        for (int i = 1; i < 101; i += 10){
            System.out.println(i);
        }
        System.out.println("__________________");
//  Печатаем все числа в промежутке от 0 до 100 включительно, которые делятся на 10
        for (int i = 0; i < 101; i += 10) {
            System.out.println(i);
        }
        System.out.println("__________________");
//  Печатаем все числа в промежутке от -100 до 100 включительно, которые делятся на 10
        for (int i = -100; i < 101; i += 10) {
            System.out.println(i);
        }
        System.out.println("__________________");
//  Печатаем все числа от 5 до 1 включительно
        for (int i = 5; i > 0; i--){
            System.out.println(i);
        }

//  Стараемся придумывать решения с 1 циклом for
//        for (;;) {
//            for (;;) {
//
//            }
//        }
        System.out.println("__________________");
        String bottles = " bottles of bear";
        String bottle = " bottle of bear";
        String wall = " on the wall";
        String take = "Take one down and pass it around";
        String commaSpace = ", ";
        String dot = ".";
        String go = "Go to the store and buy some more";
        String noMoreC = "No more";
        String noMoreL = "no more";
        String ln = "\n";

        for (int i = 99; i > -1; i--) {
            if (i == 2) {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottle + wall + dot + ln);
            } else if(i == 1) {
                System.out.println(i + bottle + wall + commaSpace + i + bottle + dot);
                System.out.println(take + commaSpace + noMoreL + bottles + wall + dot + ln);
            } else if(i == 0) {
                System.out.println(noMoreC + bottles + wall + commaSpace + noMoreL + bottles + dot);
                System.out.println(go + commaSpace + (i + 99) + bottles + wall + dot + ln);
            } else {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottles + wall + dot + ln);
            }

        }
   }
}
