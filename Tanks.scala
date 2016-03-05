package rabbit

import robocode.HitRobotEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt._

class NothingTank extends Robot {

  override def run: Unit = {  }

  override def onHitRobot(ev: HitRobotEvent) =  {  }

  override def onScannedRobot(ev: ScannedRobotEvent) = {}
}

class CallMeFashionTank extends Robot {

  override def run: Unit = {
    setBodyColor(Color.pink);
    setGunColor(Color.black);
    setRadarColor(Color.orange);
    setBulletColor(Color.cyan);
    setScanColor(Color.pink);
  }

  override def onHitRobot(ev: HitRobotEvent) =  {  }

  override def onScannedRobot(ev: ScannedRobotEvent) = {  }
}

