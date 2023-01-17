public class BaseCommisionTest {
   public static void main(String[] args)
   {
      BaseCommisionEmployee e=new BaseCommisionEmployee("raju","rao","123",0.6,0.1,2000);
      BaseCommisionEmployee e1=new BaseCommisionEmployee("ravi","reddy","124",0.67,0.1,3000);
      System.out.println("before modification: "+e+"earning :"+e.earning());
      e.setCommisionrate(0.7);
      e.setGrosssales(500);
      System.out.println("after modification: "+e+"earning :"+e.earning());

   }
}
