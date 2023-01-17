public class Main {
   public static void main(String[] args)
   {
      String s=new String("hello");
      String s2="welcome to java";
      //reverse a string
      for(int i=s.length()-1;i>=0;i--)
      {
         System.out.println(s.charAt(i));
      }
      char[] chararr=new char[5];
      //copy string into char array
      s.getChars(0,s.length(),chararr,0);
      System.out.println(s);
      System.out.println(s2);
      for(int i=0;i<chararr.length;i++)
      {
         System.out.println(chararr[i]);
      }
      //value of methods of String
      int a=4;
      char x='c';
      long  b=100000000000000l;
      double d=3.33;
      float f=1.09f;
      boolean e=true;
      Object obj="hello";

      System.out.println(String.valueOf(a));
      System.out.println(String.valueOf(x));
      System.out.println(String.valueOf(b));
      System.out.println(String.valueOf(d));
      System.out.println(String.valueOf(e));
      System.out.println(String.valueOf(obj));
      StringBuilder string=new StringBuilder("java");
      System.out.println(string.toString());


   }
}