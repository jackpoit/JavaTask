package itwn.com.homework.task0601;

public class MyUtil {
	public static void sortArray(int[] arr){
		for (int i=1;i<arr.length;i++){
			for (int j=0;j<arr.length-i;j++){
				if (arr[j]>arr[j+1]){
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}

	}
	public static int isExist(int[] arr,int num) {
		int index=-1;
		for (int i=0;i<arr.length;i++){
			if (arr[i]==num){
				index= i;
				break;
			}
		}
		return index;
	}

}
