package scanner;

import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력해 주세요.");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력해 주세요.");
        int num2 = scanner.nextInt();

        System.out.println("두 숫자의 합은 : " + (num1 + num2));
    }
}
