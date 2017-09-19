package Chapter1;

import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
public class UnsafeSequence {
	private int value;
	
	/**
	 * 返回一个唯一的数值
	 */
	public int getNext() {
		//多个线程可能同时访问，可能同时为它+1。
		return value++;
	}
}
