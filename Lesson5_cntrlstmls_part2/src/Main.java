public class Main {
   public static void main(String[] args) {
      double principal=1000.0;
      double rate=0.05;
      double amount;
      System.out.printf("%s%20s%n","year","Amount");
      for(int year=1;year<=10;year++)
      {
         amount=principal*Math.pow(1+rate,year);
         System.out.printf("%4d%,20.2f%n",year,amount);
      }



   }

}