package Udemy_java_the_complete_java_developer_course;

public abstract class Team<T> {
    String name;
    int rank;
    int wins;
    int loses;
    int draws;

    public Team(String name) {
        this.name = name;
    }

    public void ranking(int ourScore, int rivalScore, Team rival) {
        if (ourScore > rivalScore) {
            wins++;
            rival.loses++;
        } else if (ourScore < rivalScore) {
            loses++;
            rival.wins++;
        } else {
            draws++;
            rival.draws++;
        }
        rank =  wins * 3 + draws * 1;
        rival.rank = rival.wins * 3 + rival.draws * 1;

    } // end ranking

    @Override
    public String toString() {
        return String.format("\n%-15s has %d points with %d wins; %d loses and %d draws", name, rank, wins, loses, draws);
    }
}

