package day02dataType;

/**
 * @author Turing
 * @date 2022/3/7 22:51
 **/
public class Test05 {
    public static void main(String[] args) {
        double yesterday = 20;
        double per = 9.8;
        double today = yesterday * (100 + 9.8) / 100;
        System.out.println("今年所占市场份额为:" + today);
    }
}
