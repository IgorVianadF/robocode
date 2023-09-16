package meupacote;

import robocode.*;
import java.awt.Color;

public class RadarBot extends AdvancedRobot {

	public void run() {
		setColors(Color.white, Color.darkGray, Color.gray, Color.green, Color.blue);
		while (true) {
			turnGunLeft(360);
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {// Se o robô estiver a menos de 100px segui-lo e atirar com 1x o
														// poder
		if (e.getDistance() < 100) {
			setTurnRight(e.getBearing() * 10);
			setFire(1);
			setAhead(50);
			execute();
		} else { // se estiver a mais de 100px tentar se aproximar, atirar 3x o poder
			setTurnRight(e.getBearing());
			setAhead(100);
			setFire(3);
			execute();
		}
	}

	public void onHitByBullet(HitByBulletEvent e) { // Evitar balas
		setTurnLeft(60);
		setAhead(100);
		execute();
	}

	public void onHitWall(HitWallEvent e) { // Evitar bater na parede
		turnLeft(90);
		ahead(100);
	}

	public void onHitRobot(HitRobotEvent e) {// Caso encontrar um robô, atirar com 10* a força
		setTurnRight(e.getBearing());
		setFire(10);
		execute();
	}

}
