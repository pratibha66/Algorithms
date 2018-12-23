public class StringRotation{
	
	public static void main(String [] args){
		String str1 = "waterbottle";
		String str2 = "erbottlewat";
		System.out.println(isStringRotation(str1, str2));
		System.out.println(isStringRotation(str2, str1));
		String str3 = "waterbottte";
		String str4 = "waterbottle";
		System.out.println(isStringRotation(str3, str4));
	}

	private static boolean isSubstring(String str1, String str2){
		return str1.contains(str2);
	}

	public static boolean isStringRotation(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}

		String newStr = str1 + str1;
		return isSubstring(newStr, str2);
	}
}