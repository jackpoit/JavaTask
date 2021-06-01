package itwn.com.homework.task0601.teastusystem;

public class User {
	private MyArrayList list=new MyArrayList();
	public void record(Person person){
		if (person.depend(person)){
			list.add(person);
		}
	}

	public MyArrayList getList() {
		return list;
	}
}
