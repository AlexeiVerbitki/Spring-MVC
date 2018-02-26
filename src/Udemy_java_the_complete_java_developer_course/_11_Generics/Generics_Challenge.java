package Udemy_java_the_complete_java_developer_course._11_Generics;

import java.util.Comparator;

public class Generics_Challenge {
    public static void main(String[] args) {
        Football realMadrid = new Football("Real Madrid");
        Football barselona = new Football("Barselona");
        Football arsenal = new Football("Arsenal");
        Football sherif = new Football("Sherif");

        Baseball cubs = new Baseball("Cubs");
        realMadrid.ranking(4, 3, barselona);
        realMadrid.ranking(2, 2, barselona);
        arsenal.ranking(2, 2, barselona);

//        System.out.printf(realMadrid.toString());
//        System.out.printf(barselona.toString());

        League_Table<Football> football_league = new League_Table<>("Football league");
        football_league.addTeam(realMadrid);
        football_league.addTeam(barselona);
        football_league.addTeam(arsenal);
        football_league.addTeam(sherif);
        football_league.addTeam(sherif);

        football_league.league.stream().sorted(Comparator.comparing(x->x.rank)).forEach(System.out::print);

    } // end main
}
