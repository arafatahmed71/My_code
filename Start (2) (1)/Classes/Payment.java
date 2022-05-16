package Classes;
import java.util.Scanner;

public class Payment {
    public double amount;

    public Payment() {
        System.out.println("\t\t\t\t\t\t\t\t-----PAYMENT SECTION-----");
        System.out.println("");
		System.out.println("");
		System.out.println("");
		
		 System.out.println("\t\t\t\t\t\t\t\tYou have to pay 1000 for each CV.");
    }

    public Payment(double amount) {
        this.amount = amount;
    }

    Scanner in = new Scanner(System.in);
    
    public void Cash() {
        System.out.println("\t\t\t\t\t\t\t\tCash paid:" + amount);
    }

    public void Card() 
	{

        System.out.print("\t\t\t\t\t\t\t\tEnter card Number:");
        int num = in.nextInt();
        System.out.print("\t\t\t\t\t\t\t\tEnter CVV:");// cvv is card verification value
        int CVV = in.nextInt();
        if (CVV > 0) {
            System.out.println("\t\t\t\t\t\t\t\tPayment Successful!");
        }
			
			
    }
			

    
	
	
	public void bill()
	{
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t***Bill Summary***");
		System.out.println("\t\t\t\t\t\t\t\tTotal Bill: "+amount);
		System.out.println(" \t\t\t\t\t\t\t\tBill paid: "+amount);
		System.out.println(" \t\t\t\t\t\t\t\tThank you .");
	}
	
         // main output or main method
    public void payment_method() {
				
		System.out.println("");
        System.out.print("\t\t\t\t\t\t\t\tEnter total amount to be paid:");
        amount=in.nextDouble();
		if(amount==1000){
		
        System.out.println("\t\t\t\t\t\t\t\tPlease enter your choice:");
        System.out.println("\t\t\t\t\t\t\t\t1. Pay on Cash");
        System.out.println("\t\t\t\t\t\t\t\t2. Pay on Card");
		

        //Get user's choice
        int choice = in.nextInt();

        while(choice<3) {
            switch (choice) {
                case 1:
                    Cash();
					bill();
                    break;
                case 2:
                    Card();
					bill();
                    break ;
                case 3:
                    break;
                default:
                    System.out.println("\t\t\t\t\t\t\t\tInvalid choice");

               }
                break;
		 
            }
		}
			else {System.out.println("\t\t\t\t\t\t\t\tYou did not give right amount..");
		    System.out.println("\t\t\t\t\t\t\t\tPlease try again..");
			     System.out.println("\t\t\t\t\t\t\t\tFor pay again  press 1 and for exit press 0"); 
		int choice2 = in.nextInt();
		
					while(choice2<2) {
            switch (choice2) {
                
					case 1:
                    payment_method();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("\t\t\t\t\t\t\t\tThank you ");

               }
                break;
					}
            }
			 
    }
				
		 
}
