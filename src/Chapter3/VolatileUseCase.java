package Chapter3;

/**
 * volatile�����ĵ����÷�
 * ���ĳ��״̬���ж��Ƿ��˳�ѭ��
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
