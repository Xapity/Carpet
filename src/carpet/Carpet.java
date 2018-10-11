/*  Callum MacLeod, 
    September 17th 2018
    Cost of a carpet for U2A1
 */

package carpet;

import java.text.DecimalFormat;

/**
 *
 * @author camac2045
 */
public class Carpet {

    
    /* 
     */
    public static void main(String[] args) {
        //Declaring variables
        double width, length, price, metersq, total;
        width = 8.50;
        length = 6.00;
        price = 19.95;
        
        
        metersq = width*length;//Meters squared of the carpet would be L*W
        total = metersq*price;//The total price would then be meters squared*price per meter
           DecimalFormat x = new DecimalFormat ("###.##");//Rounding for decimals and making sure its a monetary number
                System.out.println("The total cost is $" + x.format(total));//Printing the total cost
    }
    
}
