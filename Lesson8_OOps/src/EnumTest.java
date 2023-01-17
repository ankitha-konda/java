
import java.util.EnumSet;
public class EnumTest {
   public static void main(String[] args)
   {
      System.out.println("student details");
      for(Student stud :Student.values())
      {
         System.out.printf("%10s%5d%5d%n",stud,stud.getRollno(),stud.getMarks());
      }
      for(Student stud :EnumSet.range(Student.RAJU,Student.RAMYA))
      {
         System.out.printf("%10s%5d%5d%n",stud,stud.getRollno(),stud.getMarks());
      }
   }
}
