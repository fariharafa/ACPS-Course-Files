
/**
 * The GradesV3 uses scanner methods  to allow users to input information 
 * about their grades from the keyboard.
 *
 * @author Fariha Rafa
 * @version 10/22/2018
 */
import java.util.Scanner;
public class GradesV3
{
    public static void main(String[ ] args)
    {
        Scanner in;
        in = new Scanner(System.in);
        
        int numTests = 0;      //counts number of tests
        int totalPoints = 0;   //total points for all tests 
        double average = 0.0; 

        System.out.print("What's your name (first and last)? ");
        String firstName = in.next();
        String lastName = in.nextLine();
        
     
        
        System.out.print("What's the subject? ");
        String subject = in.next();
        System.out.println("");
        
        System.out.print("What score did you get for test #1? ");
        int testGrade1 = in.nextInt();
        
        
        System.out.print("What score did you get for test #2? ");
        int testGrade2 = in.nextInt();
        
        
        System.out.print("What score did you get for test #3? ");
        int testGrade3 = in.nextInt();
        
        System.out.println("");
        System.out.println("_______________________________________________________________________");
        System.out.println(firstName +" "+ lastName + "'s Gradebook");
        System.out.println("");
        System.out.println("Subject: " + subject);
        
        numTests++;
        System.out.print("Test # " + numTests);
        System.out.print("   Test Grade: " + testGrade1);
        totalPoints = testGrade1 + totalPoints;
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("    Average Score: " + (double)(totalPoints)/numTests);
        
        numTests++;
        System.out.print("Test # " + numTests);
        System.out.print("   Test Grade: " + testGrade2);
        totalPoints = testGrade2 + totalPoints;
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("    Average Score: " + (double)(totalPoints)/numTests);
        
        numTests++;
        System.out.print("Test # " + numTests);
        System.out.print("   Test Grade: " + testGrade3);
        totalPoints = testGrade3 + totalPoints;
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("    Average Score: " + (double)(totalPoints)/numTests);
        System.out.println("_______________________________________________________________________");
        
    }//end of main method
}
