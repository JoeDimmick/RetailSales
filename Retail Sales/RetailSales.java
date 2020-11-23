/* *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
*  Project  :  A05d- Retail Sales                                             *
*  File     :  RetailSales.java                                               *
*  Name     :  Joe Dimmick                                                    *
*  Date     :  Created: 21 Mar 2017 (Due 23 Mar 2017)                         *
*                                                                             *
*  Description:   Problem - Write an application to calculate retail sales.   *   
*                 Specifications - An online retailer sells five products     * 
*                 Product 1. $2.98                                            *
*                 Product 2. $4.50                                            *     
*                 Product 3. $3.98                                            *      
*                 Product 4. $4.49                                            *
*                 Product 5. $6.87                                            *
*                 1. Write an application that reads (from the keyboard) a    * 
*                    series of pairs of numbers as follows:                   *
*                    -product number                                          *
*                    -quantity sold                                           *
*                 2. Run your program from a simple menu with the following   *
*                    options.                                                 *
*                    1. Enter products sold                                   *
*                    2. Display total retail value                            *
*                    3. Exit                                                  *
*                 3. Your program should                                      *
*                    -allow for entry of multiple products without returning  * 
*                     to main menu (use a sentinel controlled loop.           *
*                    -use a switch statement to determine the retail price for*
*                    for each product                                         *
*                    -calculate and display the total retail value of all     *
*                    products sold                                            *
*  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  */
import java.util.Scanner;

public class RetailSales
{
   static double retailTotal = 0;
   
   public static void main(String [] args)
   {
      //variables
      char selection;
      Scanner input = new Scanner(System.in);
      
      //display initial menu
      do
      {
         System.out.println("\n--[ Point of Sale ]--\n");
         System.out.println("1. Enter Product");
         System.out.println("2. Display total retail value");
         System.out.println("3. Exit\n");         
         System.out.print("Selection: ");
         
         //get menu selection
         selection = input.next().charAt(0);
         
         //switch selection
         switch(selection)
         {
            case '1' : enterProduct(); 
                        break;
            
            case '2' : System.out.printf("Total retail value: $%.2f\n", retailTotal); 
                        pause(); 
                        break;            
            
            case '3' : break;
            
            default  : System.out.println("\nInvalid Selection\n");
         }      
      }while (selection != '3');
      
      System.out.println("Have a nice day!!");
      
   }//end Main
   
   public static void enterProduct()
   {
      double product1 = 2.98, product2 = 4.50, product3 = 3.98, product4 = 4.49, product5 = 6.87,
         productTotal = 0;
      int qty;  
      char productSelection;
      Scanner productInput = new Scanner(System.in);
      
      do
      {      
         //display item list
         System.out.println("\n--[ Item List ]--\n");
         System.out.println("1. Product 1 $2.98");
         System.out.println("2. Product 2 $4.50");
         System.out.println("3. Product 3 $3.98");
         System.out.println("4. Product 4 $4.49");
         System.out.println("5. Product 5 $6.87");
         System.out.println("6. To End");
         System.out.print("Selection: ");
         
         //get item menu selection
         productSelection = productInput.next().charAt(0);         
         
         switch (productSelection)
         {
               case '1' : System.out.print("\nProduct 1 @$2.98 each. Enter quantity: ");
                           qty = productInput.nextInt();
                           productTotal = qty*product1;
                           retailTotal = productTotal + retailTotal;
                           System.out.printf("$%.2f added to retail total.\n", productTotal);
                           pause();                           
                           break;
            
               case '2' : System.out.print("\nProduct 2 @$4.50 each. Enter quantity: ");
                           qty = productInput.nextInt();
                           productTotal = qty*product2;
                           retailTotal = productTotal + retailTotal;
                           System.out.printf("$%.2f added to retail total.\n", productTotal); 
                           pause(); 
                           break;
            
               case '3' : System.out.print("\nProduct 3 @$3.98 each. Enter quantity: ");
                           qty = productInput.nextInt();
                           productTotal = qty*product3;
                           retailTotal = productTotal + retailTotal;
                           System.out.printf("$%.2f added to retail total.\n", productTotal); 
                           pause(); 
                           break;
            
               case '4' : System.out.print("\nProduct 4 @$4.49 each. Enter quantity: ");
                           qty = productInput.nextInt();
                           productTotal = qty*product4;
                           retailTotal = productTotal + retailTotal;
                           System.out.printf("$%.2f added to retail total.\n", productTotal); 
                           pause(); 
                           break;
                                 
               case '5' : System.out.print("\nProduct 5 @$6.87 each. Enter quantity: ");
                           qty = productInput.nextInt();
                           productTotal = qty*product5;
                           retailTotal = productTotal + retailTotal;
                           System.out.printf("$%.2f added to retail total.\n", productTotal); 
                           pause(); 
                           break;
            
               case '6' : break;
                           
                                 
               default  : System.out.println("\nInvalid selection\n");
             
            }// end switch
      }while (productSelection != '6');          
   }//end enterProduct
      
   public static void pause()
   {
      try
      {
         System.out.print("Press <Enter> to continue...");
         System.in.read();
      }
      catch (Exception e)
      {
         System.err.printf("Error %s%c\n",e.getMessage(),7);
      }
   }//end pause
   
}//end class RetailSales

