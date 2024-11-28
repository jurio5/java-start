package scope;

public class Scope1 {

    public static void main(String[] args) {
    int m = 10; // main local scope

    if (true) {
        int x = 20; // if의 scope
        System.out.println(m);
        System.out.println(x);
    }
//        System.out.println(x);
    }
}
