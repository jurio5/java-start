package cond;

public class If6 {

    public static void main(String[] args) {
        int age = 10;
        int discount = 0;
        int price = 10000;
        
        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10,000원 이상, 1,000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("10살 이하, 1,000원 할인");
        } else {
            System.out.println("할인이 적용되지 않음");
        }
        System.out.println("총 " + discount + "원 할인");
    }
}
