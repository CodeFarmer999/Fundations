package day02Homework;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/8 19:26
 **/
public class Test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入货物的重量：");
        double weight = scanner.nextDouble();
        double money = 0;
        if (weight < 20) {
            money = 5;
        } else if (weight >= 20 && weight < 100) {
            money = 5 + (weight - 20) * 0.2;
        } else {
            money = 5 + (100 - 20) * 0.2 + (weight - 100) * 0.15;
        }
        System.out.println("您应该付费" + money + "元!");
    }
}
