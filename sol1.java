import java.util.*;
class sol1{
	public static void avg(int x, int y, int z){
		double result;
		result = (x+y+z)/3;
		System.out.println("The result:"+result);
		return;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x value:");
		int x = sc.nextInt();
		System.out.println("enter y value:");
		int y = sc.nextInt();
		System.out.println("enter z value:");
		int z = sc.nextInt();
		avg(x,y,z);
	}
}