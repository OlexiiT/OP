package lab_12;

public class Lab_12 {

    public static void main(String[] args) {
        
        Institute kpi = new Institute("KPI");

        Faculty fict = new Faculty("FICT");
        kpi.addFaculty(fict);
        Faculty iasa = new Faculty("IASA");
        kpi.addFaculty(iasa);
        Faculty ipt = new Faculty("IPT");
        kpi.addFaculty(ipt);

        kpi.addFaculty(fict);

        Student student1 = new Student("Ivan", "Ivanov", 1, 98);
        fict.addStudent(student1);
        Student student2 = new Student("Maksym", "Krut", 2, 100);
        fict.addStudent(student2);

        Student student3 = new Student("Oleksii", "Tymoshenko", 3, 90);
        fict.addStudent(student3);
        Student student4 = new Student("Oleksii", "Galuga", 4, 95.5);
        iasa.addStudent(student4);

        Student student5 = new Student("Maksym", "Krut", 3, 99);
        iasa.addStudent(student5);
        Student student6 = new Student("Oleksii", "Galuga", 4, 95.5);
        iasa.addStudent(student6);

        Student student7 = new Student("Krotov", "Anton", 5, 74);
        iasa.addStudent(student7);
        Student student8 = new Student("Baginsky", "Dmytro", 6, 65.8);
        ipt.addStudent(student8);

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
        DataProcessor.printStudentsPhone(student8, kpi);

    }

}
