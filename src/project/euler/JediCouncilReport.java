package project.euler;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JediCouncilReport {
	
	//Benchmark
	public List<Double> benchmarXAxes;
	public List<Double> benchmarYAxes;
	
	//Padawan Properties
	public String padawanResult;
	public String padawanComplexity;
	public double[]  padawanBenchmarkResult;
	
	//Jedi Knight Properties
	public String jediKnightResult;
	public String jediKnightComplexity;
	public double[]  jediKnightBenchmarkResult;
	
	//Jedi Master Properties
	public String jediMasterResult;
	public String jediMasterComplexity;
	public double[]  jediMasterBenchmarkResult;
	
}
