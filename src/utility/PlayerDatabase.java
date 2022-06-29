package utility;
import java.util.*;
import soccer1.Player;
public class PlayerDatabase {
	
	private ArrayList <Player> players; 

	 
	
	public PlayerDatabase() {
		
		StringTokenizer authorTokens =  new StringTokenizer(authorList, ",");
		
		//ArrayList players.players= new ArrayList<Player>();
		

		while (authorTokens.hasMoreTokens()) { 
			 players.add(new Player(authorTokens.nextToken())); 
			}
		
	} 	
	public Player[] getTeam(int numberOfPlayers){ 
		
		Player[] teamPlayers = new Player[numberOfPlayers];
		
		for (int i = 0; i < numberOfPlayers; i++) {
			
			int playerIndex = (int) (Math.random()*players.size()); 
			teamPlayers[i] = players.get(playerIndex); 
			players.remove(playerIndex);
			
		}
		return teamPlayers;		
	} 

}
