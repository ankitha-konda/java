
import java.util.Scanner;
public class AccountTest {
   public static void main(String[] args){
   Scanner input=new Scanner(System.in);
   Account account1=new Account();//creating the account object to access account class
   System.out.println(account1.getName());
   System.out.println("enter name:");
   String myname=input.nextLine();
account1.setName(myname);// setting name
   System.out.println("the name is:"+account1.getName());
}

}
