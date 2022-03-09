package homework;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/8 20:39
 **/
public class Test05 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的会员卡号：");
        int cardID = scanner.nextInt();
        // 统计该数字共有多少位
        for (int i = 1; i <= cardID; i = i * 10) {
            if (cardID / i != 0) {
                count++;
            }
        }
        int sum = 0;
        int carIDs = cardID;
        while (count > 0) {
            sum += (int) (carIDs / Math.pow(10, count - 1));
            carIDs = (int) (carIDs % Math.pow(10, count - 1));
            count--;
        }
        System.out.println("您的会员卡号" + cardID + "的各位数字的和为" + sum);
    }
}
