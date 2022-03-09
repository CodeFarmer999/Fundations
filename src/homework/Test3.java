package homework;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/8 19:51
 **/
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int b = scanner.nextInt();
        System.out.println((a % b == 0 || a + b > 1000) ? a : b);
    }

}
