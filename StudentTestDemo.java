package StudentTestDemo;

import java.util.HashSet;
import java.util.Set;

public class StudentTestDemo {
    public static void main(String[] args) {
        try {
            Student student1 = new Student("123", "John");
            Student student2 = new Student("456", "Alice");
            Student student3 = new Student("789", "Bob");
            Student student4 = new Student("101", "Mary");
            Student student5 = new Student("102", "Steve");
            Student student6 = new Student("123", "John"); // Duplicate of student1

            Set<Student> studentSet = new HashSet<>();
            studentSet.add(student1);
            studentSet.add(student2);
            studentSet.add(student3);
            studentSet.add(student4);
            studentSet.add(student5);
            studentSet.add(student6); // Should not be added

            System.out.println("Students in HashSet:");
            for (Student student : studentSet) {
                System.out.println(student);
            }

        } catch (IllegalArgumentException ex) {
            System.out.println("Error creating student: " + ex.getMessage());
        }
    }
}
