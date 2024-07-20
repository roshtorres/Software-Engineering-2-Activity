package _5observerPattern;

public interface HonorSubject
{
    void includeStudent(Student student);
    void excludeStudent(Student student);
    void notifyStudents();
}
