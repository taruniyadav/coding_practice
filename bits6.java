//Write a program to count the number of 1’s in a binary representation of the number.
import java.util.*;
class bits6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int pos = 1;
		while(n!=0){
			count += n & 1;
			n= n>>pos;
		}
		System.out.println(count);
	}
}