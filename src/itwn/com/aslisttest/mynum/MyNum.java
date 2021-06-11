package itwn.com.aslisttest.mynum;

public class MyNum {
	private int num;
	private int count;

	public MyNum() {
	}

	public MyNum(int num, int count) {
		this.num = num;
		this.count = count;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "MyNum{" +
				"num=" + num +
				", count=" + count +
				'}'+"\n";
	}
}
