package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {
		
		// START HERE
	Robot banana = new Robot();
	banana.setSpeed(200 );
	banana.setPenColor(Color.RED);
	banana.penDown();
	for(int i=0;i < 4;i++) {
		banana.move(100);
		banana.turn(90);
	}
	
		
		
	}
}