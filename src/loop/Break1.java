package loop;

public class Break1 {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (true) {
            if (sum > 10) {
                break;
            }
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
