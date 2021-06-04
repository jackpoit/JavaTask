package itwn.com.homework.task0604;

public class MyUtil {
	public int isExist(int[] arr,int num){
		int index=-1;

		for (int i=0;i<arr.length;i++){
			if (arr[i]==num){
				index=i;
				break;
			}
		}
		return index;

	}
	public String getCode(int codeLength){
		String res="";
		String rnum="";
		for (char c='0';c<='9';c++){
			rnum+=c;
		}
		for (char c='a';c<='z';c++){
			rnum+=c;
		}
		for (char c='A';c<='Z';c++){
			rnum+=c;
		}

		for (int i=0;i<codeLength;i++){
			res+=rnum.charAt((int)(Math.random()*62));
		}
		return res;


	}
}
