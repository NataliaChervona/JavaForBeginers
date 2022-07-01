package homework;

public class HW2 {

    public static void main(String[] args) {

        int k = 5;
        int l = 10;
        int m = 15;
        int sumKL = k + l;
        int apple = 100;
        int student = 21;
        int sumKLM = k + l + m;

        System.out.println("" + k + " " + l + " " + m);
        System.out.println("5,10,15");

        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);

        System.out.println("Sum of k and l = " + sumKL);
        System.out.println("k * m = " + (k + m));

        System.out.println("l - m = " + (l - m));

        System.out.println("Результат деления k на l = " + (k / l));
        System.out.println("А остаток деления = " + (k % l));

        System.out.println("Результат деления k на m = " + (k / m));
        System.out.println("А остаток деления = " + (k % m));

        System.out.println("Результат деления l на m = " + (l / m));
        System.out.println("А остаток деления = " + (l % m));

        System.out.println("Результат деления m на k = " + (m / k));
        System.out.println("А остаток деления = " + m % k);

        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит "
                + "по " + apple / student + " яблок(а), и " + apple % student + " яблок(а) останеться учителю");

        m++;
        sumKLM--;
        System.out.println("Сумма чисел k, l, m++  и sumKLM-- = " + ((k + l + m) + sumKLM) + ", а разность m++ и "
                + " sumKLM-- = " + (sumKLM - m));

        System.out.println(48 % 8);
        System.out.println(48 % 2);
        System.out.println(8 % 2);

        System.out.println(47 % 2);
        System.out.println(49 % 2);
    }
}
