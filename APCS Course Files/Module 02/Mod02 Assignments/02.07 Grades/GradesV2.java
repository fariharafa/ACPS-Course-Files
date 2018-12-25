/**
 * The purpose of this program is to calculate the total points and average 
 * grade each time a new score is added to the total.
 * 
 * @author Fariha Rafa 
 * @version 10/07/18
 */
public class GradesV2
{
    public static void main(String[ ] args)
    {
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests 
        double average = 0.0;  //average grade
    
        testGrade = 95;
        numTests++;
        totalPoints += testGrade;
        System.out.print("Test # " + numTests);
        System.out.print("   Test Grades: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("    Average Score: " + (double)(totalPoints)/numTests);       
        
        testGrade = 73;
        numTests++;
        totalPoints += testGrade;
        System.out.print("Test # " + numTests);
        System.out.print("   Test Grades: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + (double)(totalPoints)/numTests);
        
        testGrade = 91;
        numTests++;
        totalPoints += testGrade;
        System.out.print("Test # " + numTests);
        System.out.print("   Test Grades: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + (double)(totalPoints)/numTests);
        
        testGrade = 82;
        numTests++;
        totalPoints += testGrade;
        System.out.print("Test # " + numTests);
        System.out.print("   Test Grades: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + (double)(totalPoints)/numTests);
        
        testGrade = 99;
        numTests++;
        totalPoints += testGrade;
        System.out.print("Test # " + numTests);
        System.out.print("   Test Grades: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + (double)(totalPoints)/numTests);
        
        testGrade = 88;
        numTests++;
        totalPoints += testGrade;
        System.out.print("Test # " + numTests);
        System.out.print("   Test Grades: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + (double)(totalPoints)/numTests);
        
        testGrade = 67;
        numTests++;
        totalPoints += testGrade;
        System.out.print("Test # " + numTests);
        System.out.print("   Test Grades: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + (double)(totalPoints)/numTests);
        
        testGrade = 75;
        numTests++;
        totalPoints += testGrade;
        System.out.print("Test # " + numTests);
        System.out.print("   Test Grades: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + (double)(totalPoints)/numTests);
        
        testGrade = 97;
        numTests++;
        totalPoints += testGrade;
        System.out.print("Test # " + numTests);
        System.out.print("   Test Grades: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + (double)(totalPoints)/numTests);
        
    
    }//end of main method
}//end of class