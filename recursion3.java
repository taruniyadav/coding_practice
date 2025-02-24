class recursion3{
	public static void power(int x, int n,int sum){
	if(n == 0){
		return ;
	}
	if(x == 0){
		return ;
	}  
	power(x, n-1, sum*n);
	}
	public static void main(String[] args){
		power(2, 6, 1);
			
	}
}