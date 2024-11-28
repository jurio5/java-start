package method.ex;

public class MethodEx3 {

    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(1000,balance);
        balance = withdraw(2000,balance);

    }

    public static int deposit(int depositAmount , int myMoney) {
        myMoney = myMoney + depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다.\n현재 잔액 : " + myMoney);
        return myMoney;
    }

    public static int withdraw(int withdrawAmount , int myMoney) {
        if (myMoney >= withdrawAmount) {
            myMoney = myMoney - withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다.\n현재 잔액 : " + myMoney);
        } else {
            System.out.println(withdrawAmount + "원을 출금하려고 했으나 잔액이 부족합니다.");
        }
        return myMoney;
    }
}
