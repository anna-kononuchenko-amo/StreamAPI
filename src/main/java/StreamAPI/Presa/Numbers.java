package StreamAPI.Presa;

import java.util.stream.IntStream;

public class Numbers {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int step = 0, sum = 0;
//        for (int x : arr) {
//            if (step >= 3) break;
//            step++;
//            sum += x;
//            System.out.println(x);
//        }
//        System.out.println("Sum = " + sum);
//    }

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 10).limit(3).reduce(0, (accumulator, x) -> {
            System.out.println(x);
            return accumulator + x;
        });
        System.out.println("Sum = " + sum);
    }
}
