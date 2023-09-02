
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.util.Random;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;
public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		Robot rob = new Robot();

		rob.penDown();
		rob.setSpeed(20);
		while(true) {
		int count = 0;
		while(count<4) {
    		rob.move(150);
    		rob.turn(90);
    		count += 1;
    	}
		rob.setPenWidth(10);
		String color = JOptionPane.showInputDialog("choose a color !");
		if(color.equals("blue")) {
			rob.setPenColor(0,0,255);
		}
		else if(color.equals("red")) {
			rob.setPenColor(255, 0, 0);
		}
		else if(color.equals("yellow")) {
			rob.setPenColor(0, 255, 0);
		}
		else {
			Random rand = new Random();
			Random rand2 = new Random();
			Random rand3 = new Random();
			rob.setPenColor(rand.nextInt(256), rand2.nextInt(256), rand3.nextInt(256));
		}
		


		}
	}
}
