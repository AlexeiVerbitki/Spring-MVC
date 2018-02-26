package Udemy_java_the_complete_java_developer_course._11_Generics;

import java.util.ArrayList;

public class League_Table<T extends Team> {
    String leagueName;
    ArrayList<T> league = new ArrayList<>();

    public League_Table(String leagueName) {
        this.leagueName = leagueName;
    }

    public void addTeam(T team) {
        if (!league.contains(team))
            league.add(team);
        else
            System.out.printf("\nYou tried to add %s  but it's  already in the league\n", team.name);
    }
}
