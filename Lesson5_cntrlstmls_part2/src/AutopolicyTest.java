public class AutopolicyTest {
   public static void main(String[] args)
   {
      Autopolicy policy1=new Autopolicy(1,"x","NY");
      Autopolicy policy2=new Autopolicy(2,"y","canada");
      checkFault(policy1);
      checkFault(policy2);

   }
   public static void checkFault(Autopolicy policy)
   {
      System.out.printf("%d  %s  %s is : %s%n",policy.getAcntno(),policy.getModel(),policy.getState(),(policy.isNoFault()?"no fault":"is not no fault"));

   }
}
