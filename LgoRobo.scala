package chamberconf

import robocode._;
import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt._

class Furia extends Robot {

  override def run: Unit = {
    setBodyColor(Color.pink);
    setGunColor(Color.black);
    setRadarColor(Color.orange);
    setBulletColor(Color.cyan);
    setScanColor(Color.pink);

    while(true) {
      turnGunLeft(360)
      scan()
      ahead(40)
    }

  }

  override def onHitWall(ev: HitWallEvent) = {
    back(10)
    turnLeft(90)
  }

  override def onHitRobot(ev: HitRobotEvent) =  {  }

  override def onScannedRobot(ev: ScannedRobotEvent) = {
    fire(2)
  }
}
