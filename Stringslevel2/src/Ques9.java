import java.util.Scanner;

public class Ques9 {
    public static String getComputerChoice() {
        int n = (int)(Math.random() * 3);
        if (n == 0) return "rock";
        if (n == 1) return "paper";
        return "scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) {
            return "user";
        }
        return "computer";
    }

    public static String[][] playGames(int games, Scanner sc) {
        String[][] results = new String[games + 1][3];
        int userWins = 0, compWins = 0;
        for (int i = 0; i < games; i++) {
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = findWinner(user, comp);
            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) compWins++;
            results[i][0] = user;
            results[i][1] = comp;
            results[i][2] = winner;
        }
        results[games][0] = "User%";
        results[games][1] = "Computer%";
        double total = userWins + compWins;
        if (total == 0) total = 1;
        results[games][2] = String.format("%.2f / %.2f", (userWins * 100.0 / total), (compWins * 100.0 / total));
        return results;
    }

    public static void display(String[][] arr) {
        System.out.printf("%-10s %-10s %-10s%n", "User", "Computer", "Winner");
        for (String[] row : arr) {
            if (row[0] != null) {
                System.out.printf("%-10s %-10s %-10s%n", row[0], row[1], row[2]);
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int games = sc.nextInt();
            String[][] res = playGames(games, sc);
            display(res);
        }
    }
}
