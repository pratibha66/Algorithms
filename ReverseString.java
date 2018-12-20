// returnString+=(str[i]) creates new string everytime
// a
// ab
// abc
// abcd
// abcde

// StringBuilder sb = new StringBuilder();
// sb.toString();

public class ReverseString{

	public static String reverseString(char[] str){
		if(str == null){
			return null;
		}
		StringBuilder returnString = new StringBuilder();
		for(int i = (str.length - 1); i >= 0; i--){
			returnString.append(str[i]);
		}
		return returnString.toString();
	} 

	public static void reverseString1(char[] str){
		if(str == null){
			return;
		}
		for(int i = (str.length - 1), j = 0; i > j; i--, j++){
			char temp = str[i];
			str[i] = str[j];
			str[j] = temp;
		}
	} 

	public static void main(String [] args){
		char str1[]={'a','b','c','d','e'};
		reverseString1(null);
		System.out.println(str1);

	}

}

