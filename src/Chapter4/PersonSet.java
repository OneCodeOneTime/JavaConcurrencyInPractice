package Chapter4;

import java.util.HashSet;
import java.util.Set;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class PersonSet {
	@GuardedBy("this")
	private final Set<Person> myset = new HashSet<Person>();
	
	public synchronized void addPerson(Person p) {
		myset.add(p);
	}
	public synchronized boolean containsPerson(Person p) {
		return myset.contains(p);
	}
	
}
class Person {}
