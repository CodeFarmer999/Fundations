package homework;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/8 19:53
 **/
public class Test4 {
    public static void main(String[] args) {
        int sum = 0;
        int single = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的数字：");
        // 统计用户输入数字位数
        int count = 0;
        long num = scanner.nextLong();
        for (int i = 1; i <= num; ) {
            if (num / i != 0) {
                count++;
            }
            i *= 10;
        }
        if (num == 0) {
            count++;
        }
        int countCopy = count;
        for (int i = 0; i < count; i++) {
            if (i != count - 1) {
                sum += num / Math.pow(10, countCopy - 1);
                num %= Math.pow(10, countCopy - 1);
                countCopy--;
            } else {
                sum += num;
            }
        }

        System.out.println("您输入的数字" + num + "各位数字之和为:" + sum);
    }
}
