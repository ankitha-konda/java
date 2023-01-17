public class HourlyEmployee extends Employee {
   private double hours;
   private double wages;
   public HourlyEmployee(String firstname,String lastname,String ssno,double hours,double wages)
   {
      super(firstname,lastname,ssno);
      if(wages<0.0)
      {
         throw new IllegalArgumentException("uncrct value entered");
      }
      if(hours<0.0|| hours>168)
      {
         throw new IllegalArgumentException("uncrct value entered");
      }
      this.wages=wages;
      this.hours=hours;
   }
   public double getWages()
   {
      return wages;
   }
   public double getHours()
   {
      return hours;
   }
   public double earning()
   { double w=0;
      if(hours<40)
      {
          w=getWages()*getHours();
      }
      else if(hours>40)
      {
          w= 40*wages+(hours-40)*wages*1.5;
      }
      return w;
   }
   public String toString()
   {
      return String.format("Hourly Employee details: %n%s%s%.2f%n%s%.2f%n",super.toString(),"wages :",getWages(),"hours :",getHours());

   }
}
