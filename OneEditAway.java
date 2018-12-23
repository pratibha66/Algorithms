public class OneEditAway{
	
	public static void main(String [] args){

		System.out.println(oneEditAway("pale", "ple"));
		System.out.println(oneEditAway("pales", "pale"));
		System.out.println(oneEditAway("bale", "pale"));
		System.out.println(oneEditAway("pale", "bake"));
		System.out.println(oneEditAway("pale", "pala"));

	}

	public static boolean oneEditAway(String str1, String str2){
		if(str1 == null || str2 == null){
			return false;
		}
		if(str1.equals(str2)){
			return true;
		}
		int lengthDiff = Math.abs(str1.length() - str2.length());
		if(lengthDiff > 1){
			return false;
		}

		int i;
		for(i = 0; i < str2.length(); i++){
			if(str1.charAt(i) != str2.charAt(i)){
				break;
			}
		}
		int j;
		if(lengthDiff == 0){
			j = i+1;
		}else {
			j = i;
		}
		i++;

		return (j == str2.length() || str1.substring(i).equals(str2.substring(j))) ;

	}

}