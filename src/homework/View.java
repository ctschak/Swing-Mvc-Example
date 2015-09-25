package homework;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JFrame implements ActionListener{
	JButton showController, showView;
	private Controller controller;
	private View2 view2;
	private View3 view3;
	private Model model;
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == showController) {
			updateView2();
            if (!view2.isVisible())
            	view2.setVisible(true);
            else
            	view2.setVisible(false);
        }
		if (e.getSource() == showView) {
			if(view3 == null) {this.view3 = new View3(); } 
			updateView2toView3();
            if (!view3.isVisible()){
            	view3.setVisible(true);
            	if(this.view2.textField.getText().trim().length() == 0){
    				this.view3.viewLabel.setText("Hello!");
    			}
            }else{
            	view3.setVisible(false);
            	
            }
        }
	}
	
	public View(){
		super("MVC DEMO");
		createDemoFrame(this);
	}
	
	private void createDemoFrame(JFrame frame) {

        frame.setContentPane(createDemoPane());
        frame.setLocation(500, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 80);
        frame.setVisible(true);
    }
	
	
	private JPanel createDemoPane(){
		
		JPanel demoGUI = new JPanel();
		demoGUI.setLayout(null);
        
		showController = new JButton("Show Controller");
		showController.setLocation(20, 15);
		showController.setSize(250, 30);
		showController.addActionListener(this);
		demoGUI.add(showController);
        
        showView = new JButton("Show View");
        showView.setLocation(280,15);
        showView.setSize(150, 30);
        showView.addActionListener(this);
        demoGUI.add(showView);
        
        return demoGUI;
	}
	
	public void registerObserver(Controller controller) {
        this.controller = controller;
    }
	public void updateModel(Model model){
		this.model = model;
	}

	public void updateView2(){
		this.view2 = new View2();
		this.view2.registerObserver(this.controller);
	}
	public void updateView3(String text, String color, int fontSize){
		//this.view3 = new View3();
		this.view3.viewLabel.setText(text);
		this.view3.viewLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, fontSize));
		this.view3.viewLabel.setForeground(ColorEnum.valueOf(color).getColor());
		//this.view3.viewLabel.setForeground(Color.getColor(color));
		this.view2.view3 = view3;
	}
	public void updateView2toView3(){
		updateView3(this.view2.textField.getText(),
				this.view2.comboBox.getSelectedItem().toString(),(Integer)this.view2.spinner.getValue());
	}
}
