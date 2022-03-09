package day02Homework;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/8 19:12
 **/
public class Test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println("该年是闰年!");
        } else {
            System.out.println("该年是平年!");
        }
    }
}
