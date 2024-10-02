
import java.util.Scanner;

public class driverClass {
    /************* ✨ Codeium Command ⭐ *************/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int salary = 200000;
        System.out.println("Choose one : ");
        System.out.println("1. Student\n2. Teacher ");
        String pilihan = input.nextLine();

        if (pilihan.equals("1")) {
            System.out.println("Student Details : ");
            System.out.println("Name : ");
            String name = input.nextLine();
            System.out.println("Major : ");
            String major = input.nextLine();
            System.out.println("Age : ");
            int age = input.nextInt();
            input.nextLine();
            System.out.println("Student Number : ");
            int studentNumber = input.nextInt();
            input.nextLine();
            System.out.println("Score : ");
            int score = input.nextInt();
            Student student = new Student(name, age, studentNumber, score, major);
            student.print();
        } else if (pilihan.equals("2")) {
            System.out.println("Choose one : ");
            System.out.println("1. Part Time\n2. Full Time : ");
            String pilihan2 = input.nextLine();
            if (pilihan2.equals("1")) {
                System.out.println("Part Time Details : ");
                System.out.println("Name : ");
                String name = input.nextLine();
                System.out.println("Subject : ");
                String subject = input.nextLine();
                System.out.println("Age : ");
                int age = input.nextInt();
                input.nextLine();
                System.out.println("Hours Worked : ");
                int hoursWorked = input.nextInt();
                PartTime partTime = new PartTime(name, age, subject, hoursWorked, salary);
                partTime.print();
            } else if (pilihan2.equals("2")) {
                System.out.println("Full Time Details : ");
                System.out.println("Name : ");
                String name = input.nextLine();
                System.out.println("Subject : ");
                String subject = input.nextLine();
                System.out.println("Unit : ");
                String unit = input.nextLine();
                System.out.println("Age : ");
                int age = input.nextInt();
                System.out.println("Annual Salary : ");
                int annualSalary = input.nextInt();
                FullTime fullTime = new FullTime(name, age, subject, annualSalary, unit);
                fullTime.print();
            }
        }
    }
}
