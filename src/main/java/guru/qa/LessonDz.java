package guru.qa;

import java.util.List;

public class LessonDz {
    public static void main(String... args) {
        //        1) поупражняться с математическими и логическими операторами,
        //        добиться переполнения при вычислениях
        // Целые
        int a = 100; // 32b   (-2^32) .. (+2^32 -1)
        int b = 26;
        int result1 = a+b;
        int result2 = a*b;
        int maxInt = Integer.MAX_VALUE;
        // С плавающей точкой
        float c = 1.99F;
        double d = 0.5;
        // Лоические
        boolean f = true;
        boolean g = false;
        // Арифметические операторы + - / * % ++ --
        System.out.println(a+b);
        System.out.println(a*d);
        System.out.println(c-a);
        System.out.println(c/d);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(++d);
        System.out.println(--b);
        // Логические операторы &, |, &&, ||, !
        System.out.println(result1 == 126 && result2 ==600);
        System.out.println(result1 == 126 || result2 == 600);
        System.out.println(!(result1 == 126 ));
        //Переполнения при вычислениях
        System.out.println(maxInt+1);





    }
}