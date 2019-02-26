package demo;

/***执行顺序
 * 1. 父类静态对象（包括静态块、静态成员，按照两者出现的先后顺序执行）
 * 2. 当前类静态对象（包括静	态块、静态成员，按照两者出现的先后顺序执行）
 * 3. 主函数
 * 4. 父类非静态对象（包括构造块、成员变量，按照两者出现的先后顺序执行）
 * 5. 父类构造方法
 * 6. 当前类非静态对象（包括构造块、成员变量，按照两者出现的先后顺序执行）
 * 7. 当前类构造方法
 */

public class Demo01 extends Test{

	public int a = printA();
	
	/**
	 * 构造块
	 */
	{
		System.out.println("main构造块");
	}
	
	/**
	 * 静态块
	 */
	static {
		System.out.println("main静态块");
	}
	
	public static int num = print();
	
	public Demo01() {
		System.out.println("main构造方法");
	}
	
	public static int print() {
		System.out.println("main静态变量");
		return 250;
	}
	private int printA() {
		System.out.println("main成员变量");
		return 255;
	}
	
	/**
	 * 主函数
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("main start...");
//		Test t1 = new Test();
		Demo01 d = new Demo01();
	}
}



/**
 * 父类
 * @author boss
 *
 */
class Test{
	
	/**
	 * 静态块
	 */
	static {
		System.out.println("test静态块1");
	}
	
	public int a = printA();
	public static int num = print();
	
	/**
	 * 构造块
	 */
	{
		System.out.println("test构造块");
	}
	
	public String b = printB();
	
	/**
	 * 静态块
	 */
	static {
		System.out.println("test静态块2");
	}
	
	/**
	 * 构造方法
	 */
	public Test() {
		System.out.println("test无参构造方法");
	}
	
	/**
	 * 构造方法
	 * @param x
	 */
	public Test(int x) {
		this.a = x;
		System.out.println("test有参构造方法");
	}
			
	/**
	 * 静态方法
	 * @return
	 */
	public static int print() {
		System.out.println("test静态变量");
		return 521;
	}
	
	/**
	 * 私有方法
	 * @return
	 */
	private int printA() {
		System.out.println("test成员变量1");
		return 255;
	}
	
	/**
	 * 私有方法
	 * @return
	 */
	private String printB() {
		System.out.println("test成员变量2");
		return "hello";
	}
}


/***执行结果
test静态块1
test静态变量
test静态块2
main静态块
main静态变量
main start...
test成员变量1
test构造块
test成员变量2
test无参构造方法
main成员变量
main构造块
main构造函数
 */
