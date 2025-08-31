package StudentTestDemo;

import java.util.Objects;

public class Student {
    private String studentId;
    private String studentName;

    public Student(String studentId, String studentName) {
        if (studentId == null || studentName == null || studentName.isEmpty()) {
            throw new IllegalArgumentException("Student ID and name must not be null or empty");
        }
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return Objects.equals(studentId, other.studentId) &&
               Objects.equals(studentName, other.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName);
    }

    @Override
    public String toString() {
        return studentName + " (" + studentId + ")";
    }
}
