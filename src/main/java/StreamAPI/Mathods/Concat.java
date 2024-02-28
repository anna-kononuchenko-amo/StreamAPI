package StreamAPI.Mathods;

import java.util.stream.Stream;

public class Concat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("One", "Two", "Three");
        Stream<String> stream2 = Stream.of("Four", "Five", "Six");
        Stream<String> streamConcat = Stream.concat(stream1, stream2);
        streamConcat.forEach(System.out::println);
    }
}
