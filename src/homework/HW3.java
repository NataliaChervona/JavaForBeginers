package homework;

public class HW3 {
    public static void main (String[] args) {

        System.out.println("Task 2");

        byte a = 5;
        byte b = 10;
        String line = "__________________________________";

        System.out.println(a + " " + b);
        System.out.println(line);


        System.out.println("Task 3");

        short s = Short.MAX_VALUE;
        short t = Short.MAX_VALUE - 60000;

        System.out.println(s + " " + t);
        System.out.println(line);


        System.out.println("Task 4");

        int i = Integer.MIN_VALUE;

        System.out.println(line);
        System.out.println("| int min \t |\t " + i + "\t |");
        System.out.println(line);

        i = Integer.MAX_VALUE;

        System.out.println("| int min \t |\t " + i + " \t |");
        System.out.println(line);
        System.out.println(line);


        System.out.println("Task 5, 6");

        long phoneNumber = 18009998877l;
        float f = 100.101101f;
        double d = 100.101101;
        String line1 = "__________________________________________";

        System.out.println(line1);
        System.out.println("| float f = 100.101101 \t |\t " + f + "\t |");
        System.out.println(line1);
        System.out.println("| double d = 100.101101 | " + d + "\t |");
        System.out.println(line1);

        System.out.println("Task 7");

        Double dd = 10.09999;
        System.out.println(line1);
        System.out.println("| double dd = 10.09999 \t |\t " + dd + "\t |");
        System.out.println(line1);
        dd = 20.099999;
        System.out.println("| double dd = 20.099999 |\t " + dd + "\t |");
        System.out.println(line1);

        Float ff = 10.09999f;
        System.out.println("| float ff = 10.09999 \t |\t " + ff + "\t |");
        System.out.println(line1);
        ff = 20.099999f;
        System.out.println("| float ff = 20.099999 |\t " + ff + "\t |");
        System.out.println(line1);

        System.out.println("Task 8");
        double result = 10.0 / 3;
        System.out.println(result);
        System.out.println(line1);

        System.out.println("Task 9");
        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double remainder = f - d;
        System.out.println(sum);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);
        System.out.println(line1);

        System.out.println("Task 10");
        System.out.println(
                  "**  **    ******   **        ******" + "\n"
                + "**  **    **       **        **  **" + "\n"
                + "******    ****     **        **  **" + "\n"
                + "**  **    **       **        **  **" + "\n"
                + "**  **    ******   ******    ******");
        System.out.println(line1);

        System.out.println("Task 12");

        System.out.println(line1);
        System.out.println("Type \t Size in bits \t min \t\t\t\t\t max");
        System.out.println("byte \t\t\t" + Byte.SIZE + "\t\t" + Byte.MIN_VALUE +  "\t\t\t\t\t " + Byte.MAX_VALUE);
        System.out.println("short \t\t\t" + Short.SIZE + "\t\t" + Short.MIN_VALUE + "\t\t\t\t\t" + Short.MAX_VALUE);
        System.out.println("int \t\t\t" + Integer.SIZE + "\t\t" + Integer.MIN_VALUE + "\t\t\t\t" + Integer.MAX_VALUE);
        System.out.println("long \t\t\t" + Long.SIZE + "\t\t" + Long.MIN_VALUE + "\t\t" + Long.MAX_VALUE);
        System.out.println("float \t\t\t" + Float.SIZE + "\t\t" + Float.MIN_VALUE + "\t\t\t\t" + Float.MAX_VALUE);
        System.out.println("double \t\t\t" + Double.SIZE + "\t\t" + Double.MIN_VALUE + "\t\t\t\t" + Float.MAX_VALUE);
        System.out.println(line1);

        System.out.println("Task 13");
        Integer mum1 = 5;
        Integer mum2 = 5;
        System.out.println("Если num1 = num2, то результат сравнения методом .equals = " + mum1.equals(mum2));

        mum1 = 10;
        mum2 = 15;
        System.out.println("Если num1 не равно num2, то результат сравнения методом .equals = " + mum1.equals(mum2));
        System.out.println(line1);

        System.out.println("Task 14");
        int number1;
        int number2;
        number1 = 5;
        number2 = 5;
        System.out.println("Если number1 = number2, то результат сравнения методом .compare = "
                + Integer.compare(number1, number2));
        number1 = 5;
        number2 = 10;
        System.out.println("Если number1 < number2, то результат сравнения методом .compare = "
                + Integer.compare(number1, number2));
        number1 = 10;
        number2 = 5;
        System.out.println("Если number1 > number2, то результат сравнения методом .compare = "
                + Integer.compare(number1, number2));
        System.out.println(line1);

        System.out.println("Task 15");

        Float num3 = 234.9999f;
        System.out.println(num3.intValue());
        System.out.println(Math.round(num3));
        System.out.println(line1);

        System.out.println("Task 16");
        double num4 = 5.5;
        double num5 = 10.2;
        System.out.println(Double.sum(num4,num5));
        System.out.println(line1);

        System.out.println("Task 17");
        Float num6 = 1234.2F;
        Float num7 = 5432.2F;
        System.out.println(Integer.sum(Math.round(num6),Math.round(num7)));
        System.out.println(line1);

        System.out.println("Task 18");
        Short short1 = 12000;
        Short short2 = 12300;
        System.out.println("a) 12000 - 12300 = " + Short.compare(short1,short2));
        short1 = 12500;
        System.out.println("b) 12500 - 12300 = " + Short.compare(short1,short2));
        System.out.println(line1);

        System.out.println("Task 19");
        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;
        System.out.println(doub1 - doub2);
        System.out.println(Double.parseDouble(str1) - Double.parseDouble(str2));
        System.out.println(Double.valueOf(str1) - Double.valueOf(str2));
        System.out.println(line1);

        System.out.println("Task 20");
        Float temp = 36.1F;
        Float avarage = temp/2;
        temp = 41.1F;
        avarage = avarage + temp/2;
        System.out.println(Math.round(avarage));
        System.out.println(line1);

        System.out.println("Task 21");
        Number n;
        n = 10;
        String text = "Перемення n может принимать значения: \n n = ";
        System.out.println(text + Long.MAX_VALUE);
        System.out.println(text + n);
        n = 10.999999999;
        System.out.println(text + n);
        System.out.println(line1);

        System.out.println("Task 22");
        Integer numberInteger = 100;
        System.out.println("numberInteger имеет тип Integer потомучто 100 + 1 = " + (numberInteger + 1));
        System.out.println("если бы numberInteger имело тип String, то 100 + 1 = " + numberInteger.toString() + 1);

        String numInt = numberInteger.toString();
        System.out.println("numberInteger - " + numberInteger.getClass());
        System.out.println("numInt - " + numInt.getClass());
        System.out.println(line1);

        System.out.println("Task 23");
        double far = 36.6 * 1.8 + 32;
        System.out.println("36.6 градусов по Цельсию = " + far + " градусов по Фарингейту");
        double x = 50 * 2.441933;
        double y = 50 * 0.45359237;
        System.out.println("50 kilogram =" + x + " Ibs, 50 Ib = " + y + " kg");




























    }
    
}
