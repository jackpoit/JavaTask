package itwn.com.file01;

public class Test02 {

//	public static long f(long x){
//		if (x==1||x==2){
//			return 1;
//		}
//		return f(x-1)+f(x-2);
//	}

	public static void main(String[] args) {
//		int count=45;
//		long startTime1=System.nanoTime();
//		System.out.println(f(count));
//		long endTime1=System.nanoTime();
//		System.out.println((endTime1-startTime1)/1000000000.0+"s");
//
//
//		long startTime2=System.nanoTime();
//		int[] nums=new int[count];
//		nums[0]=1;
//		nums[1]=1;
//		for (int i=2;i<count;i++){
//			nums[i]=nums[i-1]+nums[i-2];
//		}
//		System.out.println(nums[count-1]);
//		long endTime2=System.nanoTime();
//		System.out.println((endTime2-startTime2)/1000000000.0+"s");


		int opCount=20;

		long startTime4=System.nanoTime();

		System.out.println(fang(opCount));

		long endTime4=System.nanoTime();
		System.out.println((endTime4-startTime4)/1000000000.0+"s");



		long startTime3=System.nanoTime();

		long[] nums1=new long[opCount+1];
		nums1[0]=1;
		for (int i=1;i<opCount+1;i++){
			nums1[i]= nums1[i - 1] *i;
		}
		System.out.println(nums1[opCount]);

		long endTime3=System.nanoTime();
		System.out.println((endTime3-startTime3)/1000000000.0+"s");


	}

	public static long fang(long x){
		if (x==0){
			return 1;
		}
		return fang(x-1)*x;
	}
}
