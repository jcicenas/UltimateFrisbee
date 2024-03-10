import java.util.ArrayList;
import java.util.HashSet;

public class UltimateTeam {
    ArrayList<UltimatePlayer> players;
    ArrayList<Coach> coaches;

    public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches){
        this.players = players;
        this.coaches = coaches;
    }

    public String getCutters(){
        String temp = "";
        for (UltimatePlayer player : players) {
            if (player.getPosition().equals("cutter")) {
                temp = temp + player.toString() + "\n";
            }
        }
        return temp;
    }

    public String getHandlers(){
        String temp = "";
        for (UltimatePlayer player : players) {
            if (player.getPosition().equals("handler")) {
                temp = temp + player.toString() + "\n";
            }
        }
        return temp;
    }

    public String toString(){
        String temp = "Coaches\n";
        String temp2 = "Players\n";
        for (Coach coach : coaches) {
            temp = temp + coach.toString() + "\n";
        }

        for (UltimatePlayer player : players) {
            temp2 = temp2 + player.toString() + "\n";
        }

        return temp + temp2;
    }
}
