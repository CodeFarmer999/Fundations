package day02Homework;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/8 19:06
 **/
public class Test10 {
    public static void main(String[] args) {
        int play;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int num1 = scanner.nextInt();
        play = num1;
        System.out.println("请输入第二个数字:");
        int num2 = scanner.nextInt();
        if (play < num2) {
            play = num2;
        }
        System.out.println("请输入第三个数字:");
        int num3 = scanner.nextInt();
        if (play < num3) {
            play = num3;
        }
        System.out.println("三个数中最大的数为:" + play);
    }
}
