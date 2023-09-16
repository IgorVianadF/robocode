package meupacote;
import robocode.*;
import java.awt.Color;
public class RadarBot extends AdvancedRobot {
int gunDirection = 1;

  public void run() {
  setColors(Color.white,Color.darkGray,Color.gray,Color.green,Color.blue);
    while (true) {
      turnGunLeft(360);
    }
  }

  public void onScannedRobot(ScannedRobotEvent e){//Se o robô estiver a menos de 100px segui-lo e atirar
		if (e.getDistance() < 100) {
           setTurnRight(e.getBearing());
    	setFire(3);
    	setAhead(50);
    	gunDirection = -gunDirection;
    	execute();
       } else { //se estiver a mais de 100px tentar se aproximar
		   setTurnRight(e.getBearing());
		   setAhead(100);
           setFire(1);
		   execute();
   		}
	}
 
  public void onHitByBullet(HitByBulletEvent e){ //Evitar balas
	turnLeft(45);
	ahead(50);
	}
	
  public void onHitRobot(HitRobotEvent e){//Caso encontrar um robô, atirar com 10* a força
		setTurnRight(e.getBearing());
		setFire(10);
		execute();
	}
	
}
