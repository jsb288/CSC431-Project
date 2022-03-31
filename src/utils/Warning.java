package utils;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Warning {

	
public static void warn(String s) {
		
		JFrame frame = new JFrame();
		
		JOptionPane.showMessageDialog(frame, s, "Note", 
				JOptionPane.INFORMATION_MESSAGE);
		
		
	}
	
}
