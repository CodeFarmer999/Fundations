package day02Homework;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/8 19:17
 **/
public class Test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个要操作的整数:");
        int first = scanner.nextInt();
        System.out.println("请输入第二个要操作的整数:");
        int second = scanner.nextInt();
        System.out.println("请根据数字进行选择对应的操作：");
        System.out.println("1.+\t2.-\t3.*\t4./");
        int choiceOfUser = scanner.nextInt();
        switch (choiceOfUser) {
            case 1:
                System.out.println(first + "+" + second + "=" + (first + second));
                break;
            case 2:
                System.out.println(first + "-" + second + "=" + (first - second));
                break;
            case 3:
                System.out.println(first + "*" + second + "=" + (first * second));
                break;
            case 4:
                System.out.println(first + "/" + second + "=" + ((double)first / second));
                break;
            default:
                break;
        }
    }
}
