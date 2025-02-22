//clear bits
import java.util.*;
class bits2{
	public static void main(String[] args){
		int  n = 7;//0111
		int pos = 3;
		int bitmask = 2<<pos;
		int newbitmask = ~(bitmask);
		int newnumber = newbitmask &n;
		System.out.println(newnumber);
	}
}
