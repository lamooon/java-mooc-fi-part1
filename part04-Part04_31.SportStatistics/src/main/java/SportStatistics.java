
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        ArrayList<Team> teams = readFile(file);
        int gamesPlayed = 0;
        int win = 0;
        int lose = 0;
        for (Team eachTeam : teams) 
        {
            //part 1
            String homeTeam = eachTeam.getHomeTeam();
            String awayTeam = eachTeam.getAwayTeam();
            int homePoints = eachTeam.getHomePoints();
            int awayPoints = eachTeam.getAwayPoints();
            if (homeTeam.equals(team) || awayTeam.equals(team))
            {
                gamesPlayed++;
            }

            //part 2
            if ((homeTeam.equals(team) && homePoints > awayPoints) || (awayTeam.equals(team) && awayPoints > homePoints))
            {
                win++;
            }
            else if ((homeTeam.equals(team) && homePoints < awayPoints) || (awayTeam.equals(team) && awayPoints < homePoints))
            {
                lose++;
            }
        }
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);
    }
    public static ArrayList<Team> readFile(String file) {

        ArrayList<Team> team = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) 
        {
            while (scanner.hasNextLine()) 
            {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                team.add(new Team(parts[0], parts[1], Integer.valueOf(parts[2]), Integer.valueOf(parts[3])));
            }
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        return team;

    }
}
