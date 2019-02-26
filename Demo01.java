package demo;

/***ִ��˳��
 * 1. ���ྲ̬���󣨰�����̬�顢��̬��Ա���������߳��ֵ��Ⱥ�˳��ִ�У�
 * 2. ��ǰ�ྲ̬���󣨰�����	̬�顢��̬��Ա���������߳��ֵ��Ⱥ�˳��ִ�У�
 * 3. ������
 * 4. ����Ǿ�̬���󣨰�������顢��Ա�������������߳��ֵ��Ⱥ�˳��ִ�У�
 * 5. ���๹�췽��
 * 6. ��ǰ��Ǿ�̬���󣨰�������顢��Ա�������������߳��ֵ��Ⱥ�˳��ִ�У�
 * 7. ��ǰ�๹�췽��
 */

public class Demo01 extends Test{

	public int a = printA();
	
	/**
	 * �����
	 */
	{
		System.out.println("main�����");
	}
	
	/**
	 * ��̬��
	 */
	static {
		System.out.println("main��̬��");
	}
	
	public static int num = print();
	
	public Demo01() {
		System.out.println("main���췽��");
	}
	
	public static int print() {
		System.out.println("main��̬����");
		return 250;
	}
	private int printA() {
		System.out.println("main��Ա����");
		return 255;
	}
	
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("main start...");
//		Test t1 = new Test();
		Demo01 d = new Demo01();
	}
}



/**
 * ����
 * @author boss
 *
 */
class Test{
	
	/**
	 * ��̬��
	 */
	static {
		System.out.println("test��̬��1");
	}
	
	public int a = printA();
	public static int num = print();
	
	/**
	 * �����
	 */
	{
		System.out.println("test�����");
	}
	
	public String b = printB();
	
	/**
	 * ��̬��
	 */
	static {
		System.out.println("test��̬��2");
	}
	
	/**
	 * ���췽��
	 */
	public Test() {
		System.out.println("test�޲ι��췽��");
	}
	
	/**
	 * ���췽��
	 * @param x
	 */
	public Test(int x) {
		this.a = x;
		System.out.println("test�вι��췽��");
	}
			
	/**
	 * ��̬����
	 * @return
	 */
	public static int print() {
		System.out.println("test��̬����");
		return 521;
	}
	
	/**
	 * ˽�з���
	 * @return
	 */
	private int printA() {
		System.out.println("test��Ա����1");
		return 255;
	}
	
	/**
	 * ˽�з���
	 * @return
	 */
	private String printB() {
		System.out.println("test��Ա����2");
		return "hello";
	}
}


/***ִ�н��
test��̬��1
test��̬����
test��̬��2
main��̬��
main��̬����
main start...
test��Ա����1
test�����
test��Ա����2
test�޲ι��췽��
main��Ա����
main�����
main���캯��
 */
