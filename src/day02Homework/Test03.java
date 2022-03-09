package day02Homework;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/8 18:38
 **/
public class Test03 {
    public static void main(String[] args) {
        int judge = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        if (num % judge == 0) {
            System.out.println(num + "是一个偶数");
        } else {
            System.out.println(num + "是一个奇数");
        }
    }
}
