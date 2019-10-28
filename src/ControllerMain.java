import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerMain {

	//task 1: specify the elements for this app.
	private static Adder model;
	private static ViewLayout view;
	
	public static void main(String[] args) {
		//task 2: create the model and view
		model = new Adder();
		view = new ViewLayout();
		
		
		//task 3: add a listener event to a button
		/* view.tapButton.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//model.x = Integer.parseInt(view.textFieldX.getText());
				//model.y = Integer.parseInt(view.textFieldY.getText());
				updateModel();
				updateView();
			}
		});*/
	}

	private static void updateView() {
		view.textFieldS.setText(Integer.toString(model.getValue()));
	}
	
	//updateModel()
	private static void updateModel() {
		model.x = Integer.parseInt(view.textFieldX.getText());
		model.y = Integer.parseInt(view.textFieldY.getText());
		
		
		
		//view.textFieldS.setText(Integer.toString(model.getValue()));
	}
}

