class recursion5{
	public static int power(int x, int n){
		if(n == 0){
			return 1;
		}
		if(x == 1){
			return 0;
		}
		if(n%2 == 0){
			return power(x, n/2) * power(x, n/2);
		}
		else{
			return power(x, n/2) * power(x, n/2) * x;
		}
	}
	public static void main(String[] args){
		int x = 8, n = 2;
		int res = power(x, n);
		System.out.println(res);
		}
}