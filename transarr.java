import java.util.*;
class transarr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int array[][] = new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				array[i][j]=sc.nextInt();
			}
		}
		System.out.println("the matrix is:");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The transpose of the matix is:");
		for(int j=0;j<cols;j++){
			for(int i=0;i<rows;i++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}

		