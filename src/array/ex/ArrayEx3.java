package array.ex;

import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ary = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < ary.length; i++) {
            ary[i] = scanner.nextInt();
        }

        for (int i = ary.length-1; i >= 0; i--) {
            System.out.print(ary[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        scanner.close();
    }
}
