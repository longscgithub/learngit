

public class gouzaoqi {
String name;
   int age;
   int gender;
	public static void person1() {
		System.out.println("");
		
	}


public gouzaoqi (String name) {
       System.out.println("有一个对象创建了");
       this.name=name;
	
}

public gouzaoqi (String name,int age) {
    System.out.println("第二个对象");
    this.name=name;
    this.age=age;
}
	

public gouzaoqi (String name,int age,int gender) {
	System.out.println("第三个对象");
	this.name=name;
    this.age=age;
    this.gender=gender;
		
}
	public static void name() {
		System.out.println("person,name");
		System.out.println("person,age");
		System.out.println("person,gender");
	}
  
	
}
