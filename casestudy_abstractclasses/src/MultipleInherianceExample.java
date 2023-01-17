interface firstinterface{
   default void show()
   {
      System.out.println("firstinterface show method");
   }
}
interface secondinterface{
   default void show1()
   {
      System.out.println("secondinterface show method");
   }
}

public class MultipleInherianceExample implements firstinterface,secondinterface {
  public void fisrtshow()
  {
     firstinterface.super.show();
  }
  public void secondshow()
  {
     secondinterface.super.show1();
  }
   public static void main(String[] args) {
      MultipleInherianceExample obj =new MultipleInherianceExample();
      obj.show();
   }
}
