public class MethodOverloading {
   public static void main(String[] args)
   {
      System.out.println(square(1));
      System.out.println(square(6.7));

   }
   public static int square(int x)
   {
      return x*x;
   }
   public static double square(double x)
   {
      return x*x;
   }
}
