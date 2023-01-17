public class CompoundIntrest {
   public static void main(String[] args)
   {
      int p=1000;
      double r=0.05;
      double value=1+r;
      for(int i=0;i<9;i++) {
         value *= (1 + r);
      }
      double amount=p*value;
      System.out.println("amount:"+amount);

   }
}
