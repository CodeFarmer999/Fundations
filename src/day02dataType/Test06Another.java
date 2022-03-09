package day02dataType;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/7 23:32
 **/
public class Test06Another {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字a:");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数字b:");
        int b = scanner.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("交换之后的a为:" + a);
        System.out.println("交换之后的b为:" + b);
    }
}
