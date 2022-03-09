package day01Fundation;

/**
 * @author Turing
 * @date 2022/3/7 19:55
 **/
public class Test09 {
    static final int X = 5;
    public static void main(String[] args) {

        new Test09().go(X);
        System.out.print(X);
    }
    void go(int x) {
        System.out.print(x++);
    }
}
