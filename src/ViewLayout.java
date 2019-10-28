
	import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

	public class ViewLayout {
		public JFrame window;
		public JPanel panel;
		public JTextField textFieldX;
		public JTextField textFieldY;
		public JTextField textFieldS;
		public JTextField textFieldP;
		public JButton tapButton;
		
		public ViewLayout() {
		//TASK 1: Create views: swing UI Ccomponents
			textFieldX = new JTextField(20);
			textFieldX.setEditable(true);
			textFieldY = new JTextField(20);
			textFieldY.setEditable(true);
			textFieldS = new JTextField(20);
			textFieldP = new JTextField("+");
			textFieldP.setEditable(false);
			textFieldS.setEditable(false);
			tapButton = new JButton("=");
		//TASK 2: Place the UI components in a panel.
			panel = new JPanel(new GridLayout(5,0));
			panel.add(textFieldX);
			panel.add(textFieldP);
			panel.add(textFieldY);
			panel.add(tapButton);
			panel.add(textFieldS);
			panel.setBackground(Color.CYAN);
			
		//TASK 3: Add the panel to a window and make it visible
			window = new JFrame("MVC Demo Tap Button");
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.add(panel);
			window.pack();
			window.setVisible(true);
		
		}
	}

