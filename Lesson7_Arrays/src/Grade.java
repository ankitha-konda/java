public class Grade {
   private String course;
   private int[] grades;
   public  Grade(String course,int[] grades)
   {
      this.course=course;
      this.grades=grades;
   }
   public void setCourse(){
      this.course=course;
   }
   public String getCourse()
   {
      return course;
   }
   public void showgrades()
   {
      for(int i=0;i<grades.length;i++)
      {
         System.out.println("student"+(i+1)+"-"+grades[i]);
      }
   }
   public int minimumgrade()
   {
      int mini=grades[0];
      for(int i:grades)
      {
         if(i<mini)
            mini=i;
      }
      return mini;
   }
   public int maximumgrade()
   {
      int mini=grades[0];
      for(int i:grades)
      {
         if(i>mini)
            mini=i;
      }
      return mini;
   }
   public double average()
   {
      int total=0;
      for(int i:grades)
      {
         total+=i;
      }
      double avg=(double)total/grades.length;
      return avg;
   }

}
