package day02dataType;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/7 23:10
 **/
public class Test06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字a:");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数字b:");
        int b = scanner.nextInt();
        NumAll numAll = new NumAll(a, b);
        swap(numAll);
        System.out.println("交换后a=" + numAll.a);
        System.out.println("交换后b=" + numAll.b);
    }

    public static void swap(NumAll numAll) {
        int temp = numAll.a;
        numAll.a = numAll.b;
        numAll.b = temp;
    }

    static class NumAll {
        int a;
        int b;

        public NumAll() {
        }

        public void setA(int a) {
            this.a = a;
        }

        public void setB(int b) {
            this.b = b;
        }

        public NumAll(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }
    }
}
