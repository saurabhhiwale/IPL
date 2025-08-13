package entity;

public class Team {
	
	private int id;
	private String teamName;
	private String captainName;
	private String coachName;
	private boolean isQualified;
	private float nRR;
	private String shortName;
	
	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", teamName=" + teamName + ", captainName=" + captainName + ", coachName=" + coachName
				+ ", isQualified=" + isQualified + ", nRR=" + nRR + ", shortName=" + shortName + "]";
	}

	//Getter - Setter
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCaptainName() {
		return captainName;
	}
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	public boolean isQualified() {
		return isQualified;
	}
	public void setQualified(boolean isQualified) {
		this.isQualified = isQualified;
	}
	public float getnRR() {
		return nRR;
	}
	public void setnRR(float nRR) {
		this.nRR = nRR;
	}
}
