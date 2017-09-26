package Chapter3;

import java.util.HashSet;
import java.util.Set;

/**
 * 发布一个对象
 * 最简单的发布一个对象的方法是将对象的引用保存在一个公有的静态变量中
 *
 */
public class Publish {
	public static Set<Integer> integers;
	
	public void initialize() {
		integers = new HashSet<Integer>();
	}
}
