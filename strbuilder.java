//stringbuilder doesnt take extra time.
class strbuilder{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder("mini");
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		//to replace the letter
		sb.setCharAt(0,'f');
		System.out.println(sb);
		//to add a character in the middle of the string
		sb.insert(2,'n');
		System.out.println(sb);
		//delete a char
		sb.delete(4,5);
		System.out.println(sb);
		// can also add letters at the end by using append mode cause its an efficient way
		StringBuilder tv = new StringBuilder("h");
		tv.append("e");
		tv.append("y");
		System.out.println(tv);
		//length of the string
		System.out.println(tv.length());

		}
}