package Chapter4;

import java.util.Collections;
import java.util.Map;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.NotThreadSafe;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class MonitorVehicleTracker {
	@GuardedBy("this")
	private final Map<String,MutablePoint> locations;
	
	public MonitorVehicleTracker(Map<String,MutablePoint> locations) {
		this.locations = deepCopy(locations);
	}
	
	private static Map<String,MutablePoint> deepCopy(Map<String,MutablePoint> locations){
		return Collections.unmodifiableMap(locations);
	}
}

@NotThreadSafe
class MutablePoint{
	public int x,y;
	
	public MutablePoint() {
		x = 0;
		y = 0;
	}
	
	public MutablePoint(MutablePoint p) {
		this.x = p.x;
		this.y = p.y;
	}
}