package method.ex;

public class MethodEx1 {

    public static void main(String[] args) {
        average(15,25,35);
    }

    public static double average(int a , int b , int c) {
        int sum = a + b + c;
        double avg = sum / 3.0;
        System.out.println("평균 값 : " + avg);
        return avg;
    }
}
