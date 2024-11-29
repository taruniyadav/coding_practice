import java.util.*;
class prac{
	public static int calculatesum(int a,int b){
		int sum=a+b;
		return sum;
	}
	public static int calmul(int a,int b){
		return a*b;
		}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = calculatesum(a,b);
		int mul = calmul(a,b);
		System.out.println("the result of a and b is:"+sum);
		System.out.println("the multipliaction of a and b is:"+mul);
	}
}