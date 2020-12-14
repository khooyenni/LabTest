import java.util.Scanner;

public class LabTestQuestion1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter the number of items: ");
		int item = in.nextInt();
		System.out.println("The number of items is " + item);
	
		System.out.print("Enter the price of the first items: ");
		double price1 = in.nextDouble();		
		System.out.print("Enter the quantity of the first items: ");
		int quantity1 = in.nextInt();
		double totalprice1 = price1 * quantity1;
		System.out.println("Total price = " + "RM "+ totalprice1);
		
		
		System.out.print("Enter the price of the second items: ");
		double price2 = in.nextDouble();		
		System.out.print("Enter the quantity of the second items: ");
		int quantity2 = in.nextInt();
		double totalprice2 = (price2*quantity2);
		System.out.println("Total price = " + "RM " + totalprice2);
		
		
		System.out.print("Enter the price of the third items: ");
		double price3 = in.nextDouble();		
		System.out.print("Enter the quantity of the third items: ");
		int quantity3 = in.nextInt();
		double totalprice3 = (price3*quantity3);
		System.out.println("Total price = " + "RM " + totalprice3);
		
		double nprice = totalprice1 +totalprice2+ totalprice3;
		System.out.println("The total price of the item(s) you have bought: " + "RM " + nprice);
			
		double discount1=nprice*0.2;
		double discount2=nprice*0.1;
		if(nprice>=100) {
			System.out.println("The discount you received is: " + "RM " + discount1);
		} else if(nprice<100) {
			System.out.println("The discount you received is: " + "RM " + discount2);
		}
		
		double ntotalprice1 =nprice-discount1;
		double ntotalprice2 =nprice-discount2;
		if(nprice>=100) {
			System.out.println("The total price you have to pay is: " + "RM " + ntotalprice1);
		} else if(nprice<100) {
			System.out.println("The total price you have to pay is: " + "RM " + ntotalprice2);
		
		}

	}

}
