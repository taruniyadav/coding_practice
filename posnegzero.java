import java.util.*;
class posnegzero {
	public static void main(String[] args){
		int positives = 0;
		int negatives = 0;
		int zeros = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n:");
		int n = sc.nextInt();
		System.out.println("enter the values:");
		for(int i=1; i<=n; i++){
			int j = sc.nextInt();
			if(j > 0){	
				positives = positives+1;
			}
			else if(j < 0){	
				negatives = negatives+1;
			}
			else if(j == 0){	
				zeros = zeros+1;
			}
		}
		System.out.println("The number of positives are:"+positives);
		System.out.println("The number of negatives are:"+negatives);
		System.out.println("The number of zeros are:"+zeros);
	}
}
