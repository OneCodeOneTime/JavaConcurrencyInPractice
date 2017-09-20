package Chapter2;
/*
 * ���Է��֣����ø���ķ�������Ȼ���������˵��ֻ��һ�����󣬼�ֻ��һ�Ѷ�����������
 * ���������synchronized�������ø����synchronized������ͬһ�����Ĳ�����
 * ���ǿ�����ġ�
 */
public class LoggingWidget extends Widget{
	public static void main(String...args) {
		new LoggingWidget().doSomething();
	}
	public synchronized void doSomething() {
		System.out.println("calling doSomething");
		System.out.println(this);
		super.doSomething();
	}
}

class Widget{
	public synchronized void doSomething() {
		System.out.println(this);
	}
}
