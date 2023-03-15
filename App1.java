import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.Popup;
import javax.swing.SwingUtilities;

public class App1{
	private static JFrame frame;
	private static JPanel paneL;
	private static JLabel nameLabel,natLabel,dateLabel,sexLabel;
	private static JRadioButton maleRadio,femaleRadio;
	private static JButton submit_btn,reset_btn;
	private static JTextField nameField,natField,dateField;
	private static String sex_msg;

public static void main (String[] args) {
    SwingUtilities.invokeLater(new Runnable(){
        public void run(){
        	creatandshowgui();
        };
    });	
	
	
	
}
public static void creatandshowgui(){
    frame = new JFrame();
    frame.setTitle("DeskApp");
    frame.setSize(900,900);
    frame.setVisible(true);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setMinimumSize(new Dimension(500,500));
    
    paneL = new JPanel();
    paneL.setLayout(null);
    frame.add(paneL);
    
    nameLabel = new JLabel();
    nameLabel.setForeground(Color.BLUE);
    nameLabel.setFont(new Font("Times",Font.BOLD,20));
    nameLabel.setText("Name : ");
    
    nameLabel.setBounds(10,0,200,30);
    paneL.add(nameLabel);
    
    nameField = new JTextField();
    nameField.setBounds(220,10,200,30);
    nameField.setToolTipText("input your name");
    paneL.add(nameField);
  //------------------------
    natLabel = new JLabel();
    natLabel.setForeground(Color.MAGENTA);
    natLabel.setFont(new Font("Comic Sans",Font.BOLD,20));
    natLabel.setText("Nationality : ");
    natLabel.setBounds(10,50,200,40);
    paneL.add(natLabel);
    
    natField = new JTextField();
    natField.setBounds(220,60,200,30);
    natField.setToolTipText("Please input your nationality");
    paneL.add(natField);
  //------------------------
    dateLabel = new JLabel();
    dateLabel.setForeground(Color.MAGENTA);
    dateLabel.setFont(new Font("Comic Sans",Font.BOLD,20));
    dateLabel.setText("date : ");
    dateLabel.setBounds(10,100,200,40);
    paneL.add(dateLabel);
    
    dateField = new JTextField();
    dateField.setBounds(220,110,200,30);
    dateField.setToolTipText("Please input your Birthday");
    paneL.add(dateField);
    //------------------------
    sexLabel = new JLabel("Gender");
    sexLabel.setForeground(Color.BLUE);
    sexLabel.setFont(new Font("Times",Font.BOLD,20));
    sexLabel.setBounds(10,150,200,30);
    paneL.add(sexLabel);
    maleRadio = new JRadioButton("Male",false);
    maleRadio.setBounds(220,150,100,30);
    paneL.add(maleRadio);
    femaleRadio = new JRadioButton("Female",false);
    femaleRadio.setBounds(330,150,100,30);
    paneL.add(femaleRadio);
    ButtonGroup buttonGroup = new ButtonGroup();
    buttonGroup.add(maleRadio);
    buttonGroup.add(femaleRadio);
  //------------------------
    submit_btn = new JButton("Submit");
    submit_btn.setBounds(90,200,100,30);
    paneL.add(submit_btn);
    submit_btn.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(maleRadio.isSelected()){
				sex_msg="male";
			}
			else if(femaleRadio.isSelected()){ 
				sex_msg = "female";
			}

		String msg = String.format("Name : %s \n Nationality : %s\nDate : %s\n Sex : %s\n", nameField.getText(),natField.getText(),dateField.getText(),sex_msg);
           JOptionPane.showMessageDialog(frame,msg,"Popup info",JOptionPane.INFORMATION_MESSAGE);
		}
    	
    });
    
    
    
    frame.pack();
  }

}