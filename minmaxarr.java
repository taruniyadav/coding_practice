class minmaxarr{
	public static void main(String[] args){
		int array[] ={5,8,2,9,1,0};
		int max = array[0];
		int min = array[0];
		for(int i=0;i<array.length;i++){
			if(max<array[i]){
				max = array[i];
				}
		}
		System.out.println("the max value is:"+max);
		for(int i=0;i<array.length;i++){
			if(min>array[i]){
				min = array[i];
				}
		}
		System.out.println("the min value is:"+min);

	}
}