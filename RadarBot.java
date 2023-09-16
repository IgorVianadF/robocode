package meupacote;
import robocode.*;
import java.awt.Color;
public class RadarBot extends Robot {
	public void run(){
		
		
		setColors(Color.white,Color.darkGray,Color.gray,Color.green,Color.blue);
		while(true){
			ahead(200);
			turnGunLeft(360);
				}
			}
	public void	onScannedRobot(ScannedRobotEvent e){
		if (e.getDistance() < 100) {
           fire(1);
       } else {
           fire(3);
       }		
	}
	
	public void onHitByBullet(HitByBulletEvent e){
			turnLeft(45);
			ahead(50);
	}
	
	public void onHitRobot(HitRobotEvent e){
		turnRight(90);
		ahead(100);
	}
	public void onHitWall(HitWallEvent e){
		turnLeft(90);
		ahead(200);
	}
}
