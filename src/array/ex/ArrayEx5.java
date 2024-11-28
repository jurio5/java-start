package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int quantity = scanner.nextInt();
        int[] ary = new int[quantity];
        int sum = 0;

        System.out.println(ary.length + "개의 정수를 입력하세요 : ");
        for (int i = 0; i < ary.length; i++) {
            ary[i] = scanner.nextInt();
            sum = sum + ary[i];
        }
        System.out.println("입력한 정수의 합계 : " + sum);
        double average = (double) sum / ary.length;
        System.out.println("입력한 정수의 평균 : " + average);
    }
}
