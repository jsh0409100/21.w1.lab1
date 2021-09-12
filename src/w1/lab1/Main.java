package w1.lab1;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student s = new Student();
		s.setNo(1);
		s.setName("saehee");
		s.setAge(20);
		list.add(s);
		
		list.add(new Student(2, "Youjin", 22));
		
		System.out.println("size of the list: " + list.size());
		System.out.println("\n <List of students>");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());	
		}
		
		System.out.println("\n <Removed result>");
		list.remove(1);
		for(Student ss: list) {
			System.out.println(ss.toString());	
		}
		
	}
}
