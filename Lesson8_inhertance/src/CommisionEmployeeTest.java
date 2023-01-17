public class CommisionEmployeeTest {
   public static void main(String[] args)
   {
      CommisionEmployee e=new CommisionEmployee("raju","rao","123",0.6,0.1);
      CommisionEmployee e1=new CommisionEmployee("ravi","reddy","124",0.67,0.1);
      System.out.println("before modification: "+e+"earning :"+e.earning());
      e.setCommisionrate(0.7);
      e.setGrosssales(500);
      System.out.println("after modification: "+e+"earning :"+e.earning());

   }
}
