import java.util.Scanner;

public class RockPaperScissors {

    static String computerChoice() {

        int n = (int) (Math.random() * 3);

        if (n == 0) return "Rock";
        if (n == 1) return "Paper";

        return "Scissors";
    }

    static String winner(String user, String computer) {

        if (user.equals(computer))
            return "Draw";

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
                (user.equals("Paper") && computer.equals("Rock")) ||
                (user.equals("Scissors") && computer.equals("Paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        System.out.println("User\tComputer\tWinner");

        for (int i = 0; i < games; i++) {

            String user = sc.next();
            String computer = computerChoice();

            String result = winner(user, computer);

            if (result.equals("User"))
                userWins++;
            else if (result.equals("Computer"))
                computerWins++;

            System.out.println(user + "\t" + computer + "\t\t" + result);
        }

        double userPercent = (userWins * 100.0) / games;
        double computerPercent = (computerWins * 100.0) / games;

        System.out.println("\nUser Wins = " + userWins);
        System.out.println("Computer Wins = " + computerWins);

        System.out.println("User Win % = " + userPercent);
        System.out.println("Computer Win % = " + computerPercent);
    }
}