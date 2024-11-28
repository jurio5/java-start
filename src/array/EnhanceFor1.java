package array;

public class EnhanceFor1 {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        for (int i = 0; i < numbers.length; i++) { // 일반 for
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        for (int number : numbers) { // for - Each
            System.out.print(number + " ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) { // for - each 에서는 이런 형식으로 사용이 거의 불가능하다. (불가능 하진 않고 번거로워지며, 클린코드를 헤치는 요인이 된다.)
            System.out.println("numbers" + i + "의 결과는" + numbers[i]); // i 를 직접적으로 카운팅해서 참조해야 하는 경우
        }

    }
}
