
/**
 * PROG5001_Fundamental of Programming_ Assessment 1
 *
 * @Subash Chapagain
 * @12th July, 2024
 */
import java.util.Scanner;

public class MarkSheet {
    
 public static void main(String[] args) {
     
     System.out.println("Name of the Assignment: ");
     String assignmentName = (new Scanner(System.in)).nextLine();
     String[] studentNames = new String[3];
     double[] studentMarks = new double[3];
     
     double highMarks = Double.MIN_VALUE;
     double lowMarks = Double.MAX_VALUE;
     double total = 0;
     
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
         if(mark > highMarks){
             highMarks = mark;
         }
         if(mark < lowMarks){
             lowMarks = mark;
         }
             total += mark;
        }
          double mean = total/studentMarks.length;  
          
          double sumSquareDiff = 0;
          for (double mark: studentMarks) {
              sumSquareDiff += Math.pow(mark - mean, 2);
            }
        double standardDeviation = Math.sqrt(sumSquareDiff / studentMarks.length);
        
         System.out.println(assignmentName + " --- Student Marksheet");
    for (int i = 0; i < studentMarks.length; i++){
         
         System.out.println(studentNames[i] + "  " + studentMarks[i]);
        }
        System.out.println("The highest mark obtained is : " +highMarks);
        System.out.println("The lowest score obtained is : " +lowMarks);
        System.out.println("The mean score obtained is: " +mean);
        System.out.println("The standard deviation is: " +standardDeviation);
 }
}

