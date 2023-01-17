public class StackUnwinding {
   public static void main(String[] args) throws Exception{
      try
      {
         method1();
      }
      catch(Exception e)
      {
         System.out.println(e.getMessage());
         e.printStackTrace();
         StackTraceElement[] stckele=e.getStackTrace();
         for(StackTraceElement ele:stckele)
         {
            System.out.println(ele.getClassName());
            System.out.println(ele.getFileName());
            System.out.println(ele.getMethodName());
         }
      }
   }
   public static void  method1() throws Exception
   {
      method2();
   }
   public static void method2() throws Exception
   {
      method3();
   }
   public static void method3() throws Exception
   {
      throw new Exception("exception throwed");
   }
}
