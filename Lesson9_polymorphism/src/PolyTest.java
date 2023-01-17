public class PolyTest {
   public static void main(String[] args) {
      CommisionEmployee e1=new CommisionEmployee("anu","rao","101",5000,0.02);
      BaseCommisionEmployee e2=new BaseCommisionEmployee("eve","fab","102",4000,0.04,2000);
      System.out.println("super class refrence with super class object");
      System.out.println(e1.toString());// calling toString() method in superclass
      System.out.println("sub class refrence with sub class object");
      System.out.println(e2.toString());//calling toString() method in subclass
      System.out.println("super class refrence with sub class object");
     CommisionEmployee e3=new BaseCommisionEmployee("eve","fab","102",4000,0.04,2000);
     System.out.println(e3.toString());//calling toString() method in subclass with superclass reference

   }
}
