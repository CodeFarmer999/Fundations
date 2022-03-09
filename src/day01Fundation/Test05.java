package day01Fundation;

/**
 * @author Turing
 * @date 2022/3/7 19:22
 **/
public class Test05 {
    public static void main(String[] args) {
        // 片段1
        int a = 10;

        {
            a = 20;
            System.out.println(a);
        }

        // 片段2
        {
            int b = 20;
            System.out.println(b);
        }

        int b = 30;
        System.out.println(b);
    }
}
