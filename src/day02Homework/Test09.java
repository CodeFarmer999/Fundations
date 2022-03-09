package day02Homework;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/8 19:01
 **/
public class Test09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("贝贝");
                break;
            case 2:
                System.out.println("晶晶");
                break;
            case 3:
                System.out.println("欢欢");
                break;
            case 4:
                System.out.println("迎迎");
                break;
            case 5:
                System.out.println("尼尼");
                break;
            default:
                System.out.println("北京欢迎你!");
                break;
        }
    }
}
