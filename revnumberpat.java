import java.util.*;
class revnumberpat{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value:");
		int n = sc.nextInt();
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}