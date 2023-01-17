public class GradeTest {
   public static void main(String[] args)
   {
      int grades[]={10,20,30,40,50,60,70,80,90,100};

      Grade obj=new Grade("cse",grades);
      System.out.println("cse");
     obj.showgrades();
     System.out.println("Minimum grade:"+obj.minimumgrade());
      System.out.println("Maximum grade:"+obj.maximumgrade());
      System.out.println("class average:"+obj.average());






   }
}
