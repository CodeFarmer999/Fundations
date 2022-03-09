package day02dataType;

import java.util.Scanner;

/**
 * @author Turing
 * @date 2022/3/7 23:46
 **/
public class Test09 {
    public static void main(String[] args) {
        int ji = 1;
        Ha ha = new Ha(ji);
        boolean flag = false;
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            boolean circle = circle(scanner, flag, ha);
            if (circle) {
                break;
            }
        }
        System.out.println(ha.ji);
    }

    public static boolean circle(Scanner scanner, boolean flag, Ha ha) {
        for (; ; ) {
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
                ha.ji *= sca;

                return flag;
            } catch (Exception e) {
                System.out.println("输入错误!");
                break;
            }
        }
        return flag;
    }
}

class Ha {
    int ji;

    public Ha() {
    }

    public Ha(int ji) {
        this.ji = ji;
    }

    public int getJi() {
        return ji;
    }

    public void setJi(int ji) {
        this.ji = ji;
    }
}
