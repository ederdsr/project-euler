package project.euler;

public class JediResult {
	
	public String position;
	public String result;
	public double duration;
	
	@Override
	public String toString() {
		return this.position + " Solution: " + this.result + " Duration: " + this.duration/1000000 + " milliseconds";
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	
}
