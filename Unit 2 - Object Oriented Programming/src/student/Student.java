package student;

public class Student
{
    // data fields
    private int studNumber; // primary key
    private String name; // firstname lastname
    private int grade;
    private String status; // Full time or Part time

    public Student ()  // default constructor
    {
        this.studNumber = 00000;
        this.name = "";
        this.grade = 9;
        this.status = "Full time";

    }


    // constructor #2
    public Student (int studNumber, String name, int grade, String status)
    {
        this.studNumber = studNumber;
        this.name = name;
        this.grade = grade;
        this.status = status;
    }


    // Accessors
    public int getStudNumber ()
    {
        return this.studNumber;
    }


    public String getName ()
    {
        return this.name;
    }


    public int getGrade ()
    {
        // you fill this in
        return this.grade;
    }


    public String getStatus ()
    {
        // you fill this in
        return this.status;
    }


    // Mutators
    public void setStudNumber (int studNumber)
    {
        this.studNumber = studNumber;
    }


    public void setName (String name)
    {
        this.name = name;
    }


    public void setGrade (int grade)
    {
        // you fill this in
        this.grade = grade;
    }


    public void setStatus (String status)
    {
        // you fill this in
        this.status = status;
    }


    // Behaviour methods
    public void switchStatus ()
    {
        if (this.status.equals ("Full time"))
        {
            this.status = "Part time";
        }
        else if (this.status.equals ("Part time"))
        {
            this.status = "Full time";
        }
    }
    public double feeCalc () // polymorphism (same name as parent class method)
    {

        return 45;
    }


    // toString()
    public String toString ()
    {
        String data1 = "Student number: " + this.studNumber + "\n";
        String data2 = "Name: " + this.name + "\n";
        String data3 = "Is in grade: " + this.grade + "\n";
        String data4 = "Status: " + this.status + "\n";

        return data1 + data2 + data3 + data4;

    }
}
