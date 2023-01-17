import java.util.InputMismatchException;
import java.util.Scanner;
public class Example1 {
  public  static int divide(int num1,int num2)
  {
     return num1/num2;
  }
   public static void main(String[] args) {

      boolean x = true;
      do {
         Scanner sc = new Scanner(System.in);
         try {


            System.out.println("enter no 1:");
            int num1 = sc.nextInt();
            System.out.println("enter no 2:");
            int num2 = sc.nextInt();
            int res = divide(num1, num2);
            System.out.println("res : " + res);
            x = false;//program cmpleted successfully
         } catch (InputMismatchException e1) {
            System.err.println(e1);
            sc.nextLine();
            System.out.println("renter the input");
         } catch (ArithmeticException e1) {
            System.err.println(e1);
            sc.nextLine();
            System.out.println("enter the crct int value");
         }
      } while (x);
   }

}
