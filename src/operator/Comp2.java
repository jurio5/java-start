package operator;

public class Comp2 {

    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); // true
        boolean result2 = str1.equals("문자열1"); // true
        boolean result3 = str1.equals(str2); // false

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("hello" == "hello"); // 현재는 true가 출력되지만 객체를 생성 시 메모리 주소 위치가 다르기에 false를 출력

    }
}
