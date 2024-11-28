package cond.ex;

public class ExchangeRateEx {

    public static void main(String[] args) {
        final int DOLLAR = 1300;
        int money = 10;
        int exchangeMoney = DOLLAR * money;

        if (DOLLAR < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (DOLLAR == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            System.out.println("환전 금액은 " + exchangeMoney + "원입니다.");
        }
    }
}
