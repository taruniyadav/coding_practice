//fibonacci series
import java.util.*;
class recursion4{
	public static void Fibo(int a, int b, int n){
		if(n == 0){
			return;
		}
		int c = a + b;
		System.out.print(c+" ");
		Fibo(b, c, n-1);
 	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = 0,b = 1;
		int n = sc.nextInt();
		System.out.print(a+" ");
		System.out.print(b+" ");
		Fibo(a, b, n-2);
		}
}
			
		