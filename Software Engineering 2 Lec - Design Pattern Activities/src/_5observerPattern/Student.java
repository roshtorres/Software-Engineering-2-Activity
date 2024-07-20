package _5observerPattern;

public class Student implements StudentObserver
{
    private String studentNumber;
    private String studentName;
    private double averageGrade;
    private String honor;

    public Student(String studentNumber, String studentName, double averageGrade)
    {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.averageGrade = averageGrade;
    }

    @Override
    public void updateStudent(Honor honor)
    {
        System.out.println("Student Name: " + studentName +
                           "\nStudent Number: " + studentNumber +
                           "\nAverage Grade: " + averageGrade +
                           "\nCongratulations, you are considered " + this.honor + "!\n" +
                           "----------------------------------------------------");
    }

    public String getStudentNumber()
    {
        return studentNumber;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public double getAverageGrade()
    {
        return averageGrade;
    }

    public String getHonor()
    {
        return honor;
    }

    public void setHonor(String honor)
    {
        this.honor = honor;
    }
}
