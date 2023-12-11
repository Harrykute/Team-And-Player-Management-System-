package IPLTeam;

import java.util.Objects;

public class Player {

	private int teamCode;
	private String playerName;
	
	
	
	public Player() {
		
	}
	public Player(int teamCode, String playerName) {
		
		this.teamCode = teamCode;
		this.playerName = playerName;
	}
	public int getTeamCode() {
		return teamCode;
	}
	public void setTeamCode(int teamCode) {
		this.teamCode = teamCode;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	@Override
	public String toString() {
		return "Player [teamCode=" + teamCode + ", playerName=" + playerName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(playerName, teamCode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(playerName, other.playerName) && teamCode == other.teamCode;
	}
	
	
	
	
	
	
}
