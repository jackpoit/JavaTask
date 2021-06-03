package itwn.com.homework.task0602;

public abstract class StringUtil {
	public static String getCode(int length) {
		String output = "";
		String rnum="";
		for (char c='0';c<='9';c++){
			rnum+=c;
		}
		for (char c='a';c<='z';c++){
			rnum+=c;
		}
		for (char c='A';c<='Z';c++){
			rnum+=c;
		}

		for (int i=0;i<length;i++){
			output+=rnum.charAt((int)(Math.random()*62));
		}
		return output;
	}
	public static boolean isLetterStr(String str) {
		for (int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if (c>'z'||c<'A'||(c>'Z'&&c<'a')){
				return false;
			}
		}
		return true;
	}
	public static boolean isNumStr(String str) {
		for (int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if (c>'9'||c<'0'){
				return false;
			}
		}
		return true;
	}
	public static boolean isChineseStr(String str) {
		for (int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if (c<0x4e00||c>0x9fa5){
				return false;
			}
		}
		return true;
	}
	public static String getFieldName(String colName,String regex){
		String[] strs=colName.split(regex);
		String res=strs[0];
		for (int i=1;i<strs.length;i++){
			res+=strs[i].toUpperCase().charAt(0);
			for (int j=1;j<strs[i].length();j++){
				res+=strs[i].toLowerCase().charAt(j);
			}
		}
		return res;
	}
	public static String clearStr(String str){
		String res="";
		while (str.length()!=0){
			res+=str.charAt(0);
			str=str.replace(str.charAt(0)+"","");
		}
		return res;
	}
	public static void getALLCharCount(String str){
		while (str.length()!=0){
			int count=str.length();
			String cStr=str.charAt(0)+"";
			str=str.replace(cStr,"");
			System.out.println(cStr+":"+(count-str.length()));

		}
	}

}
