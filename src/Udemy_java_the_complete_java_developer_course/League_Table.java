package Udemy_java_the_complete_java_developer_course;

import Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_7_Arrays.ArrayListCollection;

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
