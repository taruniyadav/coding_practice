import java.util.*;
class oddsum{
	public static void sum(int n){
		int sum =0;
		for(int i=1; i<=n ;i++){
			if(i%2!=0){
				sum = sum + i;
			}
		}
		System.out.println("the sum is:"+sum);
		return;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value:");
		int n = sc.nextInt();
		sum(n);
	}
}