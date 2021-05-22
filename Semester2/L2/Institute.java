package lab_13;

import java.util.HashMap;
import java.util.HashSet;

public class Institute {

    private String name;
    public HashSet<Faculty> faculties = new HashSet<>();
    private HashMap<Student, String> phoneDatabase = new HashMap<>();

    public void changeStudentsPhone(Student student, String phone) {
        try {
            addStudentsPhone(student, phone);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void addStudentsPhone(Student student, String phone) throws IllegalArgumentException {
        if (DataProcessor.isPhone(phone)) {
            phoneDatabase.put(student, phone);
        } else {
            throw new IllegalArgumentException("Exception! This is not a correct phone number!");
        }
    }

    public String getStudentsPhone(Student student) {
        String phone = phoneDatabase.get(student);
        return !(phone == null) ? phone : "The phone is not in the database!";
    }

    public void removeStudentsPhone(Student student) {
        phoneDatabase.put(student, null);
    }

    public Institute(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void gelFaculty(Faculty faculty) {
        faculties.remove(faculty);
    }

    @Override
    public String toString() {
        return name + ", faculties=" + faculties;
    }

}
