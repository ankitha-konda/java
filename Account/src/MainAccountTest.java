import java.util.Scanner;
public class MainAccountTest {
   public static void main(String[] args)
   {
      MainAccount account1=new MainAccount("raju",50.0);
      MainAccount account2=new MainAccount("ravi",-70);
      // showing initial balances and names of account1 and 2
      System.out.printf("%s balance is %.2f%n",account1.getName(),account1.getBalance());
      System.out.printf("%s balance is %.2f%n",account2.getName(),account2.getBalance());

      Scanner input =new Scanner(System.in);

      //adding deposit amount to account1
      System.out.println("enter amount to account 1:");
      double depositAmount=input.nextDouble();
      account1.deposit(depositAmount);

      // displaying balance after depositing amount
      System.out.printf("%s balance is %.2f%n",account1.getName(),account1.getBalance());
      System.out.printf("%s balance is %.2f%n",account2.getName(),account2.getBalance());

      //adding deposit amount to account2
      System.out.println("enter amount to account 2:");
      depositAmount=input.nextDouble();
      account2.deposit(depositAmount);


      // displaying balance after depositing amount
      System.out.printf("%s balance is %.2f%n",account1.getName(),account1.getBalance());
      System.out.printf("%s balance is %.2f%n",account2.getName(),account2.getBalance());






   }
}
