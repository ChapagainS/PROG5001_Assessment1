
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
     String[] studentNames = new String[30];
     double[] studentMarks = new double[30];
     
     for (int i = 0; i<studentMarks.length; i++) {
         System.out.println("Enter the name of the Student " + (i+1)+ ":" );
         String name = (new Scanner(System.in)).nextLine();
         studentNames[i] = name;
        
         double mark = 0;
         
         while (mark >= 0 || mark <= 30){
         System.out.println("Enter the mark for " + name+ " (0 to 30) :");
         mark = (new Scanner(System.in)).nextDouble();
         
         if(mark >= 0 && mark <= 30){
             break;
        } else {
            System.out.println("Invalid Value! The marks must be bewteen 0 to 30.");
        }
    }
         studentMarks[i] = mark;
     }
     System.out.println(unitName + " - Student Marksheet");
    for (int i = 0; i < studentMarks.length; i++){
         
         System.out.println(studentNames[i] + "  " + studentMarks[i]);
        }
 }
}

