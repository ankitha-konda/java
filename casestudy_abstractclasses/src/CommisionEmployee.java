public class CommisionEmployee extends Employee {
   private double grosssales;
   //protected double grosssales;
   private double commisionrate;
   //protected double commisionrate;

   public CommisionEmployee(String firstname, String lastname, String ssno, double grosssales, double commisionrate) {
    super(firstname,lastname,ssno);
      if (grosssales < 0.0) {
         throw new IllegalArgumentException("enter crct value");
      }
      if (commisionrate < 0.0 || commisionrate > 1.0) {
         throw new IllegalArgumentException("enter crct value");
      }

      this.grosssales = grosssales;
      this.commisionrate = commisionrate;

   }


   public void setGrosssales(double grosssales) {
      if (grosssales <= 0.0) {
         throw new IllegalArgumentException("enter crct value");
      }
      this.grosssales = grosssales;

   }
   public double getGrosssales()
   {
      return grosssales;
   }
   public double getCommisionrate()
   {
      return commisionrate;
   }
   public void setCommisionrate(double commisionrate) {
      if (commisionrate <= 0.0 || commisionrate >= 1.0) {
         throw new IllegalArgumentException("enter crct value");
      }
      this.commisionrate = commisionrate;

   }

   public double earning() {
      return grosssales * commisionrate;
   }
   @Override
   public String toString()
   {
      return String.format(" commision Employee details :%n%s%ngrosssales :%.2f%ncommisionrate :%.2f%n",super.toString(),grosssales,commisionrate);
   }

}
