package scanner;

import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("문자열을 입력해주세요. (종료 = exit)");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("exit 가 입력되어 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열 : " + str);
        }
    }
}
