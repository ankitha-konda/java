import javax.swing.JOptionPane;
public class Addition {
   public static void main(String[] args) {
     String num1=JOptionPane.showInputDialog("Enter num1");
     String num2=JOptionPane.showInputDialog("Enter num2");
     int n1=Integer.parseInt(num1);
     int n2=Integer.parseInt(num1);
     int sum=n1+n2;
     JOptionPane.showInputDialog(null,"the sum is "+sum,"sum of two integers",JOptionPane.PLAIN_MESSAGE);



   }
}
