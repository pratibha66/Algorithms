import java.util.*;

public class Permutation{

	public static Set<String> findPermutations(String str, int n){
		Set<String> s = new HashSet<>();
		findPermutations(str,n,s,"");
		return s;
	}

	private static void findPermutations(String str, int n, Set<String> s, String curp){
		if(n == 0){
			s.add(curp);
			return;
		}
		for(int i = 0; i < str.length(); i++){
			String newStr = str.substring(0, i) + str.substring(i+1);
			findPermutations(newStr, n-1, s, curp+str.charAt(i));
		}
	}

	public static void main(String[] args){
		String str = "abc";
		Set<String> s = findPermutations(str,3);

		for(String sr : s){
			System.out.println(sr);
		}

	}
}


