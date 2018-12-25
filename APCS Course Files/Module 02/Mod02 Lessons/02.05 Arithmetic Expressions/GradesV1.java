/**
 * The purpose of this program is to 
 * calculate the average of four grades
 * 
 * @author Fariha Rafa 
 * @version 10/04/17
 */
public class GradesV1
{
    public static void main(String[ ] args)
    {
        int test1 = 96;         //test score 1
        int test2 = 78;         //test score 2
        int test3 = 85;         //test score 3
        int test4 = 87;         //test score 4
        int x = 50;
        int y = 15;
        int a = 14;
        int b = 22;
        int c = 5;
        int d = 4;
        int e = 3;
        double average;         //average of four test scores
        
        //calculate the average grade and print the results
        average = (test1 + test2 + test3 + test4) / 4.0;
        System.out.println("Average Score: " + average);
        System.out.println(a + " - " + b + "/" + c + "%" + d + "+" + e + "=" + (a-b/c%d+e));
    }//end of main method
}//end of class