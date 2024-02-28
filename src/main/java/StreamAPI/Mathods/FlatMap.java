package StreamAPI.Mathods;

import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<StudentWithMarks> students = List.of(
                new StudentWithMarks("A.A.", List.of(9, 9, 6, 10)),
                new StudentWithMarks("B.B.", List.of(5, 6, 10, 9)),
                new StudentWithMarks("C.C.", List.of(5, 7, 5, 9)),
                new StudentWithMarks("D.D.", List.of(8, 5, 6, 9))
        );
        List<Integer> marks = students.stream()
                .flatMap(student -> student.getMarks().stream())
                .toList();
        System.out.println(marks);
    }
}