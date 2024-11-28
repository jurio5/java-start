package variable;

public class Var8 {

    public static void main(String[] args) {
        //정수
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 21억)

        long l = 9223372036854775807L; // 큰 단위의 Long 타입 뒤에 소문자 혹은 대문자 L 기입 , 대문자를 권장

        //실수
        float f = 10.0f; // float 타입 뒤에는 소문자 혹은 대문자 f 기입 , 대문자를 권장
        double d = 10.0; // 기본적으로 실수는 double 형을 사용
    }
}
