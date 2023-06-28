package test;

public class Calc {

	public int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	public int sub(int a, int b)
	{
		int c=a-b;
		return c;
	}
	public int mul(int a, int b)
	{
		int c=a*b;
		return c;
	}
	public int div(int a, int b)
	{
		int c=a/b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=5;
		Calc c=new Calc();
		System.out.println(c.add(a, b));
		System.out.println(c.sub(a, b));
		System.out.println(c.mul(a, b));
		System.out.println(c.div(a, b));
	}

}
