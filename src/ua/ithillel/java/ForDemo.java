package ua.ithillel.java;

public class ForDemo {
    public static void main(String[] args) {

        int num = 1;

        for (int i = 1; i < 100; i++) {
            num *= i;
            if (num > 1000) {
                System.out.println("Значение \"num\": " + num + " при " + i + " - й итерации цикла");
                break;
            }
        }
    }
}
