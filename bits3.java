//update bit
import java.util.*;
class bits3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int oper = sc.nextInt();
		int n = 5;//0101
		int pos = 1;
		int bitmask = 2<<pos;
		if(oper == 1){
			int newnumber = bitmask | n;
			System.out.println(newnumber);
		}
		else{
			int newbitmask = ~(bitmask);
			int newnumber = newbitmask & n;
			System.out.println(newnumber);
		}
	}
}


		