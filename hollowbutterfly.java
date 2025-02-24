import java.util.*;
class hollobutterfly{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		// UPPER PART
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				if(j==1 || j==i){
					System.out.print("*");
				}
				else{
				System.out.print(" ");
				}
			}
			//SPACES
			for(int j=1; j<=2*(n-i); j++){
				System.out.print(" ");
				}
			//RIGHT PATH
			for(int j=1; j<=i; j++){
				if(j==1 || j==i){
					System.out.print("*");
				}
				else{
				System.out.print(" ");
				}
			}
			System.out.println();
		}
		//LOWER PART
		for(int i=n; i>=1; i--){
			for(int j=1; j<=i; j++){
				if(j==1 || j==i){
					System.out.print("*");
				}
				else{
				System.out.print(" ");
				}
			}//SPACES
			for(int j=1; j<=2*(n-i); j++){
				System.out.print(" ");
			}//RIGHT PATH
			for(int j=1; j<=i; j++){
				if(j==1 || j==i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}