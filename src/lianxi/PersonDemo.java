package lianxi;
class Person{
	public Person(){
		System.out.println("欢迎回来，我的朋友");	
	}
	
	public Person(String name){
		this();
		System.out.println("你的姓名为"+name);	
	}
	public Person(String name,int age){
		this(name);
		System.out.println("hahaha"+"你的年龄为"+age);
		
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
