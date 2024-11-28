package loop.ex;

public class NestedEx2 {

    public static void main(String[] args) {
        int rows = 5;
        boolean flag = false;

        for (int i = 1; i <= rows; i++) {
            if (flag == true) {
                System.out.println("");
            }
                flag = true;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}
