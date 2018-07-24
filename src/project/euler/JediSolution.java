package project.euler;

import java.util.ArrayList;
import java.util.List;

public abstract class JediSolution {
	
	protected List<String[]> benchmarkArgs;
	protected String padawanComplexity;
	protected String jediKnightComplexity;
	protected String jediMasterComplexity;
	
	public String padawan(String[] args) {
		return null;
	}
	
	public String jediKnight(String[] args) {
		return null;
	}
	
	public String jediMaster(String[] args) {
		return null;
	}
	
	public void mayTheForceBeWithYou() {
		System.out.println(fight("Padawan", this.benchmarkArgs.get(0)));
		System.out.println(fight("Jedi Knight", this.benchmarkArgs.get(0)));
		System.out.println(fight("Jedi Master", this.benchmarkArgs.get(0)));
	}
	
	public JediResult fight(String position, String[] args) {
		
		double initialTime;
		JediResult jediResult = new JediResult();
		jediResult.setPosition(position);
		
		switch (position) {
			case "Padawan":
				initialTime = System.nanoTime();
				jediResult.setResult(padawan(args));
				jediResult.setDuration(System.nanoTime() - initialTime);
				break;
			case "Jedi Knight":
				initialTime = System.nanoTime();
				jediResult.setResult(jediKnight(args));
				jediResult.setDuration(System.nanoTime() - initialTime);
				break;
			case "Jedi Master":
				initialTime = System.nanoTime();
				jediResult.setResult(jediMaster(args));
				jediResult.setDuration(System.nanoTime() - initialTime);
				break;
		}
		
		return jediResult;
	}
	
	public JediCouncilReport jediCouncilReport() {
		
		JediCouncilReport jediCouncilReport = new JediCouncilReport();
		jediCouncilReport.benchmarXAxes = new ArrayList<Double>();
		
		jediCouncilReport.padawanResult = padawan(this.benchmarkArgs.get(0));
		jediCouncilReport.padawanComplexity = this.padawanComplexity;
		
		jediCouncilReport.jediKnightResult = jediKnight(this.benchmarkArgs.get(0));
		jediCouncilReport.jediKnightComplexity = this.jediKnightComplexity;
		
		jediCouncilReport.jediMasterResult = jediMaster(this.benchmarkArgs.get(0));
		jediCouncilReport.jediMasterComplexity = this.jediMasterComplexity;
		
		jediCouncilReport.padawanBenchmarkResult = new double[this.benchmarkArgs.size()];
		jediCouncilReport.jediKnightBenchmarkResult = new double[this.benchmarkArgs.size()];
		jediCouncilReport.jediMasterBenchmarkResult = new double[this.benchmarkArgs.size()];

		//Benchmarking
		for (int i = 0; i < this.benchmarkArgs.size(); i++) {
			String[] args = benchmarkArgs.get(i);
			jediCouncilReport.benchmarXAxes.add(Double.parseDouble(args[0]));
			jediCouncilReport.padawanBenchmarkResult[i]    = fight("Padawan", args).duration;
			jediCouncilReport.jediKnightBenchmarkResult[i] = fight("Jedi Knight", args).duration;
			jediCouncilReport.jediMasterBenchmarkResult[i] = fight("Jedi Master", args).duration;
		}
		
		return jediCouncilReport;
	}
}
