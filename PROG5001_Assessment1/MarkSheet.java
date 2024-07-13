
/**
 * PROG5001_Fundamental of Programming_ Assessment 1
 *
 * @Subash Chapagain
 * @12th July, 2024
 */
import java.util.Scanner;

public class MarkSheet {
    
 public static void main(String[] args) {
     System.out.println("Name of the Unit: ");
     String unitName = (new Scanner(System.in)).nextLine();
     double[] studentMarks = new double[30];
     for (int i=0; i<studentMarks.length; i++) {
         System.out.println("Enter the mark for Student" + (i+1)+ ":");
         double mark = (new Scanner(System.in)).nextDouble();
         studentMarks[i] = mark;
     }
    
 }
}
