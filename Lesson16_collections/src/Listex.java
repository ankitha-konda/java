import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;

public class Listex {
   public static void main(String[] args) {
      List<String>  list1=new ArrayList<String>();
      String[]   addlist={"1","2","3","4","5"};
      //adding into list1
      for(String x:addlist)
      {
         list1.add(x);
      }
      List<String>  list2=new ArrayList<String>();
      String[]   removelist={"1","2","3"};
      //adding into list2
      for(String i:removelist)
      {
         list2.add(i);
      }
      //displaying ele
      System.out.println("before removing");
      for(int ele=0;ele<list1.size();ele++)
      {
         System.out.println(list1.get(ele));
      }
      //removing ele from list1
      remove(list1,list2);
      //displaying ele after removing
      System.out.println("after removing");
      for(int ele=0;ele<list1.size();ele++)
      {
         System.out.println(list1.get(ele));
      }

   }
   public static void remove(Collection<String> collection1,Collection<String> collection2)
   {
      Iterator<String> it=collection1.iterator();
      while(it.hasNext())
      {
         if(collection2.contains(it.next()))
         {
            it.remove();
         }
      }
   }

}
