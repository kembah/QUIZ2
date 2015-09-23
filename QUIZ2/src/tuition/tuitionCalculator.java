/**
 * 
 */
/**
 * @author Kembydoll

 *
 */
package tuition;
import java.util.Scanner;
public class tuitionCalculator {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter cost of tuiton:");
		float tuition = input.nextFloat();
		
		System.out.print("Please enter percent increase:");
		float percentage = input.nextFloat();
		
		System.out.print("Please enter the fixed rate for your loan:");
		float loanRate = input.nextFloat();
		
		System.out.print("Please enterRepayment schedule (months): ");
		int months = input.nextInt();

		
		float tTuition = tuition;		
		float percentToPercent = percentage/100;
		float lRate = loanRate;
		float monthly = months;
		float total = 0;

		
		for (int m = 1; m<5; m++){
			float degreePrice = ((percentToPercent/100)*tTuition)*tTuition;
			total += degreePrice;
		System.out.println("Tuition is:" + tTuition);
		
		
		float monthlyPayments = (degreePrice/monthly);
		System.out.println("Monthly payment is:" + monthlyPayments);
		
			}
		
		
	}
}