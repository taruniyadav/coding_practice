class str1{
	public static void main(String[] args){
		String name1="taruni";
		String name2="taruni";
		if(name1.compareTo(name2) ==0){
			System.out.println("Strings are equal");
		}
		else{
			System.out.println("Strings are not equal");
		}
// can also use name1 == name2 but sometimes it may gives us wrong output like below
		//non primitive type to create new strings
		if(new String("taruni") == new String("taruni")){
			System.out.println("Strings are equal");
		}
		else{
			System.out.println("Strings are not equal");
		}
	}
}
