package Log1;

public class Maths {

	public void add(int a,int b) {
		
		int c=a+b;
		System.out.println("sum" +c);
		
	}
public void sub(int a,int b) {
		
		int c=a-b;
		System.out.println("sub="+ c);
		
	}
public void mul(int a,int b) {
	
	int c=a*b;
	System.out.println("mul "+ c);
	
}
	
	
	
	public static void main(String[] args) {
		
		Maths m=new Maths();
m.add(10, 2);
m.sub(12, 10);
m.mul(12, 2);
	}

}
