import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Test extends JFrame {
       public static String lastname; // Patient’s last name 
       public static int age; // Patient’s age on admission 
       public static boolean sex; // Indicates if patient is male or female 
   public Test() {
      Border border = new TitledBorder("My button");
      JButton jbt1 = new JButton("OK");
      JButton jbt2 = new JButton("Cancel");
//      jbt1.setBorder(border);
      jbt2.setBorder(border);
      getContentPane().add(jbt1, BorderLayout.NORTH);
      getContentPane().add(jbt2, BorderLayout.SOUTH);
   }

   public static void main(String[] args) {

    int N = 1; 
    while (N <= 32) { 
        N = 2 * N; 
        System.out.print(N+", ");
   }
}