package itwn.com.exam0607.exam01;

public class Goods {
	private int goodsID;
	private static int count;
	private String goodsName;
	private double goodsprice;
	private int goodsNum;
	private String goodsType;

	public Goods(){
		this("jack",100,1,"apple");
	}
	public Goods( String goodsName, double goodsprice, int goodsNum, String goodsType) {
		this.goodsID = ++count;
		this.goodsName = goodsName;
		this.goodsprice = goodsprice;
		this.goodsNum = goodsNum;
		this.goodsType = goodsType;
	}

	public void show(){
		String message="Goods{" +
				"goodsID=" + goodsID +
				", goodsName='" + goodsName + '\'' +
				", goodsprice=" + goodsprice +
				", goodsNum=" + goodsNum +
				", goodsType='" + goodsType + '\'' +
				'}';
		System.out.println(message);
	}

	public int getGoodsID() {
		return goodsID;
	}

	public void setGoodsID(int goodsID) {
		this.goodsID = goodsID;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public double getGoodsprice() {
		return goodsprice;
	}

	public void setGoodsprice(double goodsprice) {
		this.goodsprice = goodsprice;
	}

	public int getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
}
