public class RethrowException {
   public static void main(String[] args)  {
      try{
         throwException();
      }
      catch(Exception e)
      {
         System.out.println("exception handled at main");
      }
      notthrowException();
   }
   public static void throwException() throws Exception // we need to throws Exception  because in line 16 we throwed a new Exception taht is not known
   {
      try{
         System.out.println("in throwException method");
         throw new Exception();
      }
      catch(Exception e){
      System.out.println("exception handled in method throw exception");
      throw e; // rethorowing the exception to main
        }
      finally{//finally block executes if an exception occurs or not
         System.out.println("finally ");
     }}
      public static void notthrowException() {
      try
      {
         System.out.println("no exception");
      }
      catch(Exception e)
      {
         System.out.println("oooooo");
      }
      finally
      {
         System.out.println("finalllly");
      }
   }
}
