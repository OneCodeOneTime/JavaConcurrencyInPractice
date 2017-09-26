package Chapter3;

/**
 * volatile变量的典型用法
 * 检查某个状态以判断是否退出循环
 *
 */
public class VolatileUseCase {
	volatile boolean asleep;
	
	//...
	void isOut() {
		while(!asleep) {
			//do something
		}
	}
}
