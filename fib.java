import java.util.*;
class fib {
	public static void main(String[] args){
		int first = 0;
		int second = 1;
		int sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value:");
		int n = sc.nextInt();
		System.out.print(first+" ");
		System.out.print(second+" ");
		for(int i=1; i<=n; i++){
			sum = first + second;
			first = second;
			second = sum;
			System.out.print(sum+" ");
		}
	}
}
