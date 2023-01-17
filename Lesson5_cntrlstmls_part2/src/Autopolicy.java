public class Autopolicy {
   private int  acntno;
   private String model;
   private String state;
   public Autopolicy(int acntno,String model,String state)
   {
      this.acntno=acntno;
      this.model=model;
      this.state=state;
   }
   public void setAcntno(int acntno)
   {
      this.acntno=acntno;
   }
   public void setModel(String model)
   {
      this.model=model;
   }
   public void setState(String state)
   {
      this.state=state;
   }
   public int getAcntno()
   {
      return acntno;
   }
   public String getModel()
   {
      return model;
   }
   public String  getState()
   {
      return state;
   }
   public boolean isNoFault()
   { boolean value;
      switch(getState())
      {
         case "NY" : case "Mi" : case "cd":
            value=true;
            break;
         default: value=false;
         break;

      }
      return value;
   }
}
