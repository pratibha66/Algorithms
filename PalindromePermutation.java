import java.util.*;
public class PalindromePermutation{
	
	public static void main(String [] args){
		System.out.println(palindromePermutation("Tact Coa"));
		System.out.println(palindromePermutation("Tat"));
		System.out.println(palindromePermutation("T"));
		System.out.println(palindromePermutation(""));
		System.out.println(palindromePermutation("Taco"));

	}

	public static boolean palindromePermutation(String str){
		if(str == null){
			return false;
		}
		if(str.length() <= 1){
			return true;
		}
		String newStr = str.toLowerCase();
		Set<Character> set = new HashSet<>();


		for(int i = 0; i < newStr.length(); i++){
			Character c = newStr.charAt(i);
			if(c == ' '){
				continue;
			}
			if(set.contains(c)){
				set.remove(c);
			} else{
				set.add(c);
			}
		}

	return set.size() < 2;

	}



}