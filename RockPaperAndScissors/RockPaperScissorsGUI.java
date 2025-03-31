import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RockPaperScissorsGUI extends JFrame implements ActionListener {
    JButton rockButton, paperButton, scissorButton;
    JLabel computerChoiceLabel, computerScoreLabel, playerScoreLabel;
    RockPaperScissors rockPaperScissors;

    RockPaperScissorsGUI() {
        super("Rock Paper Scissors");
        setSize(450, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        rockPaperScissors = new RockPaperScissors();
        addGuiComponents();
    }

    private void addGuiComponents() {
        computerScoreLabel = new JLabel("Computer: 0");
        computerScoreLabel.setBounds(0, 43, 450, 30);
        computerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26));
        computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(computerScoreLabel);

        computerChoiceLabel = new JLabel("?");
        computerChoiceLabel.setBounds(175, 118, 98, 81);
        computerChoiceLabel.setFont(new Font("Dialog", Font.BOLD, 26));
        computerChoiceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        computerChoiceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(computerChoiceLabel);

        playerScoreLabel = new JLabel("Player: 0");
        playerScoreLabel.setBounds(140, 317, 150, 30);
        playerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26));
        playerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(playerScoreLabel);

        rockButton = new JButton("Rock");
        rockButton.setBounds(40, 370, 105, 81);
        rockButton.setFont(new Font("Dialog", Font.BOLD, 16));
        rockButton.addActionListener(this);
        add(rockButton);

        paperButton = new JButton("Paper");
        paperButton.setBounds(160, 370, 105, 81);
        paperButton.setFont(new Font("Dialog", Font.BOLD, 16));
        paperButton.addActionListener(this);
        add(paperButton);

        scissorButton = new JButton("Scissors");
        scissorButton.setBounds(280, 370, 105, 81);
        scissorButton.setFont(new Font("Dialog", Font.BOLD, 16));
        scissorButton.addActionListener(this);
        add(scissorButton);
    }

    private void showDialog(String message) {
        JDialog resultDialog = new JDialog(this, "Result", true);
        resultDialog.setSize(250, 150);
        resultDialog.setLayout(new BorderLayout());

        JLabel resultLabel = new JLabel(message, SwingConstants.CENTER);
        resultLabel.setFont(new Font("Dialog", Font.BOLD, 16));
        resultDialog.add(resultLabel, BorderLayout.CENTER);

        JButton tryAgainButton = new JButton("Try Again");
        tryAgainButton.addActionListener(e -> {
            computerChoiceLabel.setText("?");
            resultDialog.dispose();
        });

        resultDialog.add(tryAgainButton, BorderLayout.SOUTH);
        resultDialog.setLocationRelativeTo(this);
        resultDialog.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String playerChoice = e.getActionCommand();
        String result = rockPaperScissors.playRockPaperScissors(playerChoice);
        
        computerChoiceLabel.setText(rockPaperScissors.getComputerChoice());
        computerScoreLabel.setText("Computer: " + rockPaperScissors.getComputerScore());
        playerScoreLabel.setText("Player: " + rockPaperScissors.getPlayerScore());
        
        showDialog(result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RockPaperScissorsGUI().setVisible(true));
    }
}
