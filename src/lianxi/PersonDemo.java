package lianxi;
class Person{
	public Person(){
		System.out.println("��ӭ�������ҵ�����");	
	}
	
	public Person(String name){
		this();
		System.out.println("�������Ϊ"+name);	
	}
	public Person(String name,int age){
		this(name);
		System.out.println("hahaha"+"�������Ϊ"+age);
		
	}
	
}

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person("zhangsan");
		Person p3 = new Person("lisi",18);
	}

}
