package homework;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View3 extends JFrame implements ActionListener{
	
	JLabel viewLabel;

	public View3(){
		super("View");
		//createViewFrame(this);
		this.setContentPane(createViewPanel());
		this.setLocation(400, 410);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(650, 180);
		this.setVisible(false);
		
        JPanel viewPanel = new JPanel();
		viewPanel.setLayout(null);
        this.viewLabel = new JLabel();
		this.viewLabel.setForeground(Color.black);
		this.viewLabel.setLocation(250,50);
		this.viewLabel.setSize(400, 50);
		viewPanel.add(this.viewLabel);
		
		this.setContentPane(viewPanel);
	}


	private JPanel createViewPanel(){
		JPanel viewPanel = new JPanel();
		return viewPanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
