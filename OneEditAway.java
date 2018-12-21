There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale, ple -> true
pales, pale -> true
pale, bale -> true
pale, bake -> false
Hints:#23, #97, #130

public class OneEditAway{
	
	public static void main(String [] args){


	}

	public static boolean oneEditAway(Stirng str1, String str2){
		if(str1 == null || str2 == null){
			return false;
		}
		if(str1.equals(str2)){
			return true;
		}
		if(str1.length() )

	}



}