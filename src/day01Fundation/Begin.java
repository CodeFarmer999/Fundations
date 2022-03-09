package day01Fundation;

import org.junit.Test;

/**
 * @author Turing
 * @date 2022/3/7 13:52
 **/
public class Begin {

    @Test
    public void testDemo() {
        System.out.println("***************购物清单*****************");
        System.out.println("商品名称\t购买数量\t商品单价\t金额");
        System.out.println("华为P40\t1\t\t6999\t6999");
        System.out.println("华为P30\t1\t5999\t5999");
    }


    public static void main(String[] args) {
        int max = 9;
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= i; j++) {
                if (i != j) {
                    System.out.print(i + "x" + j + "=" + i * j + ",");
                } else {
                    System.out.println(i + "x" + j + "=" + i * j);
                }
            }
        }
    }

}
