package itwn.com.homework.task0602;

public class Task03 {
	public static void main(String[] args) {
		String str1="这些年一个人，风也过，雨也走，有过泪，有过错, 还记得坚持甚么，真爱过才会懂，会寂寞会回首，" +
				"终有梦终有你在心中朋友一生一起走，那些日子不再有，一句话，一辈子，一生情，一杯酒。朋友不曾孤单过，" +
				"一声朋友你会懂，还有伤，还有痛，还要走，还有我";
		int n=str1.length();
		while (str1.contains("朋友")){
			str1=str1.replace("朋友","");
		}
		System.out.println((n-str1.length())/2);

	}

}
