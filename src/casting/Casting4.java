package casting;

public class Casting4 {

    public static void main(String[] args) {
        // 같은 타입의 계산은 같은 타입의 결과를 낸다. ex) int + int = int
        // 서로 다른 타입의 계산은 더 큰 타입으로 묵시적 형 변환이 진행된다. ex ) double + int = double
        int div1 = 3 / 2;
        System.out.println(div1);

        double div2 = 3/2;
        System.out.println(div2);

        double div3 = 3.0 / 2;
        System.out.println(div3);

        double div4 = (double) 3 / 2;
        System.out.println(div4);

        int a = 3;
        int b = 2;
        double result = (double) 3 / 2;
        System.out.println(result);
    }
}
