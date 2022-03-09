package day02dataType;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/7 22:17
 **/
public class Test02 {
    public static void main(String[] args) {
        System.out.println("请输入一个大写字母:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = s.toLowerCase(Locale.ROOT);
        System.out.print(s + "的小写字母为:");
        System.out.println(s1);
    }
}
