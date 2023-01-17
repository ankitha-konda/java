import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
   public static void main(String[] args)  {
      File obj=new File("sample.txt");// creating file obj

      try {
         obj.createNewFile();// creating new file
      } catch (IOException e) {
         System.out.println("io exception occured");
      }
      try {
         FileWriter file = new FileWriter("sample.txt");//writing into file
         file.write("heloo welcome\n hi");
         file.close();
      }
      catch(IOException e)
      {
         e.printStackTrace();
      }
      Scanner sc=new Scanner(System.in);
      while(sc.hasNext())
      {
         System.out.println(sc.nextLine()); // reading file contents
      }
      sc.close();
      obj.delete();//deleteing file




   }
}
