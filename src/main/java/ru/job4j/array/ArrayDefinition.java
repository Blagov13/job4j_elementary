package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Alex Blagov";
        System.out.println(names[0]);
        names[1] = "Daria Blagova";
        System.out.println(names[1]);
        names[2] = "Barni Blagov";
        System.out.println(names[2]);
        names[3] = "Komp Kompovich";
        System.out.println(names[3]);

        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
    }

}
