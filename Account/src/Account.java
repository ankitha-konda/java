//creating bank account using objects and classes
public class Account
{
   private String name;
   public Account()  //default constructor
   {
      name=null;        //default intialization of object to null
   }
   public Account(String name) //parameterized constructor
   {
      this.name=name;        // intializing name object
   }
   public void setName(String name)
   {
      this.name=name;
   }
   public String getName()
   {
      return name;
   }
   //if u do not create any constructor the compiler will create default constructor
   //if u create any parameterized constructor or any constructor the compiler will not create any defauly one ,so if our code reqiures default then we need to create it manually
}