class rhombus{
	public static void main(String[] args){
		int n=5;
		int m=9;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m-n;j++){
				System.out.print(" ");
				}
			for(int j=1;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
			m--;
		}
	}
}