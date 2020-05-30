import java.awt.*;
import javax.swing.*;

public class Dealership extends JFrame {
 
 private JLabel head;	
 public Dealership()
 {
	 setTitle("Car DealerShip");
		setSize(700, 700);
		setLayout(new BorderLayout());
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		createContents();
		setVisible(true);
 }
 private void createContents() {
	head  = new JLabel("Welcome to the DealerShip");     //Header label
	head.setHorizontalAlignment(SwingConstants.CENTER);
	this.add(head,BorderLayout.NORTH);
	
	JPanel panel = new JPanel();               //Center Panel for search boxes
	add(panel, BorderLayout.CENTER);
	
	JPanel panelRight = new JPanel();  
	add(panelRight, BorderLayout.EAST);
	panelRight.add(new JButton("Login"));

	JButton colorS = new JButton("Search By Color");

	JButton modelS = new JButton("Search By Model");
	JButton l = new JButton("");
	JLabel  msg = new JLabel("Searching by: ");
	msg.setBounds(500, 500,100,100);
	panel.add(colorS);
	panel.add(modelS);
	panel.add(msg);
    
 

	 
 }
}


