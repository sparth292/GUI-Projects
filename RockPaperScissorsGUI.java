import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class RockPaperScissorsGUI extends JFrame {
   RockPaperScissorsGUI(){
    super("Rock Paper And Scissors");
    setSize(450,500);
    setLayout(null);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    addGuiComponents();
   }
   private void addGuiComponents(){

    JLabel computerScoreLabel = new JLabel("Computer : 0");
    computerScoreLabel.setBounds(0,43,450,30);
    computerScoreLabel.setFont(new Font("Dialog" , Font.BOLD , 26));
    computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
    
    add(computerScoreLabel);
   
    JLabel computerChoice = new JLabel("?");
    computerChoice.setBounds(175,118,98,81);    
    computerChoice.setFont(new Font("Dialog" , Font.BOLD , 26));
    computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
    computerScoreLabel.setVerticalAlignment(SwingConstants.CENTER);
    computerChoice.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    computerChoice.setHorizontalAlignment(SwingConstants.CENTER);
    add(computerChoice);

}
}
