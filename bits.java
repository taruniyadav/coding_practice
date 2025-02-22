//get bits:
class bits{
	public static void main(String[] args){
		int n = 8;//1000
		int pos = 3;
		int bitmask = 1<<pos;
		if((bitmask & n)==0){
			System.out.println("bit was zero");
		}
		else{
			System.out.println("bit was one");
		}

	}
}
		