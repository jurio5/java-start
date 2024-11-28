package method;

public class MethodCasting2 {

    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // 묵시적 형 변환 int - > double (double 이 int 보다 더 큰 값이기 때문)
    }

    public static void printNumber(double n) {
        System.out.println("숫자 : " + n);
    }
}
