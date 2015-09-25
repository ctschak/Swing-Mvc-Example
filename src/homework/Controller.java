package homework;

public class Controller {
	private Model model;
	private View view;
	
	public Controller(Model model, View view){
		this.model = model;
		this.view = view;
		this.view.updateModel(this.model);
	}

	public void updateText(String text){
		this.model.setText(text);
		updateView3All(this.model);
	}
	public void updateColor(String color){
		this.model.setColor(color);
		updateView3All(this.model);
	}
	public void updateFontSize( int fontSize){
		this.model.setFontSize(fontSize);
		updateView3All(this.model);
	}
	
	private void updateView3All(Model model){
		this.view.updateView3(model.getText(), model.getColor(), model.getFontSize());
	}
	
}
