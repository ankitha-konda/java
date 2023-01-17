public class Date1 {

      private int day;
      private int month;
      private int year;
      private int[] datespermonth={0,31,28,31,30,31,30,31,31,30,31,30,31};
      public Date1(int day,int month,int year)
      {
         if (month <= 0 || month > 12)
            throw new IllegalArgumentException("enter crct value");

         // check if day in range for month
         if (day <= 0 ||
                 (day > datespermonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("enter crct value");

         this.day=day;
         this.month=month;
         this.year=year;

         System.out.printf(
                 "Date object constructor for date %s%n", this);
      }

   // return a String of the form month/day/year
   public String toString()
   {
      return String.format("%d/%d/%d", month, day, year);
   }

}
