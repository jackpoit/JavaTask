package itwn.com.test.aslisttest;

import java.util.Arrays;
import java.util.Comparator;

public class Test01 {
	public static void main(String[] args) {
		Integer[] nums = new Integer[50];
		int[][] counts = new int[10][2];
		for (int i=0;i<counts.length;i++){
			counts[i][0]=i+90;
		}
		for (int i = 0; i < nums.length; i++) {
			int rnum=(int) (Math.random() * 10) + 90;
			nums[i] = rnum;
			counts[rnum-90][1]+=1;
		}
		Arrays.sort(counts, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] == o2[1] ? Integer.compare(o1[0], o2[0]) : Integer.compare(o1[1], o2[1]);
			}
		});
		for (int[] a : counts) {
			System.out.println(Arrays.toString(a));
		}
	}
}

