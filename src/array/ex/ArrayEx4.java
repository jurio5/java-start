package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;
        double average;

        System.out.println("5개의 정수를 입력하세요 : ");

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
            sum = sum + num[i];
        }

        System.out.println("입력한 정수의 합계 : " + sum);

        average = (double) sum / num.length;
        System.out.println("입력한 정수의 평균 : " + average);
    }
}
