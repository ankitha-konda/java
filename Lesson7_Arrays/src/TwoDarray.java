
import java.util.Scanner;
public class TwoDarray {
   public static void main(String[] args)
   {
      int arr[][]=new int[3][3];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<arr.length;i++)
      {
         for(int j=0;j<arr[i].length;j++)
         {
            arr[i][j]=sc.nextInt();
         }
      }
      // printing using for each loops
      for(int[] i:arr)
      {
         for(int j:i)
         {
            System.out.print(j);
         }
         System.out.println();
      }
   }
}
