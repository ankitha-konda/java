public class PaymentrollTest {
   public static void main(String[] args) {
        // all the employee classes executing individually by creating objects of those classes
      WeeklyEmployee e1=new WeeklyEmployee("eve","fab","101",2000);
      HourlyEmployee e2=new HourlyEmployee("devi","vishwakumar","102",25,2000);
      CommisionEmployee e3=new CommisionEmployee("Darren","paxton","103",3000,0.03);
      BaseCommisionEmployee e4=new BaseCommisionEmployee("fab","eila","104",3000,0.09,2000);
      System.out.printf("%sWeekly Employee earning : %.2f%n%n",e1,e1.earning());
      System.out.printf("%sHourly earning : %.2f%n%n",e2,e2.earning());
      System.out.printf("%sCommision earning : %.2f%n%n",e3,e3.earning());
      System.out.printf("%sBaseCommision earning : %.2f%n%n",e4,e4.earning());
      System.out.printf("%n%n%n");
      // all the employee classes executing  with polymorphism by creating an array of superclass and storing all the subclasses in it
      Employee[] employee=new Employee[4];  // here Employee is type of super class and employee is name of array
      employee[0]=e1;
      employee[1]=e2;
      employee[2]=e3;
      employee[3]=e4;
      for(Employee currentEmployee:employee)
      {
         System.out.println(currentEmployee);
         //we can also modifyor change any methods using instance of
         if(currentEmployee instanceof BaseCommisionEmployee)
         {
            BaseCommisionEmployee  e5=(BaseCommisionEmployee)currentEmployee;
            e5.setBasesalary(1.15 * e5.getBasesalary());
            System.out.println("Base salary :"+e5.getBasesalary());
         }
         System.out.println("earnings :"+currentEmployee.earning());
      }
      // for knowing class names some methoda are used
      System.out.println();

      for(int j=0;j<employee.length;j++)
      {
         System.out.println(employee[j].getClass().getName());
      }
   }
   
}
