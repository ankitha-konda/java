public class BaseCommisionEmployee extends CommisionEmployee{
   private double basesalary;
  public BaseCommisionEmployee(String firstname, String lastname, String ssno, double grosssalary, double commisionrate, double basesalary)
  {
     super(firstname,lastname,ssno,grosssalary,commisionrate);
     if(basesalary<0.0)
     {
        throw new IllegalArgumentException("eneter cerct values");
     }
     this.basesalary=basesalary;
  }
  public double getBasesalary()
  {
     return basesalary;
  }
  public void setBasesalary()
  { if(basesalary<0.0)
  {
     throw new IllegalArgumentException("eneter cerct values");
  }
     this.basesalary=basesalary;
  }

  public double earning()
  {
    // return basesalary+grosssalary*commisionrate; here if we use protected variables
    // return basesalary+getGrosssales()*getCommisionrate();// as variablesa are private
     return basesalary+super.earning();
  }
  @Override
   public String toString()
  {
     //return String.format("Employee details :%nfirstname :%s%nlastname :%s%nssno :%s%ngrosssales :%.2f%ncommisionrate :%.2f%nbasesalary :%.2f%n",firstname,lastname,ssno,grosssales,commisionrate,basesalary);
     return String.format("Employee details :%nfirstname :%s%nlastname :%s%nssno :%s%ngrosssales :%.2f%ncommisionrate :%.2f%nbasesalary :%.2f%n",getFirstname(),getlastname(),getSsno(),getGrosssales(),getCommisionrate(),basesalary);
  }
}
