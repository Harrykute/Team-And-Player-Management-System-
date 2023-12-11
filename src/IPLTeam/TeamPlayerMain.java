package IPLTeam;

import java.util.Scanner;

public class TeamPlayerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1. Create New team");
			System.out.println("2. Add Player");
			System.out.println("3. Show All Players");
			System.out.println("4. Exit");
			System.out.println("Enter the Choice ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:TeamAndPlayerDetails create = new TeamAndPlayerDetails();
			       create.CreateNew();
				   break;
			case 2:
		             try {
		            	 System.out.println("Enter the teamCode");
					       int teamCode = sc.nextInt();
						   TeamAndPlayerDetails add = new TeamAndPlayerDetails();
				            add.addPlayer(teamCode); 
				            
		    		} catch (TeamCodeNotFound e) {
		    			// TODO Auto-generated catch block
		    			//e.printStackTrace();
		    			String message = e.getMessage();
		    			System.out.println(message);
		    		}
			break;
			
			case 3:TeamAndPlayerDetails showAll = new TeamAndPlayerDetails();
		           showAll.showAllPlayers();
			break;
			
			case 4:System.exit(0);
			break;

			default:
				break;
			}

		}
		
		
		
	}
}
