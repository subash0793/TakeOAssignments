package takeOAssignments18;

/*
 * 1) WAP to swap three numbers with temp variable.
2) WAP to swap three numbers without temp variable.
1) WAP to swap four numbers with temp variable.
1) WAP to swap four numbers without temp variable.
 */

public class swapping {
public static void main(String[] args) {
	//swapThreeWithTemp(3,5,7);
	//swapThreeWithoutTemp(3,5,7);
	
	//swapFourNumwithTemp(3,4,5,6);
	swapFourNumwithoutTemp(2,3,4,5);

}
public static void swapThreeWithTemp(int a, int b, int c) {
	System.out.println("a:"+a);
	System.out.println("b: "+b);
	System.out.println("c" +c);
	int temp;
	temp=a;
	a=b;
	b=c;
	c=temp;
	
	System.out.println("a:"+a);
	System.out.println("b: "+b);
	System.out.println("c" +c);
}

public static void swapThreeWithoutTemp(int a, int b, int c) {
	System.out.println("a:"+a);
	System.out.println("b: "+b);
	System.out.println("c" +c);
		a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
	System.out.println("a:"+a);
	System.out.println("b: "+b);
	System.out.println("c" +c);
}

public static void swapFourNumwithTemp(int a, int b, int c, int d) {
	System.out.println("a:"+a);
	System.out.println("b: "+b);
	System.out.println("c" +c);
	System.out.println("d" +d);
	int temp=a;
	a=b;
	b=c;
	c=d;
	d=temp;
	System.out.println("a:"+a);
	System.out.println("b: "+b);
	System.out.println("c" +c);
	System.out.println("d" +d);
}
public static void swapFourNumwithoutTemp(int a, int b, int c, int d) {
	System.out.println("a:"+a);
	System.out.println("b: "+b);
	System.out.println("c" +c);
	System.out.println("d" +d);
	a=a+b+c+d;
	b=a-(b+c+d);
	c=a-(b+c+d);
	d=a-(b+c+d);
	a=a-(b+c+d);
	
	System.out.println("a:"+a);
	System.out.println("b: "+b);
	System.out.println("c" +c);
	System.out.println("d" +d);
}
}
