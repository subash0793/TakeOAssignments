
public class wrapperClassDemo {
	public static void main(String[] args) {
		String s="101";
		int y=Integer.parseInt(s);
		System.out.println(y);
		int z=Integer.valueOf(s);
		System.out.println(z);
		String name="subash";
		int age=20;
		double salary=23.1;
		
		System.out.printf("My name is {fname}, I'm {age}".format( "John",  36));
		System.out.println();
		System.out.printf("{'name': '%s', 'age': %d, 'salary': %f }", name, age,salary);
	}

}
