import java.util.ArrayList;
public class ArrayList1 {
   public static void main(String[] args)
   {
      ArrayList<String> list=new ArrayList<String>();
      list.add("b");
      list.add("c");
      list.add("a");
      //displaying method
      display(list);
      //add and remove methods
      list.add("b");
      display(list);
      list.remove("b");
      display(list);
      //contains method
      if(list.contains("a"))
         System.out.println("yes");
      else
         System.out.println("no");




   }
   public static void display(ArrayList list)
   {
      for(int i=0;i<list.size();i++)
         System.out.print(list.get(i)+" ");
      System.out.println();
   }
}
