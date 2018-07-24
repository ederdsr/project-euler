
//import org.codehaus.jackson.map.ObjectMapper;
//import org.codehaus.jackson.map.ObjectWriter;

import project.euler.JediCouncilReport;
import project.euler.solutions.*;

public class run {
	public static void main(String[] args) {
		
//		p001 p001 = new p001();
//		p001.mayTheForceBeWithYou();
//		
//		JediCouncilReport jediCouncilReport = p001.jediCouncilReport();
//		
//		//ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//		//String json = ow.writeValueAsString(jediCouncilReport);
//		for (int i = 0; i < 5; i++) {
//			System.out.println(jediCouncilReport.padawanBenchmarkResult[i]/1000000);
//			System.out.println(jediCouncilReport.jediKnightBenchmarkResult[i]/1000000);
//			System.out.println(jediCouncilReport.jediMasterBenchmarkResult[i]/1000000);
//		}
		
		p002 p002 = new p002();
		p002.mayTheForceBeWithYou();
		JediCouncilReport jediCouncilReport = p002.jediCouncilReport();
		
		for (int i = 0; i < 5; i++) {
		
			System.out.println(jediCouncilReport.padawanBenchmarkResult[i]/1000000);
			System.out.println(jediCouncilReport.jediKnightBenchmarkResult[i]/1000000);
			System.out.println(jediCouncilReport.jediMasterBenchmarkResult[i]/1000000);
		
		}
	}
}
