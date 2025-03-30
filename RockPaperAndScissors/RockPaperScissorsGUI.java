import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class RockPaperScissorsGUI extends JFrame {
       // playerButtons
       JButton rockButton , paperButton , scissorButton;
       JLabel computerChoice;
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
   
    computerChoice = new JLabel("?");
    
    computerChoice.setBounds(175,118,98,81);    
    computerChoice.setFont(new Font("Dialog" , Font.BOLD , 26));
    
    computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
    computerScoreLabel.setVerticalAlignment(SwingConstants.CENTER);
    
    computerChoice.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    computerChoice.setHorizontalAlignment(SwingConstants.CENTER);
    
    add(computerChoice);
    
    JLabel playerScoreLabel = new JLabel("Player : 0"); 
    
    playerScoreLabel.setBounds(140,317,150,30);
    playerScoreLabel.setFont(new Font("Dialog" , Font.BOLD , 26));
    playerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
    
    add(playerScoreLabel);
  
    rockButton = new JButton("Rock");
    rockButton.setBounds(40,370,105,81);
    rockButton.setFont(new Font("Dialog" , Font.BOLD , 16));
    add(rockButton);

    paperButton = new JButton("Paper");
    paperButton.setBounds(160,370,105,81);
    paperButton.setFont(new Font("Dialog" , Font.BOLD , 16));
    add(paperButton);

    scissorButton = new JButton("Scissor");
    scissorButton.setBounds(280,370,105,81);
    scissorButton.setFont(new Font("Dialog" , Font.BOLD , 16));
    add(scissorButton);
    
    rockButton.addActionListener(e -> showDialog("You chose Rock!"));
    paperButton.addActionListener(e -> showDialog("You chose Paper!"));
    scissorButton.addActionListener(e -> showDialog("You chose Scissors!"));

    

}


private void showDialog(String message){
     JDialog resultDialog = new JDialog(this,"Result", true);
     resultDialog.setSize(227,124);
     resultDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
     resultDialog.setResizable(false);
     resultDialog.setLayout(null);

     JLabel resultLabel = new JLabel(message);
        resultLabel.setFont(new Font("Dialog", Font.BOLD, 16));
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resultLabel.setBounds(10, 10, 200, 50);
        resultDialog.add(resultLabel);

        resultDialog.setLocationRelativeTo(this);
        resultDialog.setVisible(true);

        JButton tryAgainButton = new JButton("Try Again?");
        tryAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                   computerChoice.setText("?");
                   resultDialog.dispose();
            }
        });

        resultDialog.add(tryAgainButton);

        resultDialog.setLocationRelativeTo(this);
        resultDialog.setVisible(true);
    }     

}
