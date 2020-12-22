//this as parameter in method

class Sample
{
	void m(Sample obj)
	{
		System.out.println("method is called");
	}
	
	void p()
	{
		m(this);
	}
	
	public static void main(String...args)
	{
		Sample ob = new Sample();
		ob.p();
	}
}