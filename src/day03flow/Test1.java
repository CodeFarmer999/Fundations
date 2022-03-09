package day03flow;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/9 9:30
 **/
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的Java成绩：");
        double javaScore = scanner.nextDouble();
        System.out.println("请输入你的music成绩：");
        double musicScore = scanner.nextDouble();
        if ((javaScore > 98 && musicScore > 80) || (javaScore == 100 && musicScore > 70)) {
            System.out.println("你真棒!");
        } else {
            System.out.println("继续努力!!!");
        }
    }
}
