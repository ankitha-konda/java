public class MainAccount {
   private String name;
   private double balance;

   public MainAccount(String name,double balance) //parameterized constructor
   {
      this.name=name;
      if(balance>0.0) {
         this.balance = balance;// intializing name object
      }
   }
   public void deposit(double depositAmount)
   {
      if(depositAmount>0.0)
      {
         balance=balance+depositAmount;
      }
   }
   public double getBalance()
   {
      return balance;
   }
   public double withDraw(double withdrawAmount)
   {
      if(withdrawAmount<balance)
      {
         balance-=withdrawAmount;
      }
      return balance;
   }

   public void setName(String name)
   {
      this.name=name;
   }
   public String getName()
   {
      return name;
   }
}
