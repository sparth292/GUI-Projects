import java.util.Random;

public class RockPaperScissors {
    private static final String[] computerChoices = {"Rock", "Paper", "Scissors"};
    private Random random;
    private String computerChoice;
    private int computerScore, playerScore;

    public RockPaperScissors() {
        random = new Random();
    }

    public int getComputerScore() {
        return computerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public String playRockPaperScissors(String playerChoice) {
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        if (playerChoice.equals(computerChoice)) {
            return "Draw";
        }

        if ((playerChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
            (playerChoice.equals("Paper") && computerChoice.equals("Rock")) ||
            (playerChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            playerScore++;
            return "Player Wins";
        } else {
            computerScore++;
            return "Computer Wins";
        }
    }
}
