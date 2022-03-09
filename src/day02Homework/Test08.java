package day02Homework;

import java.util.Scanner;

/**
 * if 语句）读入一个整数，表示一个人的年龄。如果小于6 岁，则输出“儿
 * 童”，6 岁到13 岁，输出“少儿”；14 岁到18 岁，输出“青少年”；18 岁到35 岁，
 * 输出“青年”；35 岁到50 岁，输出“中年”；50 岁以上输出“中老年”。
 * @author Turing
 * @date 2022/3/8 18:55
 **/
public class Test08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        int age = scanner.nextInt();
        if (age < 6) {
            System.out.println("儿童");
        }
        if (6 <= age && age <= 13) {
            System.out.println("少儿");
        }
        if (14 <= age && age < 18) {
            System.out.println("青少年");
        }
        if (18 <= age && age < 35) {
            System.out.println("青年");
        }
        if (35 <= age && age < 50) {
            System.out.println("中年");
        }
        if (age >= 50) {
            System.out.println("中老年");
        }
    }
}
