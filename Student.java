/**
 * Student
 */
public class Student extends Person {
    private int studentNumber, score;
    private String major;

    public int getStudentNumber()
    {
		return this.studentNumber;
	}

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setStudentNumber(int studentNumber)
    {
		this.studentNumber = studentNumber;
	}

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public Student() {
        super();
        studentNumber = 0;
        score = 0;
        major = "NULL";
    }
    public Student(String name, int age, int studentNumber, int score, String major) {
        super(name, age);
        this.studentNumber = studentNumber;
        this.score = score;
        this.major = major;
    }
    public void print() {
        System.out.println("-------- Student --------");
        super.print();
        System.out.println(" Student Number: " + studentNumber + "\n Score: " + score + "\n Major: " + major);
    }
}