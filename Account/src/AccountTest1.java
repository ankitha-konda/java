public class AccountTest1 {
   public static void main(String[] args)
   {
        Account account1=new Account("Raju");//intializing object directly
      Account account2=new Account("Ravi");
      System.out.println("account holder 1:"+account1.getName());
      System.out.println("account holder 2:"+account2.getName());
// for different objects different chunks of memory is allocated so each account will have seperate name and methods
   }
}
