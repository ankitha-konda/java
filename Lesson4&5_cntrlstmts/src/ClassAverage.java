import java.util.Scanner;
public class ClassAverage {
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      int total=0;
      int count=0;
      while(count<=10)
      {
         System.out.println("enter grade");
         int grade=input.nextInt();
         total+=grade;
         count++;
      }
      int average=total/10;
      System.out.printf("the total is %d",total);
      System.out.printf("the average is %d",average);

   }
}
