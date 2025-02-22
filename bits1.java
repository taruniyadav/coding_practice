//set bits:
class bits1{
	public static void main(String[] args){
		int n = 7;//0111
		int pos = 3;
		int bitmask = 1<<pos;
		int newnumber = bitmask | n;
		System.out.println(newnumber);
	}
}