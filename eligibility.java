import java.util.*;
class eligibility {
	public static void eligible(int age){
		if(age >= 18){
			System.out.println("eligible to vote");
		}else{
			System.out.println("not eligible to vote");
		}
		return;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age:");
		int age = sc.nextInt();
		eligible(age);
	}
}
