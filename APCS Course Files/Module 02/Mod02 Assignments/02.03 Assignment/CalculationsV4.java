
/**
 * The purpose of the program is to display The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @author Fariha Rafa
 * @version 10/02/18       
 */
public class CalculationsV4
{
    public static void main(String[ ] args)
    {
        
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;
        int iNum4 = -5;
        int iNum5 = 18;
        
        // Addition 
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(43.21 + " + " + 3.14+ " = " + (43.21 + 3.14));
        System.out.println("");
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + " - " + iNum2 + " - " + iNum1 + " = " + (iNum3 - iNum2 - iNum1));
        System.out.println( "3.14 - 10.0 = " + (3.14 - 10.0 ));
        System.out.println("");
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2));   
        System.out.println( "3.14 * 10.0 * 10.0 = " + (3.14 * 10.0 * 10.0 ));
        System.out.println("");
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " = " + (iNum2/iNum1));
        System.out.println( "43.21 / 10.0 = " + (43.21 / 10.0));
        System.out.println("");
       
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum2 + " = " + (iNum3%iNum2));
        System.out.println( "10.0 % 3.14 = " + (10.0 % 3.14));
        System.out.println("");
        
        System.out.println("Complex Expressions");
        System.out.println(iNum1 + " % " + iNum4 + " * " + iNum5 + " = " + (iNum1%iNum4*iNum5)); 
        System.out.print(iNum5 + " / " + iNum2 + " - " + iNum1 + " = ");
        System.out.println(iNum5/iNum2-iNum1);
        System.out.print(iNum4 + " + " + iNum4 + " * " + iNum1 + " = ");
        System.out.println(iNum4+iNum4*iNum1);
        // Declare integer variables
      
        
        // 2.03 Additional int Equations
        
        
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class