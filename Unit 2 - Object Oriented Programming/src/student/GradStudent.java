package student;

public class GradStudent extends Student
{
    private String gownSz;

    //constructors
    public GradStudent ()
    {
        super(); // this calls on the constructor from the parent class
        // with no arguments
        super.setGrade(12);
        this.gownSz = "L";

    }


    public GradStudent (int sn, String name, String status, String gownSz)
    {
        super(sn, name, 12, status);// this calls on the constructor from the parent class
        // with four arguments ** in this order **
        this.gownSz = gownSz;

    }


    //accessors
    public String getGownSz ()
    {
        return this.gownSz;

    }




    //mutators
    public void setGownSz (String gownSz)
    {
        this.gownSz = gownSz;
    }



    //behaviour

    public double feeCalc () // polymorphism (same name as parent class method)
    {

        double g = 50;
        return super.feeCalc() + g;
    }


    public String toString()
    {
        String data;
        data = "Gown Size: " + this.gownSz + "\n";
        return super.toString() + data;


    }
}
