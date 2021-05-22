package lab_13;

import java.util.Objects;

public class Student {

    private final String name;
    private final String surname;
    private final int creditBookNumber;
    private double averageGrade;

    public Student(String name, String surname, int creditBookNumber, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.creditBookNumber = creditBookNumber;
        this.averageGrade = averageGrade;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getSurname() {
        return this.surname;
    }
    
    public int getCreditBookNumber() {
        return this.creditBookNumber;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.surname);
        hash = 41 * hash + this.creditBookNumber;
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
        final Student other = (Student) obj;
        if (this.creditBookNumber != other.creditBookNumber) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\n" + name + " " + surname + ", №" + creditBookNumber + ", Grade: " + averageGrade;
    }

}
