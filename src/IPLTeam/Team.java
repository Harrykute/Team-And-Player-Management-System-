package IPLTeam;

import java.util.Objects;

public class Team {

	private int teamCode;
	private String teamName;

	
	public Team() {
		
	}
	
	public Team(int teamCode, String teamName) {
		this.teamCode = teamCode;
		this.teamName = teamName;
	}
	

	public int getTeamCode() {
		return teamCode;
	}

	public void setTeamCode(int teamCode) {
		this.teamCode = teamCode;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Team [teamCode=" + teamCode + ", teamName=" + teamName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(teamCode, teamName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		return teamCode == other.teamCode && Objects.equals(teamName, other.teamName);
	}
	
	
}
