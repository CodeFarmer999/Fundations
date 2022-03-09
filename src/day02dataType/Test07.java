package day02dataType;

/**
 * @author Turing
 * @date 2022/3/7 23:35
 **/
public class Test07 {
    public static void main(String[] args) {
        Computer computer = new Computer("联想", "笔记本", 5.4, 49999);
        System.out.println(computer);
    }
}
class Computer {
    String brand;
    String type;
    double weight;
    double price;

    public Computer() {
    }

    public Computer(String brand, String type, double weight, double price) {
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "品牌：" + brand + "\n" +
                "种类：" + type + "\n" +
                "重量：" + weight + "\n" +
                "价格：" + price;
    }
}
