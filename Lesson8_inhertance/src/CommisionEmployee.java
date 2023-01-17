public class CommisionEmployee {
   private String firstname;
   //protected String firstname;     so we can access this variables directly in subclasses
   private String lastname;
   //protected String lastname;
   private String ssno;
   //protected String ssno;
   private double grosssales;
   //protected double grosssales;
   private double commisionrate;
   //protected double commisionrate;

   public CommisionEmployee(String firstname, String lastname, String ssno, double grosssales, double commisionrate) {
      if (grosssales < 0.0) {
         throw new IllegalArgumentException("enter crct value");
      }
      if (commisionrate < 0.0 || commisionrate > 1.0) {
         throw new IllegalArgumentException("enter crct value");
      }
      this.firstname = firstname;
      this.lastname = lastname;
      this.ssno = ssno;
      this.grosssales = grosssales;
      this.commisionrate = commisionrate;

   }

   public String getFirstname() {
      return firstname;
   }

   public String getlastname() {
      return lastname;
   }

   public String getSsno() {
      return ssno;
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
      return String.format("Employee details :%nfirstname :%s%nlastname :%s%nssno :%s%ngrosssales :%.2f%ncommisionrate :%.2f%n",firstname,lastname,ssno,grosssales,commisionrate);
   }

}
