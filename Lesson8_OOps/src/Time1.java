public class Time1 {
   private  int hour;//0-23
   private  int minute;//0-59

   private  int second;//0-59

   public  void setTime(int hour, int minute, int second)
   {
      //for validation we are using throw keyword to throw the exception
      if(hour<0 || hour>=24|| minute<0||minute>=59 ||second<0 ||second>=59)
      {
         throw new IllegalArgumentException("re type the time ");
      }
      this.hour=hour;
      this.minute=minute;
      this.second=second;
   }
   public String toTwentyFourHourTime()//HH:MM:SS
   {
      return String.format("%02d:%02d:%02d",hour,minute,second);
   }
   public  String toTwelveHourTime() //HH:MM:SS AM
   {
      return String.format("%02d:%02d:%02d %s",(hour==0||hour==12)?12:hour%12,minute,second,(hour<12)?"am":"pm");
   }



}
