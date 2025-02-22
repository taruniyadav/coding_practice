//Write a program to toggle(flipping) a bit a position = “pos” in a number “n”.
import java.util.*;
class bits5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();
		int n = 5;//0101
		int bitmask = 1<<pos;
		int newnumber = bitmask | n;
		System.out.println(newnumber);
		}
}
		
		
			
		