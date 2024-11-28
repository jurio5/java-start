package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 숫자를 더하는 프로그램 입니다. (종료는 두 숫자를 0으로 입력 시 종료됩니다.)");
        while(true) {
            System.out.println("첫 번째 숫자를 입력해주세요.");
            int num1 = scanner.nextInt();
            System.out.println("두 번째 숫자를 입력해주세요.");
            int num2 = scanner.nextInt();

            int result = num1 + num2;

            if (result == 0) {
                System.out.println("0을 입력하여 프로그램을 종료합니다.");
                return;
            }

            System.out.println("두 수를 더한 값은 : " + result);

        }
    }
}
