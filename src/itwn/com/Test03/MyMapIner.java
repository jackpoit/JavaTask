package itwn.com.Test03;

public class MyMapIner<K,U> implements Mymap<U,K> {
				//Mymap里的参数<U,K> 是随便定的 不需要和接口Mymap里的<K,V>一样，只是位置相对应，U-->K,K-->V
				// 只是和前面的MyMapIner<K,U>里的K U 一定要名字对应，不管位置，即 K-->U  U-->K


	@Override
	public void method1(U u) {

	}

	@Override
	public void method2(K k) {

	}
}
