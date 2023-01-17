import java.util.Scanner;
public class Maximum {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter a b c");
     double a=sc.nextDouble();
      double b=sc.nextDouble();
      double c=sc.nextDouble();
     double result=Maximum.findMax(a,b,c);
     System.out.println("maximum is"+result);

   }
   public static double findMax(double a,double b,double c)
   {
     double res=Math.max(a,Math.max(b,c));
     return res;

   }
}