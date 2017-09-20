package Chapter2;
/*
 * 可以发现，调用父类的方法的依然是子类对象，说明只有一个对象，即只有一把对象内置锁，
 * 所以子类的synchronized方法调用父类的synchronized方法是同一把锁的操作，
 * 锁是可重入的。
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
