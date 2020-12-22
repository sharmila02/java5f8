public class ShadowingTest
{
	static int x;
	int y;

	void methodOne(int x, int y)
	{
		ShadowingTest.x = x; //accessing the hidden static variable using class name
		//x = x;
		System.out.println(x);
		this.y = y;//accessing hidden instance variable using this keyword
		//y = y;
		System.out.println(y);
		
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String...args)
	{
		ShadowingTest shadow = new ShadowingTest();
		shadow.methodOne(30, 40);
		shadow.display();
	}
}