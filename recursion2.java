//factorial of a number n
class recursion2{
	public static void Fact(int n, int product){
		if(n == 1){
			System.out.println(product);
			return;
		}
		Fact(n-1, product*n);
		}
	public static void main(String[] args){
		Fact(6, 1);
		}
} 