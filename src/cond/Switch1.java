package cond;

public class Switch1 {

    public static void main(String[] args) {
        int grade = 1;
        int coupon;
        
        
        if (grade == 1) {
            coupon = 1000;
            System.out.println("1등급");
        } else if (grade == 2) {
            coupon = 2000;
            System.out.println("2등급");
        } else if (grade == 3) {
            coupon = 3000;
            System.out.println("3등급");
        } else {
            coupon = 500;
            System.out.println("등급 없음");
        }
    }
}
