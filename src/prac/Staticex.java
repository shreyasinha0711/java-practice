package prac;

class Student {
	String name;
	int age;
	static int Noofstudents = 0;
	Student(){
		Noofstudents++;
	}
	
	public static int getnoofStudent(){
		return Noofstudents;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class Staticex {

	public static void main(String[] args) {
		Student tom = new Student();
		Student mark = new Student();
		Student marka = new Student();
		System.out.println(Student.getnoofStudent());
		
	}

}
