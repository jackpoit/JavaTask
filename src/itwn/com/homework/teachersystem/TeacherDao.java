package itwn.com.homework.teachersystem;

public class TeacherDao {
	private MyArrayList teacherList=new MyArrayList();
	private MyArrayList studentList=new MyArrayList();

	public Teacher nameCheck(String name){
			for (int i=0;i<teacherList.size();i++){
				Teacher temp=(Teacher) teacherList.get(i);
				if (temp.getTeaName().equals(name)){
					return temp;
				}
			}
			return null;
	}
	//学生手机号检测
	public Student phoneNumCheck(String stuPhoneNum){
		for (int i=0;i<studentList.size();i++){
			Student temp=(Student) studentList.get(i);
			if (temp.getStuPhoneNum().equals(stuPhoneNum)){
				return temp;
			}
		}
		return null;
	}
	//学生id检测
	public int IDCheck(int stuID){
		for (int i=0;i<studentList.size();i++){
			Student temp=(Student) studentList.get(i);
			if (temp.getStuId()==stuID){
				return i;
			}
		}
		return -1;
	}
	//教师注册
	public int register(String teaName, String teaPass, String teaPhoneNum){
		int index=0;
		if (nameCheck(teaName)==null){
			Teacher teacher=new Teacher(teaName,teaPass,teaPhoneNum);
			teacherList.add(teacher);
			index=1;
		}
		return index;
	}
	//添加学生
	public int addStu(String stuName,String stuPhoneNum,int stuScore){
		int index=0;
		if (phoneNumCheck(stuPhoneNum)==null&&stuScore>0&&stuScore<=100){
			Student student=new Student(stuName,stuPhoneNum,stuScore);
			studentList.add(student);
			index=1;
		}
		return index;
	}
	//修改密码或成绩 重载
	public int modifySomething(String pass,int id) {
		int index = IDCheck(id);
		if (index >= 0) {
			Student student = (Student) studentList.get(index);
				student.setStuPass(pass);
				return 1;
		} else {
				return 0;
			}
		}
	public int modifySomething(int score,int id) {
		int index = IDCheck(id);
		if (index >= 0 && score > 0 && score <= 100) {
				Student student = (Student) studentList.get(index);
				student.setStuScore(score);
				return  1;
		}else {
			return 0;
		}

	}
	//密码检测
	public int passCheck(String name,String pass){
		return nameCheck(name).getTeaPass().equals(pass)?1:0;
	}
	//返回验证码
	public String randomStr(){
		String str="";
		String reStr="";
		for (char c='a';c<='z';c++){
			str+=c;
		}
		for (char c='A';c<='Z';c++){
			str+=c;
		}
		for (char c='0';c<='9';c++){
			str+=c;
		}
		for (int i=0;i<4;i++){
			int rnum=(int) (Math.random()*str.length());
			reStr+=str.charAt(rnum);
		}
		return reStr;

	}
	//删除学生
	public int removeStu(int id){
		int index = IDCheck(id);
		if (index >= 0) {
			studentList.remove(index);
			return 1;
		} else {
			return 0;
		}
	}
	//排序
	public int sortOfStu(){
		for (int i=1;i<studentList.size();i++){
			for (int j=0;j<studentList.size()-i;j++){
				Student student01=(Student) studentList.get(j);
				Student student02=(Student) studentList.get(j+1);
				if (student01.getStuScore()<student02.getStuScore()){
					studentList.swap(j,j+1);
				}
			}
		}
		return 1;
	}
	public MyArrayList getTeacherList(){
			return teacherList;
	}
	public MyArrayList getStudentList(){
			return studentList;

	}

}
