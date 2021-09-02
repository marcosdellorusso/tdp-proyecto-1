package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
		
		int lu = 121717;
		String lastName = "Dello Russo";
		String firstName = "Marcos Ezequiel";
		String mail = "marcosdellorusso@live.com.ar";
		String githubURL = "https://github.com/marcosdellorusso";
		
		String pathPhoto = "file:///C:/Users/Marcos/Desktop/Proyecto%201%20TdP/proyecto-1/src/images/tdp.png";
		
		Student marcos = new Student(lu, lastName, firstName, mail,githubURL, pathPhoto);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	SimplePresentationScreen frame = new SimplePresentationScreen(marcos);
            	frame.setVisible(true);
            }
        });
	}
    
}