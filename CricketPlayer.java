package assament;

import java.util.Scanner;

class Player {
    int pid;
    String pname;
    int totalRuns;
    int inningsPlayed;
    int notOutTimes;

    Player(int pid, String pname, int totalRuns, int inningsPlayed, int notOutTimes) {
        this.pid = pid;
        this.pname = pname;
        this.totalRuns = totalRuns;
        this.inningsPlayed = inningsPlayed;
        this.notOutTimes = notOutTimes;
    }

    double calculateAverage() {
        return (double) totalRuns / (inningsPlayed - notOutTimes);
    }
}

public class CricketPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int n = scanner.nextInt();
        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter player ID, Name, Total Runs, Innings Played, Not Out Times for player " + (i+1) + ": ");
            int pid = scanner.nextInt();
            String pname = scanner.next();
            int totalRuns = scanner.nextInt();
            int inningsPlayed = scanner.nextInt();
            int notOutTimes = scanner.nextInt();
            players[i] = new Player(pid, pname, totalRuns, inningsPlayed, notOutTimes);
        }

        Player maxAveragePlayer = players[0];
        for (Player player : players) {
            if (player.calculateAverage() > maxAveragePlayer.calculateAverage()) {
                maxAveragePlayer = player;
            }
        }

        System.out.println("Player with maximum average: " + maxAveragePlayer.pname + ", Average: " + maxAveragePlayer.calculateAverage());
}
}
