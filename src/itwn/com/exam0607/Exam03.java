package itwn.com.exam0607;

import java.util.Arrays;
import java.util.Random;

public class Exam03 {
	public static void main(String[] args) {
		double[] rnums=new double[15];
		Random rn=new Random();
		int index=0;



		while (index<15){
			boolean depend=true;
			double rnum= rn.nextDouble()*19+1;
			for (int i=0;i<index;i++){
				if (rnums[index]==rnum){
					//   注意！continue; 不行，这个只能跳出for循环；
					depend=false;
					break;
				}
			}
			if (depend) {
				rnums[index] = rnum;
				index++;
			}
		}
		System.out.println(Arrays.toString(rnums));
	}
}
