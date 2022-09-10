package info.sample.prgs;

public class FunctionalInfImpl implements FunctionalInf {

	@Override
	public int sum(int a, int b) {
		return a+b;
	}
	
	/*
	 * default int multiply(int a, int b) { return a*b; }
	 */
	static int divide(int a, int b) {
		return a/b;
	}

}
