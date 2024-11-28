package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력 한 값을 모두 더하는 프로그램 입니다. (종료 = 0)");

        int sum = 0;

        while (true) {

            System.out.println("정수를 입력해 주세요.");
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println("현재까지 입력한 값의 합은 : " + sum);
                break;
            }

            sum = sum + num;
            System.out.println("입력한 값은 : " + num);
        }
    }
}
