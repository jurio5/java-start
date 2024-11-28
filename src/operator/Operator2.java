package operator;

public class Operator2 {

    public static void main(String[] args) {
        // 문자열 더하기

        String result1 = "Hello" + "World";
        System.out.println(result1);

        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);
        
        String result3 = "a + b = " + "10"; // 문자열을 만나는 순간 문자열로 출력
        System.out.println(result3);

        int num = 20;
        String str = "a + b = ";
        String result4 = "a + b = " + 20; // 이 역시 동일히 문자열로 변환
        System.out.println(result4);
    }
}
