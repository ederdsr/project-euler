package project.euler.solutions;

import java.util.ArrayList;

import project.euler.JediSolution;
import project.euler.util;

public class p001 extends JediSolution {
	
	public p001() {
		this.benchmarkArgs = new ArrayList<String[]>();
		
		this.benchmarkArgs.add(new String[] {"1000"});
		this.benchmarkArgs.add(new String[] {"10000"});
		this.benchmarkArgs.add(new String[] {"100000"});
		this.benchmarkArgs.add(new String[] {"1000000"});
		this.benchmarkArgs.add(new String[] {"10000000"});
	}
	
	@Override
	public String padawan(String[] args) {
		long sum = 0;
		int i = 0;
		while(i < Integer.valueOf(args[0])) {
			if (i%3 == 0 || i%5 == 0) {
				sum += i;
			}
			i++;
		}
		
		return Long.toString(sum);
	}

	@Override
	public String jediKnight(String[] args) {
		long result = util.sumArithmeticSeries(3, 3, 999) + util.sumArithmeticSeries(5, 5, 995) - util.sumArithmeticSeries(15, 15, 990);
		return Long.toString(result);
	}

	@Override
	public String jediMaster(String[] args) {
		long result = util.sumDivisibleBy(3, 999) + util.sumDivisibleBy(5, 999) - util.sumDivisibleBy(15, 999);
		return Long.toString(result);
	}
}
