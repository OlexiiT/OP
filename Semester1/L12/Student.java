package lab_12;

public class Student {

    private String name;
    private String surname;
    private final int creditBookNumber;
    private double averageGrade;

    public Student(String name, String surname, int creditBookNumber, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.creditBookNumber = creditBookNumber;
        this.averageGrade = averageGrade;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
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
        return this.creditBookNumber == other.creditBookNumber;
    }

    @Override
    public String toString() {
        return "\n" + name + " " + surname + ", №" + creditBookNumber + ", Grade: " + averageGrade;
    }

}
