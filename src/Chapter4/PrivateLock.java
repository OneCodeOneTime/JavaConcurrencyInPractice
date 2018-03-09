package Chapter4;

import net.jcip.annotations.GuardedBy;

/**
 * ͨ��һ��˽����������״̬
 * @author dell
 *
 */
public class PrivateLock {
	private final Object myLock = new Object();
	
	@GuardedBy("myLock")
	Widget widget;
	
	void someMethod() {
		synchronized(myLock) {
			//�޸Ļ����widget��״̬
		}
	}
}

class Widget{}