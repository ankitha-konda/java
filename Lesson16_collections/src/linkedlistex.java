import java.util.*;

public class linkedlistex {
   public static void main(String[] args) {
      List<String> list1=new LinkedList<String>();
      String[]   addlist={"one","2","3","four","five"};
      //adding into list1
      for(String x:addlist)
      {
         list1.add(x);
      }
      List<String>  list2=new LinkedList<String>();
      String[]   removelist={"1","2","3"};
      //adding into list2
      for(String i:removelist)
      {
         list2.add(i);
      }
      //addAll method
      list1.addAll(list2);
      list2=null;//making the list2 with no elements
     //printing list
      System.out.println("printing after addall method");
      printlist(list1);
      //convert to upper case
      uppercase(list1);
      System.out.println("printing in upprer case");
      printlist(list1);
      //removing ele
      remove(list1,3,5);
      System.out.println("printing after removing");
      printlist(list1);
      //reverse linkedlist
      System.out.println("printing after reversing");
      reverse(list1);



   }
   public static void printlist(List<String> list1)
   {
      for(String ele:list1)
      {
         System.out.println(ele);
      }
   }
   public static void uppercase(List<String> list1)
   {
     ListIterator <String> it=list1.listIterator();
     while(it.hasNext())
     { String ele=it.next();
        it.set(ele.toUpperCase());
     }
   }
   public static void remove(List<String> list1,int strt,int end)
   {
      list1.subList(strt,end).clear();
   }
   public static void reverse(List<String> list1)
   {
      ListIterator <String> it=list1.listIterator(list1.size());//to strt iterating from last index in linked list
      while(it.hasPrevious())
      {
         System.out.println(it.previous());
      }
   }


}
