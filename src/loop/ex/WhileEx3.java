package loop.ex;

public class WhileEx3 {

    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        int max = 100;

        while (count <= max) {
            System.out.println(sum);
            sum = sum + count;
            count++;
        }
    }
}
