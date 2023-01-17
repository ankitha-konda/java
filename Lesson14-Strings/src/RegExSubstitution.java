public class RegExSubstitution {
   public static void main(String[] args) {
      String name="this 211223 ***** ,$  dxz";
      String num="1, 2, 3, 4, 5, 6, 7";
 //     name.replaceAll("//d","d");
  //    System.out.println(name);   here no change occurs becuase strings can not be manipulated so we use string buildeer
      name=name.replaceAll("\\d","x");
      System.out.println(name);
      name=name.replaceAll("\\*","^");
      System.out.println(name);
      name=name.replaceFirst("\\w","word");
      System.out.println(name);
      String[] s=num.split("\\,\\s");
      for(int i=0;i<s.length;i++)
      {
         System.out.println((s[i]));
      }
   }
}
