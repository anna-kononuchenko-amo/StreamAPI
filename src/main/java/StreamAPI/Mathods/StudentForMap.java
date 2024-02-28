package StreamAPI.Mathods;

import java.util.Arrays;

public class StudentForMap {
    private String fullName;
    private int group;
    private int[] marks;

    public StudentForMap(String fullName, int group, int[] marks) {
        this.fullName = fullName;
        this.group = group;
        this.marks = marks;
    }

    public String getFullName() {
        return fullName;
    }

    public int getGroup() {
        return group;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGroup(int group) {
        this.group = group;
    }


    @Override
    public String toString() {
        return "Student {" +
                "fullName='" + fullName + '\'' +
                ", marks=" + Arrays.toString(marks) + // перетворює масив marks на його рядкове представлення, яке буде містити всі його елементи.
                '}';
    }
}
