public class Team {
    private String nameTeam;

    public Team( String nameTeam) {
        this.nameTeam = nameTeam;
    }

     @Override
    public String toString(){
        return "Team: "+ nameTeam ;
    }
}
