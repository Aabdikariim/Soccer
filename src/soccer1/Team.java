 package soccer1;
public class Team {
   private String teamName;
   private Player[] playerArray;
   private int pointsTotal;
   private int goalsTotal;
   
   public Team (){};
   public Team (String teamName){
       this.teamName = teamName;
   }
   public Team (String teamName, Player[] playerArray) {
       this(teamName );
       this.playerArray = playerArray;
   }
    public void incPointsTotal(int points){
        this.pointsTotal += points;
    }
    
    public void incGoalsTotal(int goals){
        this.setGoalsTotal(this.getGoalsTotal() + goals);
    }

    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @return the playerArray
     */
    public Player[] getPlayerArray() {
        return playerArray;
    }

    /**
     * @param playerArray the playerArray to set
    */ 
    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }

    /**
     * @return the pointsTotal
     */
    public int getPointsTotal() {
        return pointsTotal;
    }

    /**
     * @param pointsTotal the pointsTotal to set
     */
    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }

    /**
     * @return the goalsTotal
     */
    public int getGoalsTotal() {
        return goalsTotal;
    }

    /**
     * @param goalsTotal the goalsTotal to set
     */
    public void setGoalsTotal(int goalsTotal) {
        this.goalsTotal = goalsTotal;
    }
    

}