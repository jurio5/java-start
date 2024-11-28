package loop;

public class Break2 {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; ; i++) {
            if (sum > 10) {
                break;
            }
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
