package day03flow;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/9 10:49
 **/
public class Test2 {
    public static void main(String[] args) {
        System.out.println("请根据实际情况输入对应数字：1、会员\t2、非会员");
        Scanner scanner = new Scanner(System.in);
        int judge = scanner.nextInt();
        System.out.println("请输入您购物的原价为：");
        double price = scanner.nextDouble();
        if (judge == 1) {
            System.out.println("亲爱的会员，您好!!!");
            if (price >= 200) {
               price *= 0.75;
            } else if (price >= 100) {
                price *= 0.8;
            }
        } else {
            if (price >= 100) {
                price *= 0.9;
            }
        }
        System.out.println("您所购商品实际应付金额为：" + price);
    }
}
