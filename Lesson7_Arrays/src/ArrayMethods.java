import java.util.Arrays;
public class ArrayMethods {
   public static void main(String[] args)
   {//sort method
      double[] arr1={1.2,3.44,4.5,6.7,5.0};
      Arrays.sort(arr1);
      display(arr1);
      //fill method
      int[] arr2=new int[5];
      Arrays.fill(arr2,3);
      display(arr2);
      // arraycopy method
      int[] arr3={1,2,3,4,5};
      int[] copyarr=new int[5];
      System.arraycopy(arr3,0,copyarr,0,arr3.length);
      display(copyarr);
      //equals method
      boolean res=Arrays.equals(arr3,copyarr);
      System.out.println(res);
      //binarysearch method

      int location=Arrays.binarySearch(arr3,5);
      System.out.println(location);
      int location1=Arrays.binarySearch(arr3,100);
      System.out.println(location1);


   }
   public static void display(int[] arr)
   {
      for(int i:arr)
         System.out.print(i+" ");
      System.out.println();
   }
   public static void display(double[] arr)
   {
      for(double i:arr)
         System.out.print(i+" ");
      System.out.println();
   }
}
