package itwn.com.homework.task0601;

public class MyUtil {
	public void sortArray(int[] arr){
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
	public int isExist(int[] arr,int num) {
		int index=-1;
		int left=0;
		int right=arr.length-1;
		while (left<=right){
			int mid=left+(right-left)/2;
			if (num==arr[mid]){
				index=mid;
			}else if (num>arr[mid]){
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		return index;

	}

}
