package CookieClicker;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CookieClickerGUI extends JFrame{
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    
    ImageIcon i1 = new ImageIcon(new ImageIcon("D:\\parth\\Desktop\\GUI-Projects\\CookieClicker\\cookieIMG.png").getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH));
    
    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel("Cookie Clicker");
    JLabel l3 = new JLabel("Clicks :");
    JTextField t1 = new JTextField("0",4);
    
    JButton b1 = new JButton(new ImageIcon(new ImageIcon("D:\\parth\\Desktop\\GUI-Projects\\CookieClicker\\cookieIMG.png").getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    JButton b2 = new JButton("Reset");

    CookieClickerGUI(){
        l2.setFont(new Font("", Font.PLAIN, 20));
        l1.setIcon(i1);
        
        t1.setEditable(false);

        p1.add(l1);
        p1.add(l2);
        
        p1.setBackground(Color.CYAN);
        p1.setBounds(12,12,250,80);
        p1.setVisible(true);

        p2.add(l3);
        p2.add(t1);
        
        p2.setBounds(12,370,245,30);
        p2.setVisible(true);

        b1.setBounds(12,100,250,250);

        b2.setBounds(81,420,100,30);

        b1.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  t1.setText(Integer.toString(Integer.parseInt(t1.getText()) + 1));
              }
          });
        
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                t1.setText("0");       
            }
        });

        this.add(p1);
        this.add(b1);
        this.add(p2);
        this.add(b2);
        
        this.setTitle("Cookie Clicker");
        this.setLayout(null);
        this.setSize(290,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
    
    }
   
}
