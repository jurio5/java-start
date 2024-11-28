package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println(intValue);

        intValue = (int) maxIntOver; // int의 최대 값을 초과했기에 오버 플로우(Over flow)가 발생하며, 이를 2의 보수로 전환
        System.out.println(intValue);
    }
}
