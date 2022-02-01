package newemp;

 public class WageCalcu
	  {
     String employeeName;
     int hours;
     double rate, pay;

    public void setEmployeeName ( String name )
    {
        employeeName = name;
    }
    public String getEmployeeName()
    {
        return employeeName;
    }
    public double calculatePay( int hours, double rate )
    {
         pay = hours * rate;

        return pay;
    }
    public void displayEmployee()
    {
        System.out.printf( "Employee's name: %s", getEmployeeName() );
        System.out.printf( "\nGross Salary: " + pay );
    }
}


