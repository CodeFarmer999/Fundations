package homework;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/8 19:50
 **/
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆的半径:");
        double r = scanner.nextDouble();
        System.out.println("该圆的面积为：" + Math.PI * Math.pow(r,2));
    }
}
