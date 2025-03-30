import javax.swing.SwingUtilities;

class App{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                RockPaperScissorsGUI rockPaperScissorsGUI = new RockPaperScissorsGUI();
                rockPaperScissorsGUI.setVisible(true);
            }
        });
    }
}