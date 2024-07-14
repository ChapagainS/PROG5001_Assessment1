
/**
 * PROG5001_Fundamental of Programming_ Assessment 1
 *
 * @Subash Chapagain
 * @12th July, 2024
 */
import java.util.Scanner;

public class MarkSheet {
    
 public static void main(String[] args) {
     //Scanner scanner = new Scanner(System.in);
     System.out.println("Name of the Unit: ");
     String unitName = (new Scanner(System.in)).nextLine();
     String[] studentNames = new String[3];
     double[] studentMarks = new double[3];
     
     for (int i = 0; i<studentMarks.length; i++) {
         System.out.println("Enter the name of the Student " + (i+1)+ ":" );
         String name = (new Scanner(System.in)).nextLine();
         studentNames[i] = name;
        
         //System.out.println("Enter the mark for Student " + (i+1)+ ":");
         double mark = 0;
         
         while (mark > 0 || mark < 100){
         System.out.println("Enter the mark for " + name+ ":");
         mark = (new Scanner(System.in)).nextDouble();
         
         break;
        }
         
         if(mark < 0 || mark > 100){
             System.out.println("Invalid Value! The marks must be bewteen 0 to 100");
        }
        
         studentMarks[i] = mark;
     }
    
 }
}
