class ascenarr{
	public static void main(String[] args){
		int size = 4;
		int array[]={1,2,3,5,6,8,4};
		int count=0;
		for(int i=0;i<array.length-1;i++){	
			if(array[i]>array[i+1]){
				count = count+1;
			}
		}
			if(count == 0){
				System.out.println("array is in ascending order");
			}
			else{

				System.out.println("array is not in ascending order");
			}
	}
}