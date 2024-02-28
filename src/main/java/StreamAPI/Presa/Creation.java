package StreamAPI.Presa;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Creation {
    public static void main(String[] args) {
        Stream<String> streamForList = List.of("Hello", "World").stream();
        Stream<String> streamForSet = Set.of("Hello", "World").stream();
        Stream<Map.Entry<String, String>> streamFromMapEntry = Map.of("Hello", "World").entrySet().stream();

        Stream<String> streamFromStringArray = Arrays.stream(new String[]{"Hello", "World"});
        IntStream streamFromIntArray = Arrays.stream(new int[]{1, 2, 3, 4, 5});

        Stream streamOf = Stream.of("Hello", "World");
    }
}
