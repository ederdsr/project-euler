package project.euler.solutions;

import java.util.ArrayList;

import project.euler.JediSolution;
import project.euler.util;

public class p002 extends JediSolution {
	
	public p002() {
		this.benchmarkArgs = new ArrayList<String[]>();
		
		this.benchmarkArgs.add(new String[] {"4000000"});
		this.benchmarkArgs.add(new String[] {"4000000000"});
		this.benchmarkArgs.add(new String[] {"4000000000000"});
		this.benchmarkArgs.add(new String[] {"4000000000000000"});
		this.benchmarkArgs.add(new String[] {"4000000000000000000"});
	}
	
	@Override
	public String padawan(String[] args) {
		long sum = 0;
		
		long tn = 1;
		long tnOneLess = 1;
		long tnTwoLess = 1;
		
		while(tn < Long.valueOf(args[0])) {	
			tn = tnOneLess + tnTwoLess;
			
			if (tn%2 == 0) {
				sum += tn;
			}
			
			tnTwoLess = tnOneLess;
			tnOneLess = tn;
		}
		return Long.toString(sum);
	}
	
	@Override
	public String jediKnight(String[] args) {
		long numTermsFib = util.numTermsFib(Long.valueOf(args[0]));
		return Long.toString(sumEvenFibUnitlN(numTermsFib, 3, 0));
	}
	
	public long sumEvenFibUnitlN(long n, int start, long sumResult) {
		if (start > n) {
			return sumResult;
		}
		
		sumResult += util.termFib(start);
		
		return sumEvenFibUnitlN(n, start+3, sumResult);
	}

	@Override
	public String jediMaster(String[] args) {
		return Long.toString(sumEvenFib(3, Long.valueOf(args[0]), 0));
	}
	
	public long sumEvenFib(int nth, long limit, long sumResult) {
		
		long nthValue = util.termFib(nth);
		
		if (nthValue > limit) {
			return sumResult;
		}
		
		sumResult += nthValue;
		
		return sumEvenFib(nth+3, limit, sumResult);
	}
}
