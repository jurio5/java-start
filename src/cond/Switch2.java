package cond;

public class Switch2 {

    public static void main(String[] args) {
        int grade = 1;
        int coupon;
        
        switch (grade) {
            case 1:
                coupon = 1000;
                System.out.println("1등급");
                break;
            case 2:
                coupon = 2000;
                System.out.println("2등급");
                break;
            case 3:
                coupon = 3000;
                System.out.println("3등급");
                break;
            default:
                coupon = 500;
                System.out.println("등급 없음");
        }
    }
}
