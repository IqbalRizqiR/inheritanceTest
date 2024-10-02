/**
 * PartTime
 */
public class PartTime extends Teacher {
    private int hoursWorked;
    private int salary;

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public PartTime() {
        super();
        hoursWorked = 0;
        salary = 0;
    }
    public PartTime(String name, int age, String subject, int hoursWorked, int salary) {
        super(name, age, subject);
        this.hoursWorked = hoursWorked;
        this.salary = salary;
    }
    public void print() {
        System.out.println("-------- Part Time Student --------");
        super.print();
        System.out.println(" Hours Worked: " + hoursWorked + "\n Salary: " + salary + "\n Total Salary : " + (hoursWorked * salary));
    }
}