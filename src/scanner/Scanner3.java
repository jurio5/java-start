package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력해 주세요.");
        int num1 = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력해 주세요.");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("현재 입력한 두 숫자는 동일합니다.");
            return;
        }

        int result1 = Math.max(num1,num2); // max를 사용해도 될 것임
                
        int result = (num1 > num2) ? num1 : num2;

        System.out.println("두 개의 숫자 중 더 큰 숫자는 : " + result);
    }
}
