package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int quantity = scanner.nextInt();
        int[] ary = new int[quantity];

        System.out.println(ary.length + "개의 정수를 입력하세요 : ");

        for (int i = 0; i < ary.length; i++) {
            ary[i] = scanner.nextInt();
        }

        int minValue = ary[0];
        int maxValue = ary[0];

        for (int i = 1; i < ary.length; i++) {
            if (minValue > ary[i]) {
                minValue = ary[i];
            }
            if (maxValue < ary[i]) {
                maxValue = ary[i];
            }
        }

        System.out.println("가장 작은 정수 : " + minValue);
        System.out.println("가장 큰 정수 : " + maxValue);
    }
}
