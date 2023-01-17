import java.security.SecureRandom;
public class Securerandom {
   public static void main(String[] args)
   {
      SecureRandom random=new SecureRandom();
      for(int c=1;c<=6;c++)
      {
         int num=1+random.nextInt(6);
         System.out.println(num);

      }
   }

}
