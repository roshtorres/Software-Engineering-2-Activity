package _5observerPattern;

public class HonorRoll
{
    public static void main(String[] args)
    {
        Honor honor = new Honor(1.75);

        Student student1 = new Student("20-47398-036", "Althea Flores", 1.0);
        honor.includeStudent(student1);

        Student student2 = new Student("20-74623-753", "Nathan Cruz", 1.5);
        honor.includeStudent(student2);

        Student student3 = new Student("20-59485-439", "Patricia Medina", 1.75);
        honor.includeStudent(student3);

        Student student4 = new Student("20-64837-382", "Diether Roxas", 2.0);
        honor.includeStudent(student4);

        honor.notifyStudents();
    }
}