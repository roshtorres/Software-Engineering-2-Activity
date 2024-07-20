package _5observerPattern;
import java.util.ArrayList;
import java.util.List;

public class Honor implements HonorSubject
{
    private double averageGrade;
    private List<StudentObserver> students;

    public Honor(double averageGrade)
    {
        this.averageGrade = averageGrade;
        students = new ArrayList<>();
    }

    @Override
    public void includeStudent(Student student)
    {
        if (student.getAverageGrade() == 1.75)
        {
            student.setHonor("Cum Laude");
            students.add(student);
        }
        else if (student.getAverageGrade() >= 1.25 && student.getAverageGrade() < 1.75)
        {
            student.setHonor("Magna Cum Laude");
            students.add(student);
        }
        else if (student.getAverageGrade() < 1.25)
        {
            student.setHonor("Summa Cum Laude");
            students.add(student);
        }
    }

    @Override
    public void excludeStudent(Student student)
    {
        students.remove(student);
    }

    @Override
    public void notifyStudents()
    {
        for (StudentObserver student : students)
        {
            student.updateStudent(this);
        }
    }

    public double getAverageGrade()
    {
        return averageGrade;
    }
}
