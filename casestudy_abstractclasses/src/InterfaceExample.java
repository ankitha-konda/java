interface Emp{
    double getPayment(); //abstract method by default

}
 class Emp1 implements Emp{
  public  double getPayment() //implementation of that abstract method
   {
      return 100.0;
   }
}
public class InterfaceExample  {

   public static void main(String[] args) {
      Emp1 obj =new Emp1();
     System.out.println("payment :"+obj.getPayment());
   }
}
