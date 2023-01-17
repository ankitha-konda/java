public class WeeklyEmployee extends Employee {
   private double weeklysalary;
   public WeeklyEmployee(String firstname,String lastname,String ssno,double weeklysalary)
   {
      super(firstname,lastname,ssno);
      if(weeklysalary<0.0)
      {
         throw new IllegalArgumentException("uncrct value entered");
      }
      this.weeklysalary=weeklysalary;
   }
   public void setWeeklysalary()
   {
      if(weeklysalary<0.0)
      {
         throw new IllegalArgumentException("uncrct value entered");
      }
      this.weeklysalary=weeklysalary;
   }
   public double getWeeklysalary()
   {
      return weeklysalary;
   }
   public double earning()
   {
      return weeklysalary;
   }
   public String toString()
   {
      return String.format("Weekly Employee details: %n%s%s%.2f%n",super.toString(),"weekly salary :",getWeeklysalary());
   }
}
