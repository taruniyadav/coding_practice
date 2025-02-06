class substr{
	public static void main(String[] args){
		String sentence = "hello there people!";
		String name = sentence.substring(12,sentence.length());
		String name1 = sentence.substring(0,6);
		String name2 = sentence.substring(6);
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		}
}