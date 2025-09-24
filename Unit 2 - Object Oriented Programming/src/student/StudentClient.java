package student;

// The "StudentsClient" class.
public class StudentClient
{
    public static void main (String[] args)
    {
        // Place your code here
        Student stud1 = new Student ();
        System.out.println (stud1);
        stud1.setGrade (11);
        System.out.println (stud1);

        Student stud2 = new Student (123458800, "James Bakes", 10, "Full time");
        System.out.println (stud2);
        System.out.println (stud2.feeCalc ());

        GradStudent stud3 = new GradStudent (12787890, "Mary Smith", "S", "Full time");
        System.out.println (stud3);
        stud3.setGownSz ("M");
        System.out.println (stud3);
        System.out.println (stud3.feeCalc ());

    } // main method
} // StudentsClient class

