
public class Employee {
   private String name;
   private int eno;
   private Date1 birthdate;
   private Date1 hiredate;
   public Employee(String name,int eno,Date1 birthdate,Date1 hiredate){
      this.name=name;
      this.birthdate=birthdate;
      this.eno=eno;
      this.hiredate=hiredate;
      System.out.printf("employee details:%s %d %s %s",name,eno,birthdate,hiredate);
   }
   public static void main(String[] args)
   {
      Date1 d1=new Date1(2,11,1952);
      Date1 d2=new Date1(3,12,1923);
      Employee e=new Employee("raju",100,d1,d2);
   }


}
