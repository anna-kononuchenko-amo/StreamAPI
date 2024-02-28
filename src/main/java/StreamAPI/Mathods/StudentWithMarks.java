package StreamAPI.Mathods;

import java.util.Arrays;
import java.util.List;

public class StudentWithMarks {
    private String fullName;
    private List<Integer> marks;

    public StudentWithMarks(String fullName, List<Integer> marks) {
        this.fullName = fullName;
        this.marks = marks;
    }

    // з int[] в List
    public StudentWithMarks(String fullName, int[] marks) {
        this.fullName = fullName;
        this.marks = Arrays.stream(marks)
                .boxed()
                .toList();
    }

    public String getFullName() {
        return fullName;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    // з List в int[]
    public int[] getMarksArray() {
        return marks.stream().mapToInt(i->i).toArray();
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
