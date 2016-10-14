import java.lang.reflect.*;
public class FieldDemo{
	public static void main(String[] args)throws Exception {
		Class clazz=Class.forName("Student");
		Object o=clazz.newInstance();//Student的实例对象
		Field f=clazz.getDeclaredField("age");//获取指定属性名的Field的对象
		System.out.println(f);
		//获取非静态属性值，需要传入一个实例对象，因为非静态的的属性的引用是对象的this


        //获取属性值
		//如果属性是静态的，可以传入一个实例对象或者类对象
		//如果属性是非静态的，可以传入一个实例对象
		int age=f.getInt(o);//属性的值，相当于获取o.age
		System.out.println(age);

		//修改属性值
		//如果属性是静态的，可以传入一个实例对象或者类对象
        //如果属性是非静态的，可以传入一个实例对象
		f.set(o,66);//修改实例对象的属性值
		System.out.println(o);
	}
}
// class Student{
// 	String name;
// 	int age;
// 	public Student(){}
// 	public Student(String name){
// 		this.name=name;
// 	}
// 	public Student(String name,int age){
// 		this.name=name;
// 		this.age=age;
// 	}
// 	public String toString(){
// 		return "名字："+name+" "+"年龄："+age;
// 	}
// 	public void study(){
// 		System.out.println("学习");
// 	}
// }