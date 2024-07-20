package _6facadePattern;

public class EnrollmentAssist
{
        public static void main(String[] args)
        {
            // Create subsystem objects
            PaymentStatus paymentStatus1 = new PaymentStatus(0.0);
            ViolationChecking violationChecking1 = new ViolationChecking(true);
            FailingCoursesDetection failingCoursesDetection1 = new FailingCoursesDetection(false);

            PaymentStatus paymentStatus2 = new PaymentStatus(13500.0);
            ViolationChecking violationChecking2 = new ViolationChecking(true);
            FailingCoursesDetection failingCoursesDetection2 = new FailingCoursesDetection(true);

            PaymentStatus paymentStatus3 = new PaymentStatus(0.0);
            ViolationChecking violationChecking3 = new ViolationChecking(false);
            FailingCoursesDetection failingCoursesDetection3 = new FailingCoursesDetection(true);

            // Create facade object
            Validation validation1 = new Validation(paymentStatus1, violationChecking1, failingCoursesDetection1);
            Validation validation2 = new Validation(paymentStatus2, violationChecking2, failingCoursesDetection2);
            Validation validation3 = new Validation(paymentStatus3, violationChecking3, failingCoursesDetection3);

            // Enroll students
            validation1.enrollStudent("20-47398-036", "Vanessa Ramirez", "BSCS");
            validation2.enrollStudent("20-54755-084", "Gabriel Dizon", "BSIT");
            validation3.enrollStudent("20-69543-928", "Andy Fernandez", "BSEMC");
        }
}
