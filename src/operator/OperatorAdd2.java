package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a; // 전위 증감, a 선 증가 후 b에 대입
        System.out.println("a = " + a + "\nb = "+ b);

        int c = 1;
        int d = 0;
        d = c++;
        System.out.println("c = " + c + "\nd = "+ d);
    }
}
