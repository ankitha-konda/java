public class ChainedException {
   public static void main(String[] args) {
      try{
         method1();// exception thrown by method 1
      }
      catch(Exception e)// caught the exception of method 1
      {
         e.printStackTrace();
      }
   }
   public static void method1() throws Exception
   {
      try{
         method2();// exception thrown by method 2
      }catch(Exception e){// caught the exception of method 2
         throw new Exception("----",e); // new exception is thrown along with exception that is thrown in method 2,cntrl reaches to line 4
      }
   }
   public static void method2() throws Exception
   {
      try{
         method3();  // exception thrown by method 3
      }catch(Exception e){// caught the exception of method 3
         throw new Exception("----",e); // new exception is thrown along with exception that is thrown in method 3 ,cmtrl reaches to line 14
      }
   }
   public static void method3() throws Exception
   {
      throw new Exception("new exception");     // exception e in method 3 is thrown ,cntrl reachees to line 22
   }
}
