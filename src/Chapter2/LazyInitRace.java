package Chapter2;

import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
public class LazyInitRace {
	private LazyInitRace instance = null;
	
	//类似于单例模式的懒汉加载，很明显这个线程不安全
	public LazyInitRace getInstance() {
		if(null == instance) {
			instance = new LazyInitRace();
		}
		return instance;
	}
}
