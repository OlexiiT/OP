package lab_13;

import java.util.HashSet;
import java.util.Objects;

public class Faculty {

    private String name;
    private final int FACULTY_MAX_SIZE;
    public HashSet<Student> students = new HashSet<>();

    public Faculty(String name, int FACULTY_MAX_SIZE) {
        this.name = name;
        this.FACULTY_MAX_SIZE = FACULTY_MAX_SIZE;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) throws FacultyOverflowException{
        if (students.size() >= FACULTY_MAX_SIZE) {
            throw new FacultyOverflowException("Exception! The faculty is overcrowded!");
        }
        students.add(student);
    }

    public void delStudent(Student student) {
        students.remove(student);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Faculty other = (Faculty) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return name + ", students=" + students;
    }

}
