package lab_13;

public class Lab_13 {

    public static void main(String[] args){

        Institute kpi = new Institute("KPI");

        Faculty fict = new Faculty("FICT", 2);
        kpi.addFaculty(fict);
        Faculty iasa = new Faculty("IASA", 10);
        kpi.addFaculty(iasa);
        Faculty ipt = new Faculty("IPT", 5);
        kpi.addFaculty(ipt);

        kpi.addFaculty(fict);
        
        int attempts = 0;

        Student student1 = new Student("Ivan", "Ivanov", 1, 98);
        attempts = DataProcessor.addStudent(fict, student1, attempts);
        Student student2 = new Student("Maksym", "Krut", 2, 100);
        attempts = DataProcessor.addStudent(fict, student2, attempts);

        Student student3 = new Student("Oleksii", "Tymoshenko", 3, 90);
        attempts = DataProcessor.addStudent(fict, student3, attempts);
        Student student4 = new Student("Oleksii", "Galuga", 4, 95.5);
        attempts = DataProcessor.addStudent(iasa, student4, attempts);

        Student student5 = new Student("Maksym", "Krut", 3, 99);
        attempts = DataProcessor.addStudent(iasa, student5, attempts);
        Student student6 = new Student("Oleksii", "Galuga", 4, 95.5);
        attempts = DataProcessor.addStudent(iasa, student6, attempts);

        Student student7 = new Student("Krotov", "Anton", 5, 74);
        attempts = DataProcessor.addStudent(iasa, student7, attempts);
        Student student8 = new Student("Baginsky", "Dmytro", 6, 65.8);
        attempts = DataProcessor.addStudent(ipt, student8, attempts);
        
        System.out.println("attempts: " + attempts);
        System.out.println();

        DataProcessor.findAmountOfStudents(kpi);
        DataProcessor.findTheBiggestFaculty(kpi);
        DataProcessor.listOfExcellentStudents(kpi);

        kpi.changeStudentsPhone(student1, "066-066-00-66");
        kpi.changeStudentsPhone(student2, "066-066-00-66");
        kpi.changeStudentsPhone(student4, "066-055-00-66");
        kpi.changeStudentsPhone(student4, "099-999-99-99");
        kpi.changeStudentsPhone(student5, "066-066-00-55");
        kpi.changeStudentsPhone(student8, "066-000-00-00");

        DataProcessor.printStudentsPhone(student1, kpi);
        DataProcessor.printStudentsPhone(student2, kpi);
        DataProcessor.printStudentsPhone(student3, kpi);
        DataProcessor.printStudentsPhone(student4, kpi);
        DataProcessor.printStudentsPhone(student5, kpi);
        DataProcessor.printStudentsPhone(student6, kpi);
        DataProcessor.printStudentsPhone(student7, kpi);
        
        System.out.println();
        
        DataProcessor.printStudentsPhone(student8, kpi);
        kpi.changeStudentsPhone(student8, "043345-2342-432452-");
        DataProcessor.printStudentsPhone(student8, kpi);
        
    }
    
}
