// aabcccccaaa
// temp = a
// i = 1
public class StringCompression{
	public static void main(String [] args){
		String str = null;
		System.out.println(stringCompression("aabcccccaaa"));
		System.out.println(stringCompression(""));
		System.out.println(stringCompression(str));
		System.out.println(stringCompression("aaaaaaaaaa"));
		System.out.println(stringCompression("abc"));


	}

	public static String stringCompression(String str){
		if(str == null){
			return "Input string is null";
		}

		if(str.length() == 0){
			return str;
		}

		String retstr = "";
		char temp = str.charAt(str.length()-1);
		int count = 1;

		for(int i = 1; i < str.length(); i++){
			if(str.charAt(i) == temp){
				count++;
			} else{
				retstr += temp;
				retstr += count;
				temp = str.charAt(i);
				count = 1;
			}
		}
			retstr += temp;
			retstr += count;
		if(retstr.length() < str.length()){
			return retstr;
		}
		return str;

	}


}