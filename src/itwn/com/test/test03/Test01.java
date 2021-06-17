package itwn.com.test.test03;

public class Test01 {
	public static void main(String[] args) {

			new Generic<String>(){   //  菱形括号里的string 必须要加

			@Override
			public <K> K test(K k) {
				return null;
			}
		};


		MyMapIner<Integer,String> myMapIner=new MyMapIner<>();



	}

}
