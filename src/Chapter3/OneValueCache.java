package Chapter3;

import java.math.BigInteger;
import java.util.Arrays;

import net.jcip.annotations.Immutable;

@Immutable
public class OneValueCache {
	private final BigInteger lastNumber;
	private final BigInteger[] lastFactors;
	
	public OneValueCache(BigInteger lastNumber,BigInteger[] lastFactors) {
		this.lastNumber = lastNumber;
		this.lastFactors = lastFactors;
	}
	public BigInteger[] getFactors(BigInteger i) {
		if(lastNumber == null || !lastNumber.equals(i)) {
			return null;
		}else {
			return Arrays.copyOf(lastFactors, lastFactors.length);
		}
	}
}
