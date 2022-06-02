class BlockTest {
	
	int a,b,c;
	static {
		System.out.println("static { }");
	}
	
	{
		System.out.println("{ }");
		a = 10;
		b = 20;
		c = 30;
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}
	
	public void func() {
		System.out.println("num :");
	}
	
	public void func2() {
		func();
		System.out.println("num :");
	}
	
	public static void main(String[] args) {

		System.out.println("BlockTest bt = new BlockTest(); ");
		
		BlockTest bt = new BlockTest();
		
	
		System.out.println("BlockTest bt = new BlockTest(); ");
	
		BlockTest bt2 = new BlockTest();
		System.out.println(bt2.a);
	
	
	
	}

}
