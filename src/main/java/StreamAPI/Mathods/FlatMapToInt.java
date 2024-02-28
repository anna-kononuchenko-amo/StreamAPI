package StreamAPI.Mathods;

import java.util.Arrays;
import java.util.List;

public class FlatMapToInt {
    public static void main(String[] args) {
        List<StudentWithMarks> students = List.of(
                new StudentWithMarks("A.A.", new int[] {9, 9, 6, 10}),
                new StudentWithMarks("B.B.", new int[] {5, 6, 10, 9}),
                new StudentWithMarks("C.C.", new int[] {5, 7, 5, 9}),
                new StudentWithMarks("D.D.", new int[] {8, 5, 6, 9})
        );
        double averageMarkIntGroup = students.stream()
                .flatMapToInt(studentWithMarks -> Arrays.stream(studentWithMarks.getMarksArray()))
                .average().getAsDouble();
        System.out.println(averageMarkIntGroup);
    }
}
