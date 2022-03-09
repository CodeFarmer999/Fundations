package day02dataType;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/8 8:18
 **/
public class TestPlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数：");
        int a = scanner.nextInt();
        System.out.println("输入第二个数：");
        int b = scanner.nextInt();
        System.out.println("输入第三个数：");
        int c = scanner.nextInt();
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("最大的数为: " + max);
    }

    @Test
    public void testDemo() {
        int a = 3;
        int b = 6;
        int c = 1;
        int max = Math.max(Math.max(a,b),c);
        System.out.println(max);
    }
}
