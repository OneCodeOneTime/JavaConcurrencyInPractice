package Chapter3;

import java.util.HashSet;
import java.util.Set;

import net.jcip.annotations.Immutable;

@Immutable
public final class ThreadStooges {
	private final Set<String> stooges = new HashSet<String>();
	
	public ThreadStooges() {
		stooges.add("Moe");
		stooges.add("Larry");
		stooges.add("Curly");
	}
	public boolean isStooge(String name) {
		return stooges.contains(name);
	}
}
