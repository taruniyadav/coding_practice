/*Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another.*/
import java.util.*;
class bits7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(binarytonum(n));
		String binary = "1001"; // Example input
       		int decimal = Integer.parseInt(binary, 2); // Convert binary to decimal
       		System.out.println("Decimal equivalent: " + decimal);
		}
	public static String binarytonum(int n){
			if(n==0){
				return "0";
			}
			else if(n==1){
				return "1";
			}
		return binarytonum(n/2)+(n%2);
	}
}	