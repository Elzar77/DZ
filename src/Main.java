import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter
public class Main {
    public static void main(String[] args) {
        SCHOOL school = new SCHOOL("Suorov", "USA", LocalDate.of(1999,9,1));
        UNIVERSITY university = new UNIVERSITY("Hogvarts", "USA", LocalDate.of(1985, 9, 1));
        COLLEGE college = new COLLEGE("Meta", "KG", LocalDate.of(2022, 9, 1));
        Student student1 = new Student("Elzar", "Arzybekov", "Men", LocalDate.of(2025,9,1), university);
        Student student2 = new Student("Altynbek", "Sabina", "Girl", LocalDate.of(2020,9,1), college);
        Student student3 = new Student("Ali", "Sam", "boy", LocalDate.of(2023,9,1), school);
        Student student4 = new Student("Aldos", "Benel", "Trans", LocalDate.of(2000,9,1), university);
        Student student5 = new Student("Alykard", "Nikka", "boy", LocalDate.of(2000,9,1), college);
        Student student6 = new Student("Brok", "Alman", "boy", LocalDate.of(2000,9,1), school);
        Student student7 = new Student("Sara", "Notgey", "girl", LocalDate.of(2000,9,1), university);
        Student student8 = new Student("Alisa", "Moris", "girl", LocalDate.of(2000,9,1), college);
        Student student9 = new Student("Kamila", "Klint", "girl", LocalDate.of(2000,9,1), school);
        Student student10 = new Student("Amanat", "Neter", "boy", LocalDate.of(2000,9,1), college);

        Student[] students = {student1,student2, student3,student4,student5,student6, student7,student8,student9,student10};
        getInfo(students);
    }
    public static void getInfo(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getNAME());
            System.out.println(students[i].getSURNAME());
            System.out.println(students[i].getGENDER());
            System.out.println(students[i].getDATEOFSTART());
            System.out.println(students[i].getEDUCATIONCENTER().getNAME());
        }
    }
}