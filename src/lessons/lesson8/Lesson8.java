package lessons.lesson8;

import static utils.Utils.*; //импорт всех методов

public class Lesson8 {

    public static void main(String[] args) {

        //способоы создания массивов
        int[] arr = new int[] {1, 2, 3}; //длина массива 3, со значениями 1, 2, 3
        int[] arr1 = new int[3]; //длина массива 3
        int[] arr2 = {1,2,3}; //длина массива 3, со значениями 1, 2, 3
        int[] arr4 = {}; //длина массива 0

        int a = 4; //
        int a1 = 4; //
        double b = 5.5; //значание кладется непосредственно в ячейку

        System.out.println(a == a1); //значения равны


        Integer InRed = 4; //
        Integer InRed1 = 4; //созданы в пределах пула, равны между собой
        Double doubReg = 5.5; //значание кладется в дальнюю память, а в ячейке ссылка на значение

        System.out.println(InRed == InRed1); //значения равны, потому как ссылки и значения совпадают
        System.out.println("_________________________");

        Integer intObject = new Integer(4); //когда зачеркнуто, значит написание устарело (создано за пределами пула)
        Double doubObject = new Double(5.5); //и его не рекомендуется использовать, но оно тоже работает

        System.out.println(InRed == intObject); //не равны значения
        System.out.println("_________________________");



        //Math math = new String("Hello");от класса Math обьекты не создаются

        String str1 = "Hello"; //
        String str2 = "Hello"; //созданы в пуле
        String strObject = new String("Hello"); //не равено значениям выше


        System.out.println(str1 == str2); //значения равны
        System.out.println("_________________________");

        String cat1 = "Cat"; //
        String cat2 = "Cat"; //эти 2 значения равны, созданы в пуле

        String cat3 = new String("Cat"); //значения не равны, потомучто созданы как обьект,
        String cat4 = new String("Cat"); // вне пула String, в отдельной ячейке

        System.out.println(cat3 == cat4);
        System.out.println(cat1.equals(cat2));//сравнимаваем значения с помощью метода
        System.out.println(cat1.equals(cat3));//будут равны, потомучто сравнивается именно значение

        //если надо сравнить именно ссылки, то сравнимаваем через ==
        //если надо сравнить значения, то через метод equals

        //public доступ во всем проекте
        // protected доступ только в пакете
        //private доступ только в классе

        //static означает принадлежность к класу

        line();
        ln();
        line();
        verify(cat1, cat2);

    }
}
