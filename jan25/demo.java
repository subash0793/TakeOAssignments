package jan25;

public class demo {

	int number;
	String s;
	
	public demo(){
	//this is a default constructor	
	}
	public demo(int number, String s) { //this is overloaded constructor
		this.number=number; //here this keyword refers to the instance variable and the number is brown 
							//is refering to the local variable that is passed in the constructor argument
		this.s=s;
	}
	
	
	void print() {
		System.out.println(this.number + " "+ this.s);
	}
	
	//method to copy the constructor
	public demo(demo demoEx){
		number=demoEx.number;
		s=demoEx.s;
	}
	
	public static void main(String[] args) {
	System.out.println("Demo");
	System.out.println("lets check out default constructor");
	
	demo d=new demo();
	
	System.out.println(d.number);
	System.out.println(d.s);
	
	System.out.println("lets check out overloade constructor ");
	demo d1=new demo(101,"Subash");
	d1.print();
	
	System.out.println("now lets check ways to copy the constructor using literal");
	demo d2=new demo();
	d2.number=d1.number;
	d2.s=d1.s;
	d2.print();
	
	System.out.println("Now lets check ways to copy the constructor using other constructor");
	d2.number=500;
	d2.s="gautam";
	demo d3=new demo(d2);
	d3.print();
	
}
}
