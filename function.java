import java.util.*;
class function{
	public static void fact(int n){
		if(n < 0){
			System.out.println("Invalid number");
			return;
		}
		int factorial = 1;
		for(int i=n; i>=1 ;i--){
			factorial = factorial*i;
			}
		System.out.println("the factorial of a number is:"+factorial);
		return;
		}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fact(n);
		
		}
}		