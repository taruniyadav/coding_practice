import java.util.*;
class func{
	public static void even(int n){
		if(n%2==0){
			System.out.println("Even");
		}
		return;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		even(n);
	}
}