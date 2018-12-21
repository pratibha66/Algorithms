// Given two strings, write a method to decide if one is a permutation of the other.
// Map<obj1, obj2> map = new HashMap<>();
// map.get(obj1) = obj2 if obj1 exists else return null
// Map<Character, Integer>
// map.remove(obj1)

// str1 = a,a,a,a,a,b  str2 = a,a,a,a,b,b

import java.util.*;

public class Anagrams{
	public static void main(String [] args){

		String str1 = "happy";
		String str2 = "yapph";
		String str3 = null;
		String str4 = "";
		String str5 = "holidays";
		String str6 = "abcde";
		String str7 = "ababab";
		String str8 = "aabbaa";

		System.out.println(anagrams(str1,str2) + " true");
		System.out.println(anagrams(str1,str1) + " true");
		System.out.println(anagrams(str1,str3) + " false");
		System.out.println(anagrams(str3,str4) + " false");
		System.out.println(anagrams(str5,str4) + " false");
		System.out.println(anagrams(str6,str1) + " false");
		System.out.println(anagrams(str7,str8) + " false");

	}

	public static boolean anagrams(String str1, String str2){
		if(str1 == null || str2 == null){
			return false;
		}
		if(str1.isEmpty() && str2.isEmpty()){
			return true;
		}
		if(str1.length() != str2.length()){
			return false;
		}

		Map<Character, Integer> charMap = new HashMap<>();

		for(int i = 0; i < str1.length(); i++){
			Integer count = charMap.get(str1.charAt(i));
			if(count == null){
				count = 0;
			}
			count++;
			charMap.put(str1.charAt(i), count);
		}

		for(int i = 0; i < str2.length(); i++){
			Integer count = charMap.get(str2.charAt(i));
			if(count == null || count == 0){
				return false;
			}
			count--;
			charMap.put(str2.charAt(i), count);
		}

		return true;
	}

}