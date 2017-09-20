package Chapter2;

import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
public class LazyInitRace {
	private LazyInitRace instance = null;
	
	//�����ڵ���ģʽ���������أ�����������̲߳���ȫ
	public LazyInitRace getInstance() {
		if(null == instance) {
			instance = new LazyInitRace();
		}
		return instance;
	}
}
