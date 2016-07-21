import java.util.*;
import java.lang.Math;

/**
 * 
 * @author Gordon Hu
 * 
 * Simple base converter converting a desired number to binary.
 * Future project convert this to any base? Small tweak. 
 */
public class BaseConverter {

	/**
	 * Simple algorithimic stuff here. Standard base conversion
	 * procedure.
	 * 
	 * @param args no command line args
	 * @return void
	 */
	public static void main(String [] args){
		
		System.out.println("Enter a number to convert to binary:   ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		//number of digits number will need
		int counter = numDigits(num);
		int counter2 = counter;

		//to be returned....
		String binary = "";
		
		//if it is 2,4,8,16,32,64....
		if(Math.pow(2, counter) == num){
			binary += 1;
			while(counter != 0){
				binary+=0;
				counter--;
			}
		}
		
		//concates a string to print out the result
		while(counter > 0){

			if(Math.pow(2, --counter2) <= num){
				
				binary += 1;
				num = (int) (num - Math.pow(2, counter2));

			}else{
				binary += 0;
			}
			
			counter--;
		}
	
		System.out.println(binary);
		
	}
	
	/**
	 * Calculates the minimum number of digits the binary number 
	 * will need
	 * 
	 * @param num number to be converted
	 * @return number of digits binary number will have
	 */
	public static int numDigits(int num){
		
		int digits = 0;
		
		boolean beans = true;
		
		while(beans){
			
			if( Math.pow(2,digits) < num){
				
				digits++;
				
			}else{
				return digits;
			}
		}
		
		return 0;
	}
	
}
