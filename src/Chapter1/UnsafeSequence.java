package Chapter1;

import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
public class UnsafeSequence {
	private int value;
	
	/**
	 * ����һ��Ψһ����ֵ
	 */
	public int getNext() {
		//����߳̿���ͬʱ���ʣ�����ͬʱΪ��+1��
		return value++;
	}
}
