import java.security.SecureRandom;
public class DiceRoll {
   public static void main(String[] args)
   {
      SecureRandom num=new SecureRandom();
      int freq[]=new int[7];
      int c=0;
      for(int i=1;i<=30;i++)
      {
         freq[1+num.nextInt(6)]++;
      }
      for(int i=0;i<freq.length;i++)
         {System.out.println(i+""+freq[i]);}
   }
}
