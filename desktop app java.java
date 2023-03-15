import javax.swing.Jwindow;
import javax.swing.SwingUtilities;
import javax.swing.JRadioButton;
import javax.swing.Jpanel;
import javax.swing.Jboutton;
import javax.swing.Jlabel;

public class AppDesk {
    private static Jwindow frame;
    private static Jpanel panel;
    private static Jlabel nameLabel,natLabel,dateLabel,sexLabel;
    private static JRadioButton maleButton,femaleButton;
    private static Jboutton submit_btn,reset_btn;
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                windowapp();
            };
        });
    }
    public static void windowapp(){
      frame = newTframe();
      frame.setTitle("DeskApp");
      frame.setSize(900,900);
      frame.setVisible(true);

      frame.pack();
    }
}