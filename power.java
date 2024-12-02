import java.util.*;
class power {
	public static void powering(int x,int n){
		double power = Math.pow(x,n);
		System.out.println("the power is:"+power);
		return;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x value:");
		int x = sc.nextInt();
		System.out.println("enter n value:");
		int n = sc.nextInt();
		powering(x,n);
	}
}