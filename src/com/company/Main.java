package com.company;


import java.util.Scanner;

/**
 * Дана строка. Преобразовать в ней все прописные
 * латинские буквы в строчные.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lower = "abcdefghijklmnopqrstuvwxyzабвгдеёжзийклмнопрстуфхцчшщьыъэюя";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЬЫЪЭЮЯ";
        System.out.println("Введите слово");
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int index = lower.indexOf(arr[i]);
            if (index != -1) {
                arr[i] = upper.charAt(index);
            }
            String result = new String(arr);
            System.out.println(result);
        }
    }
}

/**
 * Дана строка, содержащая по крайней мере один символ пробела. Вывести подстроку,
 * расположенную между первым и вторым пробелом исходной строки.
 * Если строка содержит только один пробел, то вывести пустую строку.
 */
class lab1 {
    public static void main(String[] args) {
        task39();
    }

    private static void task39() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, содержащую хотя бы один пробел.");
        String s = scanner.nextLine();
        System.out.println("Вывод подстроки, расположенной между первым и последним пробелом исходной строки.");
        System.out.println("Если строка содержит только один пробел, то происходит вывод пустой строки.");
        int perviProbel = s.indexOf(" ");
        int posledniiPlobel = s.lastIndexOf(" ");
        int len = posledniiPlobel - perviProbel;
        String result;
        if (len <= 1) {
            result = "";
        } else {
            result = s.substring(perviProbel + 1, len - 1);
        }
        System.out.println(result);
    }
}

/**
 * Дано целое число N (1 ≤ N ≤ 26).
 * Вывести N последних строчных (т. е. маленьких) букв
 * латинского алфавита в обратном порядке (начиная с буквы «z»).
 */
class lab2 {
    public static void main(String[] args) {
        task5();
    }

    private static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N:");
        final int N = scanner.nextInt();
        for(char i = 'z'; i >= 'z' - N - 1; i--)
            System.out.println(i);
    }
}