package Chapter3;

/**
 * 使内部的可变状态逸出
 * @author dell
 *
 */
public class UnsafeStates {
	private String[] states = new String[] {
			"AK","AL"
	};
	public String[] getStates() {
		return states;
	}
}
