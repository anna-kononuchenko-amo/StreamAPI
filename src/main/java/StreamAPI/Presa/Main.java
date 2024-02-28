package StreamAPI.Presa;

import java.util.stream.Stream;

public class Main {
//    public static void main(String[] args) {
//        List<String> list = List.of("One", "Two", "Three");
//        Stream<String> stream = list.stream();
//        stream = stream.map(value -> "Number: " + value);
//        List<String> newNumberedList = stream.toList();
//        System.out.println(newNumberedList);
//    }

    public static void main(String[] args) {
        Stream stream = Stream.of("One", "Two", "Three");
        stream.skip(1);
        stream.skip(1);
    }
}
