public class Time1Test {
   public static void main(String[] args)
   {
      Time1 time=new Time1();
      time.setTime(23,35,56);
      System.out.println(time.toTwentyFourHourTime());
      System.out.println(time.toTwelveHourTime() );
      try{
         time.setTime(123,35,56);
      }
      catch(IllegalArgumentException e)
      {
         System.out.println(e.getMessage());
      }

   }
}
