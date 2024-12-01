import java.util.*;
class func1{
	public static void prime(int n){
		int count = 0;
		for(int i=2; i<=n; i++){
			if(n%i == 0){
				count++;
			}
		}
		if(count == 1){
			System.out.println("Prime number");
		}else{
			System.out.println("Not a Prime number");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		prime(n);
	}
}	