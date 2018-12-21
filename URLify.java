// Input: "Mr John Smith    "
// Output: "Mr%20John%20Smith"


import java.util.*;
public class URLify{
	
	public static void urlify(char[] str, int index){
		index--;
	for(int i = str.length -1; i >= 0;){
		if(str[index] != ' '){
			str[i] = str[index];
			i--;
		}
		else{
			str[i] = '0';
			str[i-1] = '2';
			str[i-2] = '%';
			i -= 3;
		}
		index--;
	}

	}

	public static void main(String [] args){
		char[] str = {'M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ', ' ', ' ', ' '};
		urlify(str, 13);
		System.out.println(Arrays.toString(str));	

	}

}