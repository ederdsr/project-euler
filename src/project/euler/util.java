package project.euler;

public class util {
	
	public static long sumArithmeticSeries(int d, int a1, int an) {
		int n = (an - a1 + d)/d;
		return n*(a1+an)/2;
	}
	
	public static long sumDivisibleBy(int n, int limit) {
		int p = limit/n;
		return n*(p*(p+1))/2;
	}
	
	/*
	 *  Returns the number of terms fibonacci until limit.
	 */
	public static int numTermsFib(long limit) {
		return (int)(Math.log(Math.sqrt(5)*limit)/Math.log((1+Math.sqrt(5))/2));
	}
	
	/*
	 *  Returns the nth fibonacci number.
	 * 
	 *  The Binet Formula
	 *	Let φ be the golden section equal to [1+sqrt(5)]/2. Then the explicit formula for F(n) is
	 *	F(n) = [ φn - (-1/φ)n ]/sqrt(5)
	 */
	public static long termFib(int num){ 
	    double phi= (1+Math.sqrt(5))/2;
	    return (long)((Math.pow(phi,num)-Math.pow(1-phi,num))/Math.sqrt(5)); //finding fibonnaci number using formula.
    }
}
