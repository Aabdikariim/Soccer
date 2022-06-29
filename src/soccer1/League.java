package soccer1;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.StringTokenizer;
import utility.PlayerDatabase;
public class League {
    public static void main(String[] args) {
        // TODO code application logic here
        League theLeague = new League();
        
        Team[] theTeams = theLeague.createTeams("The Robins,The Crows,The Swallows",3); 
        Game[] theGames = theLeague.createGames(theTeams);

        PlayerDatabase playerDB = new 	PlayerDatabase();
        
        playerDB.getTeam(9);
        
        System.out.println(theLeague.getLeagueAnnouncement(theGames)); 
        
        
        for (Game currGame : theGames){
            currGame.playGame();
            break; 
           // System.out.println(currGame.getDescription());
        }
        //theLeague.showBestTeam(theTeams);  
    }
    
    public Team[] createTeams (String teamNames, int teamSize){     
    	 PlayerDatabase playerDB =new  PlayerDatabase(); 	 
    	 Team team1 = new Team("The Greens", playerDB.getTeam(3)); 
    	 Team team2 = new Team("The Reds", playerDB.getTeam(3)); 

       
        StringTokenizer teamNameTokens = new  StringTokenizer(teamNames,",");
        Team[] theTeams = new Team[teamNameTokens.countTokens()]; 
        
        for (int i = 0; i < theTeams.length; i++){ 
        	 theTeams[i] = new Team(teamNameTokens.nextToken(), 
        	 playerDB.getTeam(teamSize)); 
        	}
		return theTeams;
    }
    public Game[] createGames (Team[] theTeams){
    	int daysBetweenGames = 0;
    	
    	ArrayList<Game> theGames = new ArrayList<Game>(); 
    	
    	for (Team homeTeam: theTeams) { 
    		 for (Team awayTeam: theTeams) { 
    		 if (homeTeam!=awayTeam) { 
    			 daysBetweenGames += 7;
    			 theGames.add(new Game(homeTeam, awayTeam, LocalDateTime.now().plusDays(daysBetweenGames))); 
    		 } 
    		 } 
    		} 
    	
    	return (Game[]) theGames.toArray( new Game[1] );
        
        //return theGames;
    }       
    
    public void showBestTeam(Team[] theTeams){
        Team currBestTeam = theTeams[0];
        System.out.println("\nTeam Points");
        for(Team currTeam : theTeams){
            System.out.println(currTeam.getTeamName() + ":" + currTeam.getPointsTotal()+ ":" + currTeam.getGoalsTotal());
            if (currTeam.getPointsTotal() > currBestTeam.getPointsTotal()) {
                currBestTeam = currTeam;
            }
            else if (currTeam.getPointsTotal() == currBestTeam.getGoalsTotal()){
                if (currTeam.getGoalsTotal() > currBestTeam.getGoalsTotal()) {
                    currBestTeam = currTeam;
                }
            }
        }    
        System.out.println("The winner of the league is " + currBestTeam.getTeamName());
        
    }
    public String getLeagueAnnouncement(Game[] theGames){ 
    	
    	
    	Period thePeriod = 
        Period.between(theGames[0].getTheDateTime().toLocalDate(), 
        theGames[theGames.length - 1].getTheDateTime().toLocalDate()); 
    	
    	return "The League is scheduled to run for " + 
    	 thePeriod.getMonths() + " month(s), and " + 
    	 thePeriod.getDays() + " day(s)\n";	 	
    } 

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    