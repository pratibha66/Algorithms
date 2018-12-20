// Set -> HashSet
// Set<Character> varName = new HashSet<>();
// add(Character ch);
// contains(Character ch) -> true if ch is in set else false

import java.util.Set;
import java.util.HashSet;

class IsUnique{

public static boolean isUnique(final String str){
 	int[] intArr = new int[256];
 	if(str == null){
 		return false;
 	}
 	for(int i = 0; i < str.length(); i++){
 		int charInt = (int) str.charAt(i);
 		intArr[charInt]++;
 		if(intArr[charInt] > 1){
 		return false;
 		} 
 	}
	return true;
}

public static boolean isUnique1(final String str){
 	Set<Character> varName = new HashSet<>();
 	if(str == null){
 		return false;
 	}
 	for(int i = 0; i < str.length(); i++){
 		char c = str.charAt(i);
 		if(varName.contains(c)){
 			return false;
 		}
 		varName.add(c);
 	}
	return true;
}



public static void myassert(boolean expected, boolean received){
	if(expected == received){
		System.out.println("passed");
	}
	else{
		System.out.println("failed");
	}
}

public static void main(String ...args){


	myassert(false,isUnique1("hello"));
	myassert(true,isUnique1("abcdefgh"));
	myassert(true,isUnique1("computer"));
    myassert(false,isUnique1("aaaaaaa"));
    myassert(false,isUnique1("heloh"));
    myassert(true,isUnique1(""));
    myassert(false,isUnique1(null));

}

}