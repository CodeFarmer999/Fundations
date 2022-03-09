package day02Homework;

import cn.hutool.core.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/8 22:09
 **/
public class Test16 {
    public static void main(String[] args) {
        int num = 3;
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("请输入第" + (i + 1) + "个数字：");
            int temp = scanner.nextInt();
            Array.setInt(arr, i, temp);
        }
        Arrays.sort(arr);
        // 这里引入了hutool的jar包
        String join = ArrayUtil.join(arr, ">");
        StringBuilder stringBuilder = new StringBuilder(join);
        System.out.println("从大到小排列为：" + stringBuilder.reverse());
    }
}
