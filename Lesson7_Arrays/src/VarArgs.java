public class VarArgs {
   public static void main(String[] args)
   {
      System.out.println(average(1,2));
      System.out.println(average(1,2,3));
      System.out.println(average(1,2,3,4));
   }
   // if you want to pass different number of elements of same datatype using same method we can use var arguments
   // all the arguments that are passed are stored in the form of array
   public static int average(int ...array)
   {   int total=0;
      for(int i:array)
         total+=i;
      return total/array.length;
   }
}
