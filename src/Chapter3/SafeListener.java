package Chapter3;

/**
 * 使用工厂方法防止this引用在构造过程中逸出
 * @author dell
 *
 */
public class SafeListener {
	/*
	private final EventListener listener;
	
	private SafeListener() {
		listener = new EventListener() {
			public void onEvent(Event e) {
				doSomthing(e);
			}
		};
	}
	
	public static EventListener newInstance(EventSource source){
		SafeListener safe = new SafeListener();
		source.registerListener(safe.listener);
		return safe;
	}
	*/
}
