import java.util.*;
class spiralarr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int numbers[][] = new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				numbers[i][j] = sc.nextInt();
			}
		}
		int m = rows;
		int n = cols;
		System.out.print("the spiral array :");
		for(int i=0;i<rows-(m-1);i++){
			for(int j=0;j<cols;j++){
				System.out.print(numbers[i][j]+" ");
			}
		}
		for(int j=n-1;j<cols;j++){
			for(int i=1;i<rows;i++){
				System.out.print(numbers[i][j]+" ");
		  		}
			}
		for(int i=m-1;i<rows;i++){
			for(int j=n-2;j>=0;j--){
				System.out.print(numbers[i][j]+" ");
			}
		}
		for(int j=0;j<cols-(n-1);j++){
			for(int i=m-2;i>0;i--){
				System.out.print(numbers[i][j]+" ");
			}
		}
		for(int i=1;i<rows-(m-2);i++){
			for(int j=n-3;j<cols-(n-3);j++){
				System.out.print(numbers[i][j]+" ");
			}
		}
		for(int j=n-2;j<cols-(n-3);j++){
			for(int i=m-2;i<rows-(m-3);i++){
				System.out.print(numbers[i][j]+" ");
			}
		}
		for(int i=m-2;i<rows-(m-3);i++){
			for(int j=n-3;j>0;j--){
				System.out.print(numbers[i][j]+" ");
			}
		}
				
	}
}