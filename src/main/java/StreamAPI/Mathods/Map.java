package StreamAPI.Mathods;

import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<StudentForMap> students = List.of(
                new StudentForMap("A.A.", 1, new int[] {9, 9, 6, 10}),
                new StudentForMap("B.B.", 2, new int[] {5, 6, 10, 9}),
                new StudentForMap("C.C.", 1, new int[] {5, 7, 5, 9}),
                new StudentForMap("D.D.", 2, new int[] {8, 5, 6, 9}),
                new StudentForMap("C.C.", 2, new int[] {8, 5, 6, 9})
        );
        java.util.Map<Integer, List<StudentForMap>> studentByGroup = students.stream()
                .collect(Collectors.groupingBy(StudentForMap::getGroup));

        studentByGroup.forEach((group, studentsList) -> {
            System.out.println("Group: " + group);
            studentsList.stream()
                    .map(StudentForMap::toString)
                    .forEach(System.out::println);
        });
    }
}
