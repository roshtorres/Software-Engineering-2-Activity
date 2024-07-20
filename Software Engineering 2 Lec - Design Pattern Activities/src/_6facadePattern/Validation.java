package _6facadePattern;

public class Validation
{
    private PaymentStatus paymentStatus;
    private ViolationChecking violationChecking;
    private FailingCoursesDetection failingCoursesDetection;

    public Validation(PaymentStatus paymentStatus, ViolationChecking violationChecking, FailingCoursesDetection failingCoursesDetection)
    {
        this.paymentStatus = paymentStatus;
        this.violationChecking = violationChecking;
        this.failingCoursesDetection = failingCoursesDetection;
    }

    public void enrollStudent(String studentNumber, String studentName, String program)
    {
        System.out.println("Student Name : " + studentName +
                           "\nStudent Number: " + studentNumber +
                           "\nProgram: " + program + "\n");

        if (!paymentStatus.checkPaymentStatus())
        {
            System.out.println("You have a balance. Balance: ₱" + paymentStatus.getBalance());
        }

        if (violationChecking.withViolaton())
        {
            System.out.println("Proceed to the Discipline office.");
        }

        if (failingCoursesDetection.talkToDean())
        {
            System.out.println("Proceed to the Dean's office.");
        }

        System.out.println("-----------------------------------");

    }
}
