package StreamAPI.Presa;

import java.util.List;

public class Motivation {
    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("Denis", "Popov", 3),
                new Student("Zoriana", "Datsko", 1),
                new Student("Vitaliy", "Kharitonov", 2)
        );

        List<User> users = studentList.stream()
                .filter(student -> student.getYearOfStudy() > 1)
                .map(student ->
                        new User(student.getName(), student.getSurname()))
                .toList();

        System.out.println(users);
    }
}

