package StreamAPI.Mathods;

import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    public static void main(String[] args) {
        List<String> list = List.of("One", "Two", "Three", "Four", "Five");
        System.out.println(
                list.stream().collect(Collectors.joining())
        );
        System.out.println(
                list.stream().collect(Collectors.joining(", "))
        );
        System.out.println(
                list.stream().collect(Collectors.joining(", ", "[", "]"))
        );
    }
}
