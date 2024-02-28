package StreamAPI.Presa;

public class Student {
    private String name;
    private String surname;
    private int yearOfStudy;

    public Student(String name, String surname, int yearOfStudy) {
        this.name = name;
        this.surname = surname;
        this.yearOfStudy = yearOfStudy;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfStady='" + yearOfStudy +
                '}';
    }
}
