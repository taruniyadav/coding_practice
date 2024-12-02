import java.util.*;
class circum{
	public static void circumference(int r){
		double pi = 3.14;
		double c = 2*pi*r;
		System.out.println("the circumference of a circle is:"+c);
		return;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter r value:");
		int r = sc.nextInt();
		circumference(r);
	}
}