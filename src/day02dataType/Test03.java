package day02dataType;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/7 22:23
 **/
public class Test03 {
    public static void main(String[] args) {
        System.out.println("请输入您想输入的数字!");
        // 统计用户输入数字位数
        int count = 0;
        Scanner scanner = new Scanner(System.in);
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
        int i = inputNum(count);
        while (i > count) {
            i = inputNumOfUserNaoTan(count);
        }
        int cut = i + 1;
        int someZero = 1;
        for (int j = 1; j < cut; j++) {
            someZero *= 10;
        }
        int broken = (int) (num % someZero);
        System.out.println("您截取的数字为:" + broken);
    }

    public static int inputNum(int count) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("您输入的数字一共有" + count + "位,请问您想截取从右端开始的几位数字？");
        int i = scanner.nextInt();
        return i;
    }

    public static int inputNumOfUserNaoTan(int count) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您动动您的猪大脑！！！");
        System.out.println("您输入的数字一共有" + count + "位,请问您想截取从右端开始的几位数字？");
        int i = scanner.nextInt();
        return i;
    }

}
