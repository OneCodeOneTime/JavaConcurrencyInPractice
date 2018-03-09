package Chapter4;

import net.jcip.annotations.GuardedBy;

/**
 * 通过一个私有锁来保护状态
 * @author dell
 *
 */
public class PrivateLock {
	private final Object myLock = new Object();
	
	@GuardedBy("myLock")
	Widget widget;
	
	void someMethod() {
		synchronized(myLock) {
			//修改或访问widget的状态
		}
	}
}

class Widget{}