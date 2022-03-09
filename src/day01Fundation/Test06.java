package day01Fundation;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/7 19:24
 **/
public class Test06 {
    public static void main(String[] args) {
        System.out.println("请输入第一个数字a:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("请输入第二个数字b:");
        int b = scanner.nextInt();
        System.out.println(a + "+" + b + "=" + (a + b));
    }
}
