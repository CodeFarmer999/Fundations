package day02dataType;

/**
 * @author Turing
 * @date 2022/3/7 23:40
 **/
public class test08 {
    public static void main(String[] args) {
        int money = 0;
        int price = 80;
        money = (int) Math.floor(price * 658 + price * 0.85 * 2735);
        System.out.println("总销售额为:" + money);
    }
}
