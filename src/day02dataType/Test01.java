package day02dataType;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/7 21:17
 **/
public class Test01 {
    public static void main(String[] args) {
        boolean flag = false;
        for (;;) {
            Scanner scanner = new Scanner(System.in);
            boolean circle = circle(scanner, flag);
            if (circle) {
                break;
            }
        }
    }

    public static boolean circle(Scanner scanner,boolean flag) {
        for (;;) {
            try {
                System.out.println("要结束了吗?硕硕,输入 我不行了 即可结束!");
                Scanner sc = new Scanner(System.in);
                String endCode = sc.nextLine();
                if ("我不行了".equals(endCode)) {
                    flag = true;
                    return flag;
                }
                System.out.println("请输入一个整数:");
                int sca = scanner.nextInt();
                System.out.println("您输入的整数为：" + sca);
                return flag;
            } catch (Exception e) {
                System.out.println("输入错误!");
                break;
            }
        }
        return flag;
    }

}
