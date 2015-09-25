package homework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class View2 extends JFrame implements ActionListener{
	JLabel textLabel, colorLabel,sizeLabel;
	JTextField textField;
	JComboBox comboBox;
	JSpinner spinner;
	//Color[] colorArray = { Color.black,Color.blue,Color.red };
	String[] colorStrArray= {"BLACK","BLUE","RED"};
	SpinnerModel spinnerModel = new SpinnerNumberModel(12,12,48,12);
	View3 view3;
	Controller controller;
	
	public View2(){
		super("Controller");
		createControllerFrame(this);
		//this.view3 =view3;
	}
	private void createControllerFrame(JFrame frame){
		frame.setContentPane(createControllerPane());
        frame.setLocation(550, 260);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 125);
        frame.setVisible(false);
	}
	
	private JPanel createControllerPane(){
		
		JPanel ctrlPane = new JPanel();
		ctrlPane.setLayout(null);
        
		textLabel = new JLabel("Text");
		textLabel.setLocation(0,0);
		textLabel.setSize(70, 40);
		textLabel.setHorizontalAlignment(4);
		ctrlPane.add(textLabel);
		
		colorLabel = new JLabel("Color");
		colorLabel.setLocation(0,30);
		colorLabel.setSize(70, 40);
		colorLabel.setHorizontalAlignment(4);
		ctrlPane.add(colorLabel);
		
		sizeLabel = new JLabel("Size");
		sizeLabel.setLocation(0,60);
		sizeLabel.setSize(70, 40);
		sizeLabel.setHorizontalAlignment(4);
		ctrlPane.add(sizeLabel);
		
		textField = new JTextField(20);
		textField.setLocation(100, 5);
		textField.setSize(200, 30);
		ctrlPane.add(textField);
		textField.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent ke)
	        {
	            if(!(ke.getKeyChar()==27||ke.getKeyChar()==65535))//this section will execute only when user is editing the JTextField
	            {
	            	//view3.updateViewPanel(textField.getText());
	            	//System.out.println("text field");
	            	//updateText(textField.getText());
	            }
	        }
		});
		
		comboBox = new JComboBox<String>(colorStrArray);
		comboBox.setLocation(100, 35);
		comboBox.setSize(200, 30);
		ctrlPane.add(comboBox);
        
		spinner = new JSpinner(spinnerModel);
		spinner.setLocation(100, 65);
		spinner.setSize(200, 30);
		ctrlPane.add(spinner);
        return ctrlPane;
        
		
		
	}
	public void registerObserver(Controller controller) {
        this.controller = controller;
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("inside View2");
		if (e.getSource() == textField) {
			System.out.println("text field");
			this.controller.updateText(this.textField.getText());
			
		}else if(e.getSource() == comboBox){
			System.out.println("comboBox");
			this.controller.updateColor(this.comboBox.getName());
		}else if(e.getSource() == spinner){
			this.controller.updateFontSize((Integer)this.spinner.getValue());
		}
		
	}
	

}
