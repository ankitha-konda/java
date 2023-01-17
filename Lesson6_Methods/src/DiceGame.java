import java.security.SecureRandom;
public class DiceGame {
      private static final SecureRandom random=new SecureRandom();
   public static void main(String[] args)
   {
      int point=0;
      String status;
      int sum =rollDice();
      switch(sum)
      {
         case 7:
         case 11:
            status="WIN";
            break;
         case 2:
         case 3:
         case 12:
            status="LOOSE";
            break;
         default:
            status="CONTINUE";
            point=sum;
            System.out.println(point);
            break;

      }
      while(status=="CONTINUE")
      {int mypoint=rollDice();
         if(mypoint==7)
         {  status="LOOSE";
            break;
         }
         if(mypoint==point)
         {
            status="WIN";
            break;
         }
      }
      if(status=="WIN")
         System.out.println("U WON!");
      else
         System.out.println("U LOST!");
   }
   public static int rollDice()
   {
      int dice1=1+random.nextInt(6);
      int dice2=1+random.nextInt(6);
      int sum=dice1+dice2;
      System.out.printf("%d + %d =%d%n",dice1,dice2,sum);
      return sum;
   }
}
