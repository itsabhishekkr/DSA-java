import java.util.*;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Charlie"));
        students.add(new Student(2, "Alice"));
        students.add(new Student(3, "Bob"));

        // Custom sorting by ID using Comparator
        Comparator<Student> byId = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.id, s2.id); // Sort by ID
            }
        };

        Collections.sort(students, byId);

        System.out.println("Sorted by ID: " + students);
    }
}
