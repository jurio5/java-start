package operator;

public class Operator4 {

    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3; // 아래와 결과 값이 동일 , 연산자 우선순위
        int sum4 = (2 * 2) + (3 * 3); // 가시성을 위해 괄호를 사용
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}
