package itwn.com.test04;

public class Test01 {
	public static void main(String[] args) {
//		MyGeneric<Dog> dogList=new MyGeneric<>();
//		MyGeneric<Pet> petList=new MyGeneric<>();
//		MyGeneric<Cat> catList=new MyGeneric<>();
//		MyGeneric<Animal> animalList=new MyGeneric<>();
//
//		get(catList);

		MyArrayList<MyArrayList<?>> allList=new MyArrayList<>();
		MyArrayList<String> list1=new MyArrayList<>();
		list1.addLast("keji");

		allList.addLast(list1);
		System.out.println(allList);

	}
	public static void get(MyGeneric<?extends Cat> list){
		System.out.println(list);
	}
	public static void get(MyGeneric<?super Pet> list,int i){
		System.out.println(list);
	}

}
