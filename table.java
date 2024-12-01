import java.util.*;
class table{
	public static void tab(int n){
		int result;
		for(int i=1; i<=10; i++){
			result = n*i;
			System.out.println(n+" * "+i+" = "+result);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		tab(n);
	}
}	