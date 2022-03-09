package day02dataType;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/7 22:50
 **/
public class Test04 {
    public static void main(String[] args) {
        System.out.println("请输入一个小写字母:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = s.toUpperCase(Locale.ROOT);
        System.out.print(s + "的大写字母为:");
        System.out.println(s1);
    }
}
