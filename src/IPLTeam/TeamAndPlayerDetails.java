package IPLTeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TeamAndPlayerDetails {

	
	private static Player[] players;
	private static Team team ;
	
	public void CreateNew() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Team Code");
		int teamCode = sc.nextInt();
		System.out.println("Enter the Team Name");
		String teamName = sc.next();
		team = new Team(teamCode,teamName);

	}
	public  void addPlayer(int teamCode) throws TeamCodeNotFound {
		TeamCodeNotFound tm = new TeamCodeNotFound("Team Code Does not Exist",teamCode);
		Scanner sc = new Scanner(System.in);
		if(teamCode == team.getTeamCode()) {
			System.out.println("Enter the Size Of Players");
			int size = sc.nextInt();	
			players = new Player[size];
			for (int i =0 ; i<players.length;i++) {
			 System.out.println("Enter the Name Of Player");
			 String Name = sc.next();
				 players[i] = new Player(teamCode, Name);
			}
		}
		else {
			
			throw tm;
		}

	}
	
	public  void showAllPlayers() {
		
		for (Player player : players) {
			System.out.println("Team Name :"+team.getTeamName()+" "+player);
		}
	}
}
