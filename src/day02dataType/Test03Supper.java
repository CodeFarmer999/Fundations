package day02dataType;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/7 22:55
 **/
public class Test03Supper {
    public static void main(String[] args) {
        System.out.println("请输入您想输入的数字!");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int numOfNum = Integer.parseInt(num);
        String numOfZiFu = String.valueOf(num);
        // 统计用户输入数字位数
        int count = 0;
        for (int i = 1; i <= numOfNum; ) {
            if (numOfNum / i != 0) {
                count++;
            }
            i *= 10;
        }
        if (numOfNum == 0) {
            count++;
        }
        System.out.println("您输入的数字一共有" + count + "位,请问您想截取从右端开始的几位数字？");
        int i = scanner.nextInt();
        String substring = numOfZiFu.substring(count - i, count);
        System.out.println("您截取的数字为:" + substring);

    }
}
