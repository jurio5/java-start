package cond;

public class If5 {

    public static void main(String[] args) {
        int price = 10000;
        int discount = 0;
        int age = 10;


        if (price >= 10000 ) {
            discount = discount + 1000;
            System.out.println("10,000원 이상, 1,000원 할인");
        }

        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("10살 이하, 1,000원 할인");
        }

        price = price - discount;

        System.out.println(price);
    }
}
