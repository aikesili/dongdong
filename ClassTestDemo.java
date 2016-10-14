import java.io.*;
import java.lang.reflect.*;
import java.util.*;
public class ClassTestDemo{
	public static void main(String[] args)throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("D:\\clazz.txt")));
		String content="";
		String className="";
		while((content=br.readLine())!=null){
			className=content;
			System.out.println("类名为："+className);
			getInstance(className);
			System.out.println();
		}
	}
	public static Object getInstance(String className)throws Exception{
		
		System.out.println("类"+className+"的构造函数如下：");
		Class clazz=Class.forName(className);
		System.out.println(clazz.newInstance()); 
		Constructor con=clazz.getConstructor(new Class[]{});
		System.out.println(con.newInstance(new Object[]{})); 
		System.out.println("类"+className+"各属性值如下：");
		Field[] fs=clazz.getDeclaredFields();
		for (Field f :fs ) {
			if (f.getModifiers()==Modifier.PRIVATE&&f.getType()==String.class) {
				System.out.println(f);
			}else{
				System.out.println(f);
			}
		}
		System.out.println("类"+className+"的方法如下：");
		Method[] m=clazz.getDeclaredMethods();
		for (Method mm :m ) {
			System.out.println(mm);
		}
		return "以上是类"+className+"的信息";

	}

}
	class Student{
		String name;
		int age;
		private int sex;
		public Student(){}
		public Student(String name,int age){
			this.name=name;
			this.age=age;
		}
		public Student(String name){
			this.name=name;
		}
		public Student(int age){
			this.age=age;
		}
		public void study(){
			System.out.println("学习");
		}
		public String toString(){
			return "名字："+name+" "+"年龄："+age;
		}

	}
	class Teacher{
		String name;
		int age;
		private int sex;
		public Teacher(){}
		public Teacher(String name,int age){
			this.name=name;
			this.age=age;
		}
		public Teacher(String name){
			this.name=name;
		}
		public Teacher(int age){
			this.age=age;
		}
		public void teach(){
			System.out.println("教书");
		}
		public String toString(){
			return "名字："+name+" "+"年龄："+age;
		}

	}