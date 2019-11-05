package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class robotgraffiti {
	public static void main(String[] args) {
		Robot billy=new Robot();
		billy.penDown();
		billy.move(100);		
		billy.turn(90);
		for(int i=0;i<180;i++) {
     	billy.move(1);
     	billy.turn(1);
		}
	}
}
	
