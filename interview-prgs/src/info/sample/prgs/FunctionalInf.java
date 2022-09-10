package info.sample.prgs;

@FunctionalInterface
public interface FunctionalInf {
	
	public int sum(int a, int b);
	default int multiply(int a, int b) {
		return a*b;
	}
	static int divide(int a, int b) {
		return a>b ? a/b : b/a;
	}

}
