package lessons.lessons1to7;

public class Lesson7 {

    public static void main(String[] args) {
        //ячейка памяти типа String-массив
        String[] catNames;

        //объект типа String-массив, состоящий из 8 ячеек
        catNames = new String[8];
        catNames[4] = "Рыжик";
        catNames[1] = "Черныш";
        catNames[6] = "Рыжик";

        //объект типа int-массив состоящий из 8 ячеек
        int[] catsAges = new int[8];

        System.out.println(catNames);

        System.out.println(catNames[0]);
        System.out.println(catNames[7]);

        System.out.println(catsAges[2]);

        System.out.println(catNames[4]);

        System.out.println("___________________________");
        for(int i = 0; i <= 7; i++) {
            System.out.println(catNames[i]);
        }

        System.out.println("____________________________");
        for(int i = 0; i < 8; i++) {
            if (catNames[i] == "Рыжик") {
                System.out.println(catNames[i]);
            }
        }

        System.out.println("____________________________");
        for(int i = 0; i < 8; i++) {
            if (catNames[i] == "Рыжик") {
                System.out.println(i);
            }
        }



    }
}
