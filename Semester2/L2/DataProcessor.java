package lab_13;

import java.util.HashSet;
import java.util.Iterator;

public class DataProcessor {
    
    static boolean isPhone(String phone) {
        char[] c = phone.toCharArray();
        int digitsNumber = 0;
        for (char i : c) {
            if ((int) i > 47 && (int) i < 58){
                digitsNumber++;
                continue;
            } 
            if ((int) i != 45) return false;
        }
        return digitsNumber == 10;
    }
    
    static int addStudent(Faculty faculty, Student student, int attempts) {
        try {
            faculty.addStudent(student);
            System.out.println(student.getName() + " " + student.getSurname() + " added to " + faculty.getName());
        } catch (FacultyOverflowException e) {
            System.out.println(e.getMessage());
        } finally {
            return attempts += 1;
        }
    }

    static int findAmountOfStudents(Institute institute) {
        int countStudents = 0;

        for (Iterator<Faculty> i = institute.faculties.iterator(); i.hasNext();) {
            Faculty f = (Faculty) i.next();
            countStudents += f.students.size();
        }

        System.out.println("Amount of students: " + countStudents);
        return countStudents;
    }

    static HashSet<Faculty> findTheBiggestFaculty(Institute institute) {
        int countStudents = 0;
        HashSet<Faculty> theBiggestFaculties = new HashSet<>();

        for (Iterator i = institute.faculties.iterator(); i.hasNext();) {
            Faculty f = (Faculty) i.next();
            if (f.students.size() > countStudents) {
                countStudents = f.students.size();
                theBiggestFaculties = new HashSet<>();
                theBiggestFaculties.add(f);
            } else if (f.students.size() == countStudents) {
                theBiggestFaculties.add(f);
            }
        }

        System.out.print("The Biggest Faculties ");
        System.out.print((theBiggestFaculties.size() == 1) ? "is " : "are ");
        for (Iterator i = theBiggestFaculties.iterator(); i.hasNext();) {
            System.out.print(((Faculty) i.next()).getName() + ", ");
        }
        System.out.println("Amount of students = " + countStudents);

        return theBiggestFaculties;

    }

    static HashSet<Student> listOfExcellentStudents(Institute institute) {
        HashSet<Student> set = new HashSet<>();
        for (Faculty faculty : institute.faculties) {
            for (Student student : faculty.students) {
                if (student.getAverageGrade() >= 95 && student.getAverageGrade() <= 100) {
                    set.add(student);
                }
            }
        }
        System.out.println("\nThe list of excellent students: " + set + "\n");
        return set;
    }
    
    static void printStudentsPhone(Student student, Institute institute) {
        System.out.println(student.getName() + " " + student.getSurname() + " : " + institute.getStudentsPhone(student));
    }
}
