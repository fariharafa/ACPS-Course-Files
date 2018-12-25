
/**
 * The purpose of the program is to display aritmetic expressions using integer
 *  and double variables with operators and operands. 
 * @author Fariha Rafa
 * @version 10/02/18       
 */
public class CalculationsV6 
{
    public static void main(String[ ] args)
    {
        
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;
        int iNum4 = -5;
        int iNum5 = 18;
        
        double dNum1 = 43.21; 
        double dNum2 = 3.14;
        double dNum3 = 10.0;
        double dNum4 = 12.34;
        double dNum5 = -5.67;
        
        // Addition 
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        System.out.println("");
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + " - " + iNum2 + " - " + iNum1 + " = " + (iNum3 - iNum2 - iNum1));
        System.out.print(dNum2 + " - " + dNum3 + " = ");
        System.out.println(dNum2 - dNum3);
        System.out.println("");
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2));
        System.out.print(dNum2 + " * " + dNum3 + " * " + dNum3 + " = ");
        System.out.println(dNum2*dNum3*dNum3);
        System.out.println("");
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " = " + (iNum2/iNum1));
        System.out.print(dNum1 + " / " + dNum3 + " = ");
        System.out.println(dNum1/dNum3);
        System.out.println("");
       
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum2 + " = " + (iNum3%iNum2));
        System.out.println(dNum3 + " % " + dNum2 + " = " + (dNum3%dNum2));
        System.out.println("");
        
        System.out.println("Complex Expressions");
        System.out.println(iNum1 + " % " + iNum4 + " * " + iNum5 + " = " + (iNum1%iNum4*iNum5)); 
        System.out.print(iNum5 + " / " + iNum2 + " - " + iNum1 + " = ");
        System.out.println(iNum5/iNum2-iNum1);
        System.out.print(iNum4 + " + " + iNum4 + " * " + iNum1 + " = ");
        System.out.println(iNum4+iNum4*iNum1);
        System.out.println(dNum4 + " % " + dNum2 + " * " + dNum3 + " = " + (dNum4%dNum2*dNum3));
        System.out.print(dNum5 + " / " + dNum1 + " - " + dNum4 + " = ");
        System.out.println(dNum5/dNum1+dNum4);
        System.out.print(dNum5 + " + " + dNum5 + " * " + dNum3 + " = ");
        System.out.println(dNum5+dNum5*dNum3);
        
        // Declare integer variables
      
        
        // 2.03 Additional int Equations
        
        
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class