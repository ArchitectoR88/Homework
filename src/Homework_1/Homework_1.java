package Homework_1;

public class Homework_1 {
    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {
        System.out.println(third(2, 2, 2, 2));
        System.out.println(forth(7, 8));
        fifth(10);
        System.out.println(sixth(5));
        seven("Homework_1");
        eight(2020);
    }
    //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    public static void second() {
        //1.
        byte bt = 127;
        short sh = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        //2.
        float fl = 2.3f;
        double d = 3.2;
        //3.
        char ch = 'a';
        //4.
        boolean bul = true;
    }
    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static int third (int a, int b, int c, int d){
        return a * (b + (c / d));
    }
    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean forth(int a, int b){
        int sum = a + b;
        if (sum >= 10 && sum <= 20) return true;
        else return false;
    }
    //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали,
    // или отрицательное; Замечание: ноль считаем положительным числом.
    public static void fifth(int x){
        if (x >= 0) {
            System.out.println("Число " + x + " положительное");
        }
        else {
            System.out.println("Число " + x + " отрицательное");
        }
    }
    //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean sixth(int a){
        if (a < 0) return true;
        else return false;
    }
    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    public static void seven(String name) {
        System.out.println("Привет, " + name + "!");
    }
    //8. Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void eight(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
}
