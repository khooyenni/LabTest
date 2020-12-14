import java.util.Scanner;

public class LabQuestion2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your sales: ");
		double sales1=in.nextDouble();
		System.out.print("Enter hours worked: ");
		double hours = in.nextDouble();
		System.out.println();
		
		double comission1 = sales1 * 0.05;
		double comission2 = sales1 * 0.10;
		double comission3 = sales1 * 0.15;
		double hourlywages = hours * 5;
		double dailywages1 = hourlywages + comission1;
		double dailywages2 = hourlywages + comission2;
		double dailywages3 = hourlywages + comission3;
		
		if(sales1 >= 50 && sales1 <= 300) {
			System.out.println("Your commission is: " + "RM" + comission1);
		} else if(sales1 >= 301 && sales1 <= 500) {
			System.out.println("Your commission is: " + "RM" + comission2);
		} else if(sales1 > 500) {
			System.out.println("Your commission is: " + "RM" + comission3);
		}
		
		if(sales1 >= 50 && sales1 <= 300) {
			System.out.println("Your daily wages is: " + "RM" + dailywages1);
		} else if(sales1 >= 301 && sales1 <= 500) {
			System.out.println("Your daily wages is: " + "RM" + dailywages2);
		} else if(sales1 > 500) {
			System.out.println("Your daily wages is: " + "RM" + dailywages3);
		}

	}

}
