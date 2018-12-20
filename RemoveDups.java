// happyholidays
// i = -1
// j = 0 to length(char)
// str[i]
// str[i+1] = 

// happyholidays
// str[0] = h i = 0
// str[1] = a i = 1
// str[2] = p i = 2
// str[3] = y i = 3


public class RemoveDups{
	public static int removeDups(char[] str){
		int retRes = -1;

		if(str == null){
			return -1;
		}

		if(str.length == 0){
			return 0;
		}
		int [] intArr = new int[256];

		for(int i = 0; i < str.length; i++){
			int index = (int) str[i];
			if(intArr[index] == 0){
				intArr[index]++;
				retRes++;
				str[retRes] = str[i];
			}

		}
		return retRes+1;

	}


	public static void main(String [] args){
		char [] str = {'h','a','p','p','y','h','o','l','i','d','a','y','s'};
		// h a p y o l i d s 
		// 9
		//[h,a,p,y,o,l,i,d,s,d,a,y,s]
		System.out.println(removeDups(str));
		System.out.println(str);

	}


}



