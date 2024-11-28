package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            printHeadeer();
            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.print("입금액을 입력하세요 : ");
                    int inMoney = scanner.nextInt();
                    balance = deposit(balance , inMoney);
                    continue;
                case 2:
                    System.out.print("출금액을 입력하세요 : ");
                    int outMoney = scanner.nextInt();
                    balance = withdraw(balance , outMoney);
                    continue;
                case 3:
                    System.out.println("현재 잔액 : " + balance);
                    continue;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해 주세요.");
            }
        }
    }
    public static int deposit(int balance , int Amount) {
        balance = balance + Amount;
        System.out.println(Amount + "원을 입금하였습니다.\n현재 잔액 : " + balance);

        return balance;
    }

    public static int withdraw(int balance , int Amount) {
        if (balance >= Amount) {
        balance = balance - Amount;
            System.out.println(Amount + "원을 출금하였습니다.\n현재 잔액 : " + balance);
        } else {
            System.out.println(Amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }

    public static void printHeadeer() {
        System.out.println("----------------------------------------");
        System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
        System.out.println("----------------------------------------");
        System.out.print("선택 : ");
    }
}
