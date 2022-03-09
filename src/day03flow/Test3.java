package day03flow;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/9 11:31
 **/
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = scanner.nextInt();
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
            case 7:
            case 6:
                System.out.println("还可以");
                break;
            default:
                System.out.println("垃圾");
        }
    }
}
