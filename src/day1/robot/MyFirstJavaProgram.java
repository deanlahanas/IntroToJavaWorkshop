package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot dean=new Robot();
dean.setSpeed(10);
dean.penDown();
dean. move(200);
dean.turn(90);
dean.move(200);
dean.turn(90);
dean.move(200);
dean.setSpeed(10);

for (int i = 0; i < 3; i++) {
dean.turn(360/3);
dean.move(200);	
}
	}
}
