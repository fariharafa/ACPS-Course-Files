/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Fariha Rafa
 * @version 10/09/18      
 */
public class ConversionCurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;     // starting US Dollars

        double dirhamSpent = 8888.88;            // Abu Dhabi Dirham spent
        double dirhamExchangeRate = 0.2903;    // 1 US dollar = 3.44 Dirham
        double dollarsSpentInAbuDhabi = 0.0;      // US dollars spent in Abu Dhabi
        double dollarsAfterAbuDhabi = 0.0;        // US dollars remaining after Abu Dhabi
        
        double bahtSpent = 8888.88;            // Thailand Baht spent
        double bahtExchangeRate = 0.03244;    // 1 US dollar = 30.69 Baht
        double dollarsSpentInThailand = 0.0;      // US dollars spent in Thailand
        double dollarsAfterThailand = 0.0;        // US dollars remaining after Thailand
        
        double yenSpent = 8888.88;            // Japanese Yen spent
        double yenExchangeRate = 0.00929;    // 1 US dollar = 19.57852 Yen
        double dollarsSpentInJapan = 0.0;      // US dollars spent in Japan
        double dollarsAfterJapan = 0.0;        // US dollars remaining after Japan
        
        //remaining variables below here

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here
        System.out.println("Starting US Dollars:            " + startingUsDollars);
        System.out.println();
        
        System.out.println("Abu Dhabi:        ");
        System.out.println(" Dirham spent:                  " + dirhamSpent);
        dollarsSpentInAbuDhabi = (dirhamSpent*dirhamExchangeRate); 
        System.out.println(" US dollars equivalent:         " + dollarsSpentInAbuDhabi);
        dollarsAfterAbuDhabi = (startingUsDollars-dollarsSpentInAbuDhabi);
        System.out.println(" US dollars remaining:          " + dollarsAfterAbuDhabi);
        System.out.println();
        
        System.out.println("Thailand");
        System.out.print(" Baht spent:                    ");
        System.out.println(bahtSpent);
        dollarsSpentInThailand = (bahtSpent*bahtExchangeRate);
        System.out.print(" US dollars equivalent:         ");
        System.out.println(dollarsSpentInThailand);
        dollarsAfterThailand = (dollarsAfterAbuDhabi - dollarsSpentInThailand);
        System.out.print(" US dollars remaining:          ");
        System.out.print(dollarsAfterThailand);
        System.out.println();
        
        System.out.println("Japan");
        System.out.print(" Yen spent:                     ");
        System.out.println(yenSpent);
        dollarsSpentInJapan = (yenSpent*yenExchangeRate);
        System.out.print(" US dollars equivalent:         ");
        System.out.println(dollarsSpentInJapan);
        dollarsAfterJapan = (dollarsAfterThailand - dollarsSpentInJapan);
        System.out.print(" US dollars remaining:          ");
        System.out.print(dollarsAfterJapan);
        System.out.println();

        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;                         //cost per item of first souvenir
        int budget1 = 100;                          //budget for first item
        int totalItems1 = 0;        //how many items can be purchased
        int fundsRemaining1 = 0;  //how much of the budget is left

        totalItems1 = (int)(budget1/costItem1);
        fundsRemaining1 = (int) (budget1%costItem1);
        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;                       //cost per item of second souvenir
        int budget2 = 500;                              //budget for second item
        int totalItems2 = 0;    //how many items can be purchased
        double fundsRemaining2 = 0.0;   //how much of the budget is left

        totalItems2 = (int)(budget2/costItem2);
        fundsRemaining2 = (double) (budget2%costItem2);
        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class
