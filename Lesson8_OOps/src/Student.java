//enum type is mainly used in the case of constant set values that cannot be changed and stored in enum type
public enum Student {
   RAJU(1,100),
   RAMYA(2,80),
   RAVI(3,90);
   private final int rollno;
   private final int marks;
   Student(int rollno,int marks)
   {
    this.rollno=rollno;
    this.marks=marks;
   }
   public int getRollno(){
      return rollno;}
   public int getMarks()
        {
      return marks;
   }
}
