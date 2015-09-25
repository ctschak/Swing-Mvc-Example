package homework;

import javax.swing.SwingUtilities;

public class HomeWorkDemo{
	public static void main(String[] args) {
		
		
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		    	Model model = new Model();
		    	View view = new View();
				Controller controller = new Controller(model,view);
		    	view.registerObserver(controller);
		    }
		});
		
	}
	
}
