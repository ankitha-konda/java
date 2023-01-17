public class StudentTest {
   public static void main(String[] args)
   {

      Student student1=new Student("raju",76.0);
      Student student2=new Student("ravi",35);
      System.out.printf("%s got grade :%s%n",student1.getName(),student1.getGrade());
      System.out.printf("%s got grade :%s%n",student2.getName(),student2.getGrade());
   }

}
