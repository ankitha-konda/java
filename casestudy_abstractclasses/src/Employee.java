public abstract class Employee {
  private final String firstname;
  private final String lastname;
  private final String ssno;  // these three variablees cannot be changed so they are declared final
   public Employee(String firstname,String lastname,String ssno)
   {
      this.firstname=firstname;
      this.lastname=lastname;
      this.ssno=ssno;
   }
   public String getFirstname()
   {
      return firstname;
   }
   public String getLastname()
   {
      return lastname;
   }

   public String getSsno()
   {
      return ssno;
   }
   public String toString()
   {
      return String.format("Employee details :%nFirstname :%s%nLastname :%s%nSSN :%s%n",getFirstname(),getLastname(),getSsno());
   }
   public abstract double earning();

}
