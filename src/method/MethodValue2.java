package method;

public class MethodValue2 {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. 호출 전 : " + number);
        changeNumber(number);
        System.out.println("4. 호출 후 : " + number);

    }

    public static void changeNumber(int number) {
        System.out.println("2. 변경 전 : " + number);
        number = number * 2;
        System.out.println("3. 변경 후 : " + number);
    }
}
