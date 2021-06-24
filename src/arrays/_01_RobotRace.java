package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	
	Robot[] robots = new Robot[5];
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.
for (int i = 0; i < robots.length; i++) {
	robots[i] = new Robot();
	robots[i].setSpeed(100);
	robots[i].setY(500);
	robots[i].setX((i+1)*100);
}
		//4. make each robot start at the bottom of the screen, side by side, facing up

Random ran = new Random();
for (int d = 0; d < 50; d++) {
	for (int f = 0; f < robots.length; f++) {
		int b = ran.nextInt(50);
		robots[f].move(b);
		if(robots[f].getY()>500) {
			d+=50;
		}
	}
}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}